package com.soat.fastfood.adapter.driver.api

import com.soat.fastfood.adapter.driven.infra.data.OrderPurchase
import com.soat.fastfood.adapter.driven.infra.repository.OrderRepository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/orders")
class OrderController(@Autowired private val orderRepository: OrderRepository) {

    @GetMapping
    fun getAllOrders(): List<OrderPurchase> =
        orderRepository.findAll().toList()

    @PostMapping
    fun createOrder(@RequestBody order: OrderPurchase): ResponseEntity<OrderPurchase> {
        val savedOrder = orderRepository.save(order)
        return ResponseEntity(savedOrder, HttpStatus.CREATED)
    }

    @GetMapping("/{id}")
    fun getOrderById(@PathVariable("id") orderId: Int): ResponseEntity<OrderPurchase> {
        val order = orderRepository.findById(orderId).orElse(null)
        return if (order != null) {
            ResponseEntity(order, HttpStatus.OK)
        } else {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }
}