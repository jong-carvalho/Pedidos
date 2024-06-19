package com.jonatas_carvalho.pedido.services

import com.jonatas_carvalho.pedido.dtos.OrderDTO
import com.jonatas_carvalho.pedido.extensionFunctions.orderDTOToModel
import com.jonatas_carvalho.pedido.models.OrderModel
import com.jonatas_carvalho.pedido.repositories.OrderRepository
import org.slf4j.Logger
import org.springframework.stereotype.Service

@Service
class OrderService(private val repository: OrderRepository, val logger: Logger) {

    fun findAll(): MutableList<OrderModel> {
        val allClients = repository.findAll()
        logger.info("Todos os pedidos foram encontrados com sucesso.")
        return allClients
    }

    fun save(orderDTO: OrderDTO): OrderDTO {
        val orderModel = orderDTO.orderDTOToModel()

        repository.save(orderModel)
        logger.info("O Cliente com o id: ${orderModel.orderId} foi criado.")
        return orderDTO
    }
}