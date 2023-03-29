package com.yacahya.stock_market_compose.presentation.company_listings

import com.yacahya.stock_market_compose.domain.model.CompanyListing

data class CompanyListingsState(
    val companies: List<CompanyListing> = emptyList(),
    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,
    val searchQuery: String = ""
)