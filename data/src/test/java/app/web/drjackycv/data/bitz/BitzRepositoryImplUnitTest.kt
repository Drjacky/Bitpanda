package app.web.drjackycv.data.bitz

import app.web.drjackycv.data.bitz.datasource.BitzRemoteDataSource
import app.web.drjackycv.data.bitz.entity.BitzFactory.Companion.providesBitz
import app.web.drjackycv.data.bitz.repository.BitzRepositoryImpl
import app.web.drjackycv.data.extension.assertGeneralsError
import app.web.drjackycv.data.extension.assertGeneralsSuccess
import app.web.drjackycv.data.extension.getSingleError
import app.web.drjackycv.data.extension.getSingleResultSuccess
import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class BitzRepositoryImplUnitTest {

    private lateinit var bitzRepositoryImpl: BitzRepositoryImpl

    @Mock
    private lateinit var bitzRemoteDataSource: BitzRemoteDataSource

    @Before
    fun setUp() {
        bitzRepositoryImpl = BitzRepositoryImpl(bitzRemoteDataSource)
    }

    @Test
    fun `getBitz should return a bitz`() {
        whenever(bitzRemoteDataSource.getBitz())
            .thenReturn(getSingleResultSuccess(providesBitz()))

        val testObserver = bitzRemoteDataSource.getBitz().test()

        testObserver.assertGeneralsSuccess {
            it != null
        }
    }

    @Test
    fun `getBitz should not return a bitz in case of an error`() {
        whenever(bitzRemoteDataSource.getBitz())
            .doReturn(getSingleError())

        val testObserver = bitzRemoteDataSource.getBitz().test()

        testObserver.assertGeneralsError()
    }

}