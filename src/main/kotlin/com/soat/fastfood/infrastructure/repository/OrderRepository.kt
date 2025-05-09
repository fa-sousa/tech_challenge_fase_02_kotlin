package com.soat.fastfood.adapter.driven.infra.repository

import com.soat.fastfood.adapter.driven.infra.data.OrderPurchase
import org.springframework.data.repository.CrudRepository

interface OrderRepository : CrudRepository<OrderPurchase, Int>