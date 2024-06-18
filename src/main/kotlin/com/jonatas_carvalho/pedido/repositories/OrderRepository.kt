package com.jonatas_carvalho.pedido.repositories

import com.jonatas_carvalho.pedido.models.OrderModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderRepository: JpaRepository<OrderModel, Int> {

    override fun findAll(): MutableList<OrderModel>

    fun save(orderModel: OrderModel): OrderModel


}