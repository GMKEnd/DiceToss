package com.example.eg

abstract class Dwelling(private var residents: Int){
    abstract val buildingMaterial: String
    abstract val capacity: Int

    fun hasRoom(): Boolean{
        return residents < capacity
    }

    abstract fun floorArea() : Double
}

class SquareCabin(residents: Int, val length: Double) : Dwelling(residents){
    override val buildingMaterial = "Wood"
    override val capacity = 11

    override fun floorArea(): Double {
        return length * length
    }
}

open class RoundHut(residents: Int, val radius: Double) : Dwelling(residents){
    override val buildingMaterial = "Straw"
    override val capacity = 5

    override fun floorArea(): Double {
        return radius * radius * 3.14
    }
}

class RoundTower(residents: Int, radius: Double, val floors: Int) : RoundHut(residents, radius){
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors

    override fun floorArea(): Double {
        return super.floorArea() * floors
    }
}