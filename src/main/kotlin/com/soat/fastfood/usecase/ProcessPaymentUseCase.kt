package com.soat.fastfood.core.application.usecase

import com.soat.fastfood.core.domain.Payment
import com.soat.fastfood.core.domain.PaymentStatus

class ProcessPaymentUseCase () {
    fun execute(payment: Payment) : Boolean {
        return true
    }
}