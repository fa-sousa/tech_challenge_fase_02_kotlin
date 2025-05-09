package com.soat.fastfood.core.application.port.driver

import com.soat.fastfood.core.domain.Client

interface ClientPort {
    fun save(client: Client) : Client
    fun findById(id: Int) : Client
    fun findByDoc(doc: String) : Client
}