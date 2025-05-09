package com.soat.fastfood.core.application.usecase

import com.soat.fastfood.core.application.port.driver.OrderPort
import com.soat.fastfood.core.application.port.driver.ClientPort
import com.soat.fastfood.core.domain.Order

class CreateOrderUseCase(private val orderPort: OrderPort, 
    private val clientPort: ClientPort) {

    fun execute(doc: String) {
        val idClient = clientPort.findByDoc(doc)
        //val order = Order(idClient)
        //return orderPort.save(order) 
    }
}