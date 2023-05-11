package com.example.oopdemo

import android.util.Log

class ElectricCar(
    brand: String,
    model: String,
    year: Int
): Car(
    brand, model, year,
) {
    override val tag = "ElectricCar.kt"

    fun chargeBattery(){
        Log.i(tag, "The $brand $model is charging")
    }

    override fun isCarValid(): Boolean {
        Log.i(tag, "The $year $brand $model is still valid.")
        return true
    }
}