package com.jonatas_carvalho.pedido.dtos

import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import java.util.*

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
data class OrderDTO (
    var orderId: String = "ORD_" + UUID.randomUUID().toString().uppercase(),
    var clientId: String
)