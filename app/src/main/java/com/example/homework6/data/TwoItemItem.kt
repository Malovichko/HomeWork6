package com.example.homework6.data

import androidx.annotation.DrawableRes

sealed class TwoItemItem

data class TwoItemWater(
    val title: String,
    val numberScan: Int,
    @DrawableRes val scanIcon: Int,
    @DrawableRes val icon: Int,
    val bottomHint: String,
    val textNewReadings: String
) : TwoItemItem()

data class TwoItemPower(
    val title: String,
    val numberScan: Int,
    @DrawableRes val scanIcon: Int,
    @DrawableRes val icon: Int,
    val textDay: String,
    val textNight: String,
    val textPeak: String,
    val bottomHint: String
) : TwoItemItem()