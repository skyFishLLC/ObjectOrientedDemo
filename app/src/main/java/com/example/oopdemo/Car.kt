package com.example.oopdemo

import android.util.Log
import java.util.Calendar


open class Car(
    val brand: String,
    val model: String,
    val year: Int,
    val isDiesel: Boolean = false,
) {
    open val tag = "Car.kt"

    fun accelerate(){
        Log.i(tag, "The $brand $model is accelerating.")
    }

    fun brake(){
        Log.i(tag,"The $brand $model is braking")
    }

    open fun isCarValid(): Boolean{
        val maxAge = if(isDiesel) 10 else 15

        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val validUntil = year + maxAge

        if(validUntil < currentYear){
            Log.i(tag, "The $year $brand $model is expired.")
            return false
        }else{
            Log.i(tag, "The $year $brand $model is still valid.")
            return true
        }

    }

}













