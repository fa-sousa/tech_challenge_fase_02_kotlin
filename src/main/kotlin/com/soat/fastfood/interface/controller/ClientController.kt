package com.soat.fastfood.adapter.driver.api

import com.soat.fastfood.adapter.driven.infra.data.Client
import com.soat.fastfood.adapter.driven.infra.repository.ClientRepository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/client")
class ClientController(@Autowired private val clientRepository: ClientRepository){

  @GetMapping("")
  fun getAllClient(): List<Client> = clientRepository.findAll().toList()

  @PostMapping("")
  fun saveClient(@RequestBody client: Client): ResponseEntity<Client> {
    val savedClient = clientRepository.save(client)
    return ResponseEntity(savedClient, HttpStatus.CREATED)
  }

  @GetMapping("/{id}")
  fun getClientById(@PathVariable("id") clientId: Int): ResponseEntity<Client> {
    val client = clientRepository.findById(clientId).orElse(null)
    return if (client != null) {
      ResponseEntity(client, HttpStatus.OK)
    } else {
      ResponseEntity(HttpStatus.NOT_FOUND)
    }
  }

  @PutMapping("/{id}")
  fun updateClientById(@PathVariable("id") clientId: Int, @RequestBody client: Client): ResponseEntity<Client> {
    val existingClient = clientRepository.findById(clientId).orElse(null)

    if (existingClient == null){
      return ResponseEntity(HttpStatus.NOT_FOUND)
    }

    val updatedClient = existingClient.copy(name = client.name, email = client.email)
    clientRepository.save(updatedClient)
    return ResponseEntity(updatedClient, HttpStatus.OK)
  }
}