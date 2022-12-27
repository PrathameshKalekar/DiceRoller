package com.example.diceroller

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.btnDiceRoll.setOnClickListener {
        Toast.makeText(this,"Dice Rolled !!",Toast.LENGTH_SHORT).show()
            DiceRolled()
        }
    }

   private fun DiceRolled(){
        val drawableOutputOfDice = (1..6).random()
        ImagesOutput(drawableOutputOfDice)
    }

    private fun ImagesOutput(Number : Int){
        when(Number){
            1-> binding.outputViewImages.setImageResource(R.drawable.dice_1)
            2-> binding.outputViewImages.setImageResource(R.drawable.dice_2)
            3-> binding.outputViewImages.setImageResource(R.drawable.dice_3)
            4-> binding.outputViewImages.setImageResource(R.drawable.dice_4)
            5-> binding.outputViewImages.setImageResource(R.drawable.dice_5)
            6-> binding.outputViewImages.setImageResource(R.drawable.dice_6)
        }
    }
}