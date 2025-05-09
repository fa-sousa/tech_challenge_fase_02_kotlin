package com.soat.fastfood.adapter.driven.infra.repository

import com.soat.fastfood.adapter.driven.infra.data.Payment
import org.springframework.data.repository.CrudRepository

interface PaymentRepository : CrudRepository<Payment, Int>