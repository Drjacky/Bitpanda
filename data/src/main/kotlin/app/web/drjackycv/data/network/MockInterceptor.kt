package app.web.drjackycv.data.network

import app.web.drjackycv.data.BuildConfig
import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.Protocol
import okhttp3.Response
import okhttp3.ResponseBody.Companion.toResponseBody

private const val SUCCESS_CODE = 200

class MockInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        if (BuildConfig.DEBUG) {
            val uri = chain.request().url.toUri().toString()
            val responseString = getBitzJson

            return chain.proceed(chain.request())
                .newBuilder()
                .code(SUCCESS_CODE)
                .protocol(Protocol.HTTP_2)
                .message(responseString)
                .body(
                    responseString.toByteArray()
                        .toResponseBody("application/json".toMediaTypeOrNull())
                )
                .addHeader("content-type", "application/json")
                .build()
        } else {
            throw IllegalAccessError("MockInterceptor is only meant for Testing Purposes and bound to be used only with DEBUG mode")
        }
    }

}

const val getBitzJson = """
{
   "MetalWallet":[
      {
         "id":"1",
         "name":"Test Metal Wallet",
         "balance":133.7,
         "isDefault":false,
         "metalId":"4",
         "deleted":false
      },
      {
         "id":"2",
         "name":"Test Palladium Wallet",
         "balance":200,
         "isDefault":false,
         "metalId":"5",
         "deleted":false
      }
   ],
   "CryptoWallet":[
      {
         "id":"1",
         "name":"Test BTC Wallet",
         "balance":133.7,
         "isDefault":false,
         "cryptocoinId":"1",
         "deleted":false
      },
      {
         "id":"2",
         "name":"Test BTC Wallet 2",
         "balance":0.0,
         "isDefault":false,
         "cryptocoinId":"1",
         "deleted":true
      },
      {
         "id":"3",
         "name":"Test BEST Wallet",
         "balance":1032.23,
         "isDefault":false,
         "cryptocoinId":"2",
         "deleted":false
      },
      {
         "id":"4",
         "name":"Test Ripple Wallet",
         "balance":2304.04,
         "isDefault":false,
         "cryptocoinId":"3",
         "deleted":false
      }
   ],
   "FiatWallet":[
      {
         "id":"1",
         "name":"EUR Wallet",
         "fiatId":"1",
         "balance":400.0,
         "isDefault":false,
         "deleted":false
      },
      {
         "id":"2",
         "name":"CHF Wallet",
         "fiatId":"2",
         "balance":0.0,
         "isDefault":false,
         "deleted":false
      }
   ],
   "Cryptocoin":[
      {
         "name":"Bitcoin",
         "symbol":"BTC",
         "id":"1",
         "price":9000,
         "logo":"https://bitpanda-assets.s3-eu-west-1.amazonaws.com/static/cryptocoin/btc.svg"
      },
      {
         "name":"Bitpanda Ecosystem Token",
         "symbol":"BEST",
         "id":"2",
         "price":0.03,
         "logo":"https://bitpanda-assets.s3-eu-west-1.amazonaws.com/static/cryptocoin/best.svg"
      },
      {
         "name":"Ripple",
         "symbol":"XRP",
         "id":"3",
         "price":0.2119,
         "logo":"https://bitpanda-assets.s3-eu-west-1.amazonaws.com/static/cryptocoin/xrp.svg"
      }
   ],
   "Fiat":[
      {
         "name":"Euro",
         "symbol":"EUR",
         "id":"1",
         "logo":"https://bitpanda-assets.s3-eu-west-1.amazonaws.com/static/fiat/usd.svg"
      },
      {
         "name":"Swiss Franc",
         "symbol":"CHF",
         "id":"2",
         "logo":"https://bitpanda-assets.s3-eu-west-1.amazonaws.com/static/fiat/chf.svg"
      }
   ],
   "Metal":[
      {
         "name":"Gold",
         "symbol":"XAU",
         "id":"4",
         "price":45.14,
         "logo":"https://bitpanda-assets.s3-eu-west-1.amazonaws.com/static/fiat/xau.svg"
      },
      {
         "name":"Palladium",
         "symbol":"XPD",
         "id":"5",
         "price":70.40,
         "logo":"https://bitpanda-assets.s3-eu-west-1.amazonaws.com/static/fiat/xpd.svg"
      }
   ]
}
"""