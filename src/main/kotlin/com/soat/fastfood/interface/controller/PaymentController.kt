package com.soat.fastfood.adapter.driver.api

import com.soat.fastfood.adapter.driven.infra.data.Payment
import com.soat.fastfood.adapter.driven.infra.repository.PaymentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/payments")
class PaymentController(@Autowired private val paymentRepository: PaymentRepository) {

    @GetMapping
    fun getAllPayments(): List<Payment> =
        paymentRepository.findAll().toList()

    @PostMapping
    fun createPayment(@RequestBody payment: Payment): ResponseEntity<Payment> {
        val savedPayment = paymentRepository.save(payment)
        return ResponseEntity(savedPayment, HttpStatus.CREATED)
    }

    @GetMapping("/{id}")
    fun getPaymentById(@PathVariable("id") paymentId: Int): ResponseEntity<Payment> {
        val payment = paymentRepository.findById(paymentId).orElse(null)
        return if (payment != null) {
            ResponseEntity(payment, HttpStatus.OK)
        } else {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }
}