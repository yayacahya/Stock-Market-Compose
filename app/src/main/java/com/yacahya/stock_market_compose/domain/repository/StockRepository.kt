package com.yacahya.stock_market_compose.domain.repository

import com.yacahya.stock_market_compose.domain.model.CompanyInfo
import com.yacahya.stock_market_compose.domain.model.CompanyListing
import com.yacahya.stock_market_compose.domain.model.IntradayInfo
import com.yacahya.stock_market_compose.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}