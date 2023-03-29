package com.yacahya.stock_market_compose.data.mapper

import com.yacahya.stock_market_compose.data.local.CompanyListingEntity
import com.yacahya.stock_market_compose.data.remote.dto.CompanyInfoDto
import com.yacahya.stock_market_compose.domain.model.CompanyInfo
import com.yacahya.stock_market_compose.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}