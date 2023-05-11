package com.example.oopdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.oopdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cars = getMockCarList()

        var i = 0

        binding.btnNext.setOnClickListener {
            val car = cars[i]
            binding.tvCarYear.text = car.year.toString()
            binding.tvCarModel.text = car.model
            binding.tvCarBrand.text = car.brand

            if(i == cars.size - 1){
                i = 0
            }else{
                i++
            }
        }

    }


    private fun getMockCarList(): List<Car>{
        val car1 = Car(
            brand = "Renault",
            model = "Triber",
            year = 2020,
            isDiesel = false
        )

        val car2 = Car(
            brand ="Maruti-Suzuki",
            model = "Swift",
            year = 2001
        )

        val car3 = ElectricCar(
            brand = "Tesla",
            model = "Model S",
            year = 2012
        )

        val car4 = Car(
            brand ="Maruti-Suzuki",
            model = "WagonR",
            year = 2012
        )

        val car5 = Car(
            brand ="Maruti-Suzuki",
            model = "Brezza",
            year = 2015
        )

        val car6= Car(
            brand ="Tata",
            model = "Nexon",
            year = 2023
        )

        val car7 = Car(
            brand ="Tata",
            model = "Punch",
            year = 2022
        )

        val car8 = ElectricCar(
            brand = "Tesla",
            model = "Model 3",
            year = 2020
        )

        return mutableListOf(car1, car2, car3, car4, car5, car6, car7, car8)
    }
}













