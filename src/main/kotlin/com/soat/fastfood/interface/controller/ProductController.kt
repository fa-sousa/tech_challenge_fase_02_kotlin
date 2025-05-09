package com.soat.fastfood.adapter.driver.api

import com.soat.fastfood.adapter.driven.infra.data.Product
import com.soat.fastfood.adapter.driven.infra.repository.ProductRepository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/product")
class ProductController(@Autowired private val productRepository: ProductRepository){

  @GetMapping("")
  fun getAllproduct(): List<Product> = productRepository.findAll().toList()

  @PostMapping("")
  fun saveproduct(@RequestBody product: Product): ResponseEntity<Product> {
    val savedproduct = productRepository.save(product)
    return ResponseEntity(savedproduct, HttpStatus.CREATED)
  }

  @GetMapping("/{id}")
  fun getproductById(@PathVariable("id") productId: Int): ResponseEntity<Product> {
    val product = productRepository.findById(productId).orElse(null)
    return if (product != null) {
      ResponseEntity(product, HttpStatus.OK)
    } else {
      ResponseEntity(HttpStatus.NOT_FOUND)
    }
  }

  @PutMapping("/{id}")
  fun updateproductById(@PathVariable("id") productId: Int, @RequestBody product: Product): ResponseEntity<Product> {
    val existingproduct = productRepository.findById(productId).orElse(null)

    if (existingproduct == null){
      return ResponseEntity(HttpStatus.NOT_FOUND)
    }

    val updatedproduct = existingproduct.copy(name = product.name)
    productRepository.save(updatedproduct)
    return ResponseEntity(updatedproduct, HttpStatus.OK)
  }
}