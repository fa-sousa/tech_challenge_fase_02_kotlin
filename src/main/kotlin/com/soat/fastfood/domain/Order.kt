package com.soat.fastfood.core.domain

data class Order(
    val id: Int,
    val clientId: Int,
    val productList: List<Product>,
    var status: OrderStatus
)
