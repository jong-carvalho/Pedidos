package com.jonatas_carvalho.pedido.dtos

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import java.util.*

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
data class OrderDTO (
    @JsonProperty("order_id")
    var orderId: String = "ORD_" + UUID.randomUUID().toString().uppercase(),
    @JsonProperty("client_id")
    var clientId: String
)