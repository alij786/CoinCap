package com.tc.coincap.data.remote

import com.tc.coincap.data.model.RateItemModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiEndpoint {
    @GET(ApiDetails.COIN_ENDPOINT)
    suspend fun getCoinCurrency(): RateItemModel

    @GET(ApiDetails.COIN_ENDPOINT)
    suspend fun getCoinCurrencyId(@Query("id") id: String): RateItemModel
}
