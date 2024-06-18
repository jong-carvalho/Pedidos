package com.jonatas_carvalho.pedido.controllers

import com.jonatas_carvalho.pedido.dtos.OrderDTO
import com.jonatas_carvalho.pedido.models.OrderModel
import com.jonatas_carvalho.pedido.services.OrderService
import org.slf4j.Logger
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/orders")
class OrderController(val logger: Logger, private val orderService: OrderService) {

    @CrossOrigin
    @GetMapping
    fun getAllOrders(): ResponseEntity<MutableList<OrderModel>> {
        logger.info("Procurando todos os pedidos cadastrados...")
        return ResponseEntity.status(HttpStatus.OK).body(orderService.findAll())
    }

    @CrossOrigin
    @PostMapping
    fun createClient(@RequestBody orderDTO: OrderDTO): ResponseEntity<String> {
        logger.info("Criando um pedido...")
        orderService.save(orderDTO)
        return ResponseEntity.status(HttpStatus.OK).body("Pedido criado com sucesso.")
    }

}