package app.web.drjackycv.data.bitz.datasource

import app.web.drjackycv.data.bitz.entity.BitzResponseFactory.Companion.providesBitzResponse
import app.web.drjackycv.data.bitz.remote.BitzApi
import app.web.drjackycv.data.extension.assertGeneralsSuccess
import app.web.drjackycv.data.extension.getSingleResultSuccess
import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class BitzRemoteDataSourceUnitTest {

    private lateinit var bitzRemoteDataSource: BitzRemoteDataSource

    @Mock
    private lateinit var bitzApi: BitzApi

    @Before
    fun setUp() {
        bitzRemoteDataSource = BitzRemoteDataSource(bitzApi)
    }

    @Test
    fun `getBitz should return a bitz`() {
        whenever(bitzApi.getBitz())
            .doReturn(getSingleResultSuccess(providesBitzResponse()))

        val testObserver = bitzRemoteDataSource.getBitz().test()

        testObserver.assertGeneralsSuccess {
            it != null
        }
    }

}