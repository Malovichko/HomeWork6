package com.example.homework6.data

import androidx.annotation.DrawableRes

sealed class Meter

data class WaterMeter(
    val title: String,
    val numberScan: Int,
    @DrawableRes val scanIcon: Int,
    @DrawableRes val icon: Int,
    val bottomHint: String,
    val textNewReadings: String
) : Meter()

data class PowerMeter(
    val title: String,
    val numberScan: Int,
    @DrawableRes val scanIcon: Int,
    @DrawableRes val icon: Int,
    val textDay: String,
    val textNight: String,
    val textPeak: String,
    val bottomHint: String
) : Meter()