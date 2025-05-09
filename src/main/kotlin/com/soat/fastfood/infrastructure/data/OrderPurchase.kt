package com.soat.fastfood.adapter.driven.infra.data

import jakarta.persistence.*

@Entity
@Table(name = "orderPurchase")
data class OrderPurchase(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val clientId: Int,
    val status: String
)