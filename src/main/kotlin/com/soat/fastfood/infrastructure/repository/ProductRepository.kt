package com.soat.fastfood.adapter.driven.infra.repository

import com.soat.fastfood.adapter.driven.infra.data.Product
import org.springframework.data.repository.CrudRepository

interface ProductRepository : CrudRepository<Product, Int>