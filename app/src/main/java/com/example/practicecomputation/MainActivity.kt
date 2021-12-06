package com.example.practicecomputation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun singleDigitMultiplication(view: View) {
        val randomNumber1 = (0..10).random()
        val randomNumber2 = (0..10).random()
        val sum = randomNumber1 * randomNumber2

        val text: TextView = findViewById<TextView>(R.id.computation)
        text.text = (String.format("%d", randomNumber1) + " * " + String.format("%d", randomNumber2));

    }
    fun singleDigitAddition(view: View) {
        val randomNumber1 = (0..10).random()
        val randomNumber2 = (0..10).random()
        val sum = randomNumber1 + randomNumber2

        val text: TextView = findViewById<TextView>(R.id.computation)
        text.text = (String.format("%d", randomNumber1) + " + " + String.format("%d", randomNumber2));
    }

    fun twoDigitMultiplication(view: View) {
        val randomNumber1 = (10..100).random()
        val randomNumber2 = (10..100).random()
        val sum = randomNumber1 * randomNumber2

        val text: TextView = findViewById<TextView>(R.id.computation)
        text.text = (String.format("%d", randomNumber1) + " * " + String.format("%d", randomNumber2));
    }

    fun twoDigitAddition(view: View) {
        val randomNumber1 = (10..100).random()
        val randomNumber2 = (10..100).random()
        val sum = randomNumber1 + randomNumber2

        val text: TextView = findViewById<TextView>(R.id.computation)
        text.text = (String.format("%d", randomNumber1) + " + " + String.format("%d", randomNumber2));
    }

    fun checkSum(view: View){
        val text: TextView = findViewById<TextView>(R.id.computation)
        Log.d("H", text.text as String)
        val answer: EditText = findViewById<EditText>(R.id.answer)

        if(text.text.contains("+")){
            val textSplit = text.text!!.split("+").toTypedArray()
            val num1 = textSplit[0].toInt()
            val num2 = textSplit[1].toInt()
            val additionSum = num1 + num2
            Log.d("g", additionSum.toString())

        }

        if(text.text.contains("*")){
            val textSplit = text.text!!.split("*").toTypedArray()
            val num1 = textSplit[0]
            val num2 = textSplit[1]
        }





    }
}