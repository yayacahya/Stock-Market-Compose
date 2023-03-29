package com.yacahya.stock_market_compose.data.remote.dto

data class IntradayInfoDto(
    val timestamp: String,
    val close: Double
)