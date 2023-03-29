package com.yacahya.stock_market_compose.di

import com.yacahya.stock_market_compose.data.csv.CSVParser
import com.yacahya.stock_market_compose.data.csv.CompanyListingsParser
import com.yacahya.stock_market_compose.data.csv.IntradayInfoParser
import com.yacahya.stock_market_compose.data.repository.StockRepositoryImpl
import com.yacahya.stock_market_compose.domain.model.CompanyListing
import com.yacahya.stock_market_compose.domain.model.IntradayInfo
import com.yacahya.stock_market_compose.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}