package com.example.currency_rate.main

import com.example.currency_rate.data.model.CurrencyResponse
import com.example.currency_rate.util.Resource


interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}