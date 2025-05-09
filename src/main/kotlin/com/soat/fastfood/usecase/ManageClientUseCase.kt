package com.soat.fastfood.core.application.usecase

import com.soat.fastfood.core.domain.Client
import com.soat.fastfood.core.application.port.driver.ClientPort

class ManageClientUseCase(private val clientPort: ClientPort) {
    fun saveClient(client: Client) : Client {
        return clientPort.save(client)
    }

    fun getClientById(clientId: Int): Client {
        return clientPort.findById(clientId)
    }
}