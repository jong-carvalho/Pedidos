package com.jonatas_carvalho.pedido.extensionFunctions

import com.jonatas_carvalho.pedido.dtos.OrderDTO
import com.jonatas_carvalho.pedido.models.OrderModel


fun OrderDTO.orderDTOToModel() = OrderModel(
    orderId = orderId,
    clientId = clientId
)

fun OrderModel.orderModeltoDTO() = OrderDTO(
    orderId = orderId,
    clientId = clientId
)