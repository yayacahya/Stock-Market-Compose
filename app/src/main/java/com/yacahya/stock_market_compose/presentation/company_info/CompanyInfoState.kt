package com.yacahya.stock_market_compose.presentation.company_info

import com.yacahya.stock_market_compose.domain.model.CompanyInfo
import com.yacahya.stock_market_compose.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)