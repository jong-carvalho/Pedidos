package com.jonatas_carvalho.pedido.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "TB_ORDER")
class OrderModel (

    @Id
    var orderId: String,
    @Column
    var clientId: String
)