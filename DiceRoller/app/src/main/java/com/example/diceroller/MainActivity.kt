package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Find the button in the layout
        val rollButton: Button = findViewById(R.id.button)

        //Implement Click functionality in button
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    // Function that updates the screen with the dice roll number
    private fun rollDice() {

        //Create new dice object with 6 sides and roll the dice
        val dice = Dice(6)
        val diceRoll = dice.roll()

        //Find the imageView in the layout
        val diceImage: ImageView = findViewById(R.id.imageView)

        //Determine which drawable resource ID to use based on the dice roll
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        //Update the imageView with the correct drawable resource ID
        diceImage.setImageResource(drawableResource)

        //Update the content description of imageView
        diceImage.contentDescription = diceRoll.toString()
    }
}

class Dice(val numSides: Int) {
    // Logic for generating a random dice roll number
    fun roll(): Int {
        return (1..numSides).random()
    }
}