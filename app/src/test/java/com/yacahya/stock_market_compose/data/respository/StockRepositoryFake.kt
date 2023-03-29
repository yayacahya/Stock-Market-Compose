package com.yacahya.stock_market_compose.data.respository

import com.yacahya.stock_market_compose.domain.model.CompanyInfo
import com.yacahya.stock_market_compose.domain.model.CompanyListing
import com.yacahya.stock_market_compose.domain.model.IntradayInfo
import com.yacahya.stock_market_compose.domain.repository.StockRepository
import com.yacahya.stock_market_compose.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.time.LocalDateTime

class StockRepositoryFake: StockRepository {

    var companyListingsToReturn = (1..10).map {
        CompanyListing(
            name = "name$it",
            symbol = "symbol$it",
            exchange = "exchange$it"
        )
    }
    var intradayInfosToReturn = (1..10).map {
        IntradayInfo(
            date = LocalDateTime.now(),
            close = it.toDouble()
        )
    }
    var companyInfoToReturn = CompanyInfo(
        symbol = "symbol",
        description = "description",
        name = "name",
        country = "country",
        industry = "industry"
    )

    override suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>> {
        return flow {
            emit(Resource.Success(companyListingsToReturn))
        }
    }

    override suspend fun getIntradayInfo(symbol: String): Resource<List<IntradayInfo>> {
        return Resource.Success(intradayInfosToReturn)
    }

    override suspend fun getCompanyInfo(symbol: String): Resource<CompanyInfo> {
        return Resource.Success(companyInfoToReturn)
    }
}