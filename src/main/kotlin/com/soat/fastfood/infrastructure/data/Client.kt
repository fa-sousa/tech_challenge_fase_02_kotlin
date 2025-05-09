package com.soat.fastfood.adapter.driven.infra.data

import jakarta.persistence.*

@Entity
@Table(name = "client")
data class Client(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val doc: String?,
    val name: String?,
    val email: String?
)