package com.soat.fastfood.adapter.driven.infra.data

import jakarta.persistence.*

@Entity
@Table(name = "item-order")
data class ItemOrder(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val orderId: Int,
    val productId: Int
)
