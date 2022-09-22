package com.example.eg

class Dice(val nums:Int) {
    fun toss(): Int {
        return (1..nums).random()
    }
}