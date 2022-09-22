package com.example.eg

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt: Button = findViewById(R.id.BT)
        bt.setOnClickListener{
            val dice1 = Dice(6)
            val score = dice1.toss()
            Log.i(TAG, "tossed ${score}")

            val textvi: TextView = findViewById(R.id.TV)
            textvi.text = score.toString()

            val img: ImageView = findViewById(R.id.imageView)
            when (score) {
                1 -> img.setImageResource(R.drawable.dice_1)
                2 -> img.setImageResource(R.drawable.dice_2)
                3 -> img.setImageResource(R.drawable.dice_3)
                4 -> img.setImageResource(R.drawable.dice_4)
                5 -> img.setImageResource(R.drawable.dice_5)
                6 -> img.setImageResource(R.drawable.dice_6)
            }
        }

        val numbs: List<Int> = listOf(1, 2, 3, 4, 5, 6)

        println("List: $numbs")
        println("Size: ${numbs.size}")

        println("First: ${numbs.first()}")
        println("Last: ${numbs.last()}")

        println("Contains 4? ${numbs.contains(4)}")
        println("Contains 7? ${numbs.contains(7)}")

        val colors = listOf("green", "orange", "blue")
        println("Reversed list: ${colors.reversed()}")
        println("Sorted list: ${colors.sorted()}")

        val strs = mutableListOf<String>()
        println("Add noodles: ${strs.add("noodles")}")
        println("Add all: ${strs.addAll(0, listOf("a", "w", "re"))}")
        strs.add("w")
        strs.remove("w")
        println("List: $strs")
    }
}