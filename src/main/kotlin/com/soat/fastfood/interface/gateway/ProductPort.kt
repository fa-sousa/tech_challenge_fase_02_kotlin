package com.soat.fastfood.core.application.port.driver

import com.soat.fastfood.core.domain.Category
import com.soat.fastfood.core.domain.Product

interface ProductPort {
    fun findByCategory(category: Category) : List<Product>
    fun save(product: Product) : Product
    fun deleteById(id: String)
}