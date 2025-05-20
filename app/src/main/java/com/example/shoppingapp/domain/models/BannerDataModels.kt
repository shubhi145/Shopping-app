package com.example.shoppingapp.domain.models

import androidx.wear.compose.materialcore.currentTimeMillis

data class BannerDataModels(
    val name : String = "",
    val image : String = "",
    val date : Long = System.currentTimeMillis()
)
