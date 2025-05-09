package com.soat.fastfood.core.application.port.driver

import com.soat.fastfood.core.domain.Order

interface OrderPort {
    fun save(order: Order) : Order
    fun findAll() : List<Order>
}