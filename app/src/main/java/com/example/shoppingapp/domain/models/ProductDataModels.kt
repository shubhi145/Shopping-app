package com.example.shoppingapp.domain.models

import kotlinx.serialization.Serializable


@Serializable
data class ProductDataModels (
    val name: String = "",
    val description: String = "",
    val price: String = "",
    val finalPrice: String = "",
    val category: String = "",
    val image: String = "",
    val date : Long = System.currentTimeMillis(),
    val createBy : String = "",
    val availableUnits: Int = 0,
    var productId : String = ""

    )