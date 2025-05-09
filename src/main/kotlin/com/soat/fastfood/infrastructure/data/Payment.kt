package com.soat.fastfood.adapter.driven.infra.data

import jakarta.persistence.*

@Entity
@Table(name = "payment")
data class Payment(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val orderId: Int,
    val amount: Double,
    val status: String
)