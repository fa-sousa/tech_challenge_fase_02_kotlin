package com.soat.fastfood.core.application.port.driver

import com.soat.fastfood.core.domain.Category
import com.soat.fastfood.core.domain.Payment

interface PaymentPort {
    fun save(product: Payment) : Payment
}