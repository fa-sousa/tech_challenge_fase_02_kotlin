package com.soat.fastfood.adapter.driven.infra.repository

import com.soat.fastfood.adapter.driven.infra.data.Client
import org.springframework.data.repository.CrudRepository

interface ClientRepository : CrudRepository<Client, Int>