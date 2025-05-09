package com.soat.fastfood.core.domain

data class Payment(
    val orderId: Int,
    val amount: Double,
    val status: PaymentStatus
)
enum class PaymentStatus {
    PENDING, COMPLETED, FAILED
}