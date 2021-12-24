package com.example.practicecomputation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.math.*

class MainActivity : AppCompatActivity() {
    var count: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun startTimer(){
        val timer = Timer()
        val textCount: TextView = findViewById<TextView>(R.id.count)
    }
    fun resetCount(view: View){
        count = 0;
        val textCount: TextView = findViewById<TextView>(R.id.count)
        textCount.text = "Count: " + count
    }
    /*------------------------------------------------------------------------------------------------------------------------*/
    fun singleDigitMultiplication(view: View) {
        val randomNumber1 = (1..9).random()
        val randomNumber2 = (1..9).random()
        val sum = randomNumber1 * randomNumber2

        val text: TextView = findViewById<TextView>(R.id.computation)
        text.text = (String.format("%d", randomNumber1) + " * " + String.format("%d", randomNumber2));

    }
    fun singleDigitAddition(view: View) {
        val randomNumber1 = (1..9).random()
        val randomNumber2 = (1..9).random()
        val sum = randomNumber1 + randomNumber2

        val text: TextView = findViewById<TextView>(R.id.computation)
        text.text = (String.format("%d", randomNumber1) + " + " + String.format("%d", randomNumber2));
    }
    fun singleDigitSubtraction(view: View) {
        val randomNumber1 = (1..9).random()
        val randomNumber2 = (1..9).random()
        val sum = randomNumber1 - randomNumber2

        val text: TextView = findViewById<TextView>(R.id.computation)
        text.text = (String.format("%d", randomNumber1) + " - " + String.format("%d", randomNumber2));
    }

    /*------------------------------------------------------------------------------------------------------------------------*/
    fun twoDigitMultiplication(view: View) {
        val randomNumber1 = (10..99).random()
        val randomNumber2 = (10..99).random()
        val sum = randomNumber1 * randomNumber2

        val text: TextView = findViewById<TextView>(R.id.computation)
        text.text = (String.format("%d", randomNumber1) + " * " + String.format("%d", randomNumber2));
    }

    fun twoDigitAddition(view: View) {
        val randomNumber1 = (10..99).random()
        val randomNumber2 = (10..99).random()
        val sum = randomNumber1 + randomNumber2

        val text: TextView = findViewById<TextView>(R.id.computation)
        text.text = (String.format("%d", randomNumber1) + " + " + String.format("%d", randomNumber2));
    }
    fun twoDigitSubtraction(view: View) {
        val randomNumber1 = (10..99).random()
        val randomNumber2 = (10..99).random()
        val sum = randomNumber1 - randomNumber2

        val text: TextView = findViewById<TextView>(R.id.computation)
        text.text = (String.format("%d", randomNumber1) + " - " + String.format("%d", randomNumber2));
    }

    /*------------------------------------------------------------------------------------------------------------------------*/
    fun threeDigitMultiplication(view: View) {
        val randomNumber1 = (100..999).random()
        val randomNumber2 = (100..999).random()
        val sum = randomNumber1 * randomNumber2

        val text: TextView = findViewById<TextView>(R.id.computation)
        text.text = (String.format("%d", randomNumber1) + " * " + String.format("%d", randomNumber2));
    }

    fun threeDigitAddition(view: View) {
        val randomNumber1 = (100..999).random()
        val randomNumber2 = (100..999).random()
        val sum = randomNumber1 + randomNumber2

        val text: TextView = findViewById<TextView>(R.id.computation)
        text.text = (String.format("%d", randomNumber1) + " + " + String.format("%d", randomNumber2));
    }
    fun threeDigitSubtraction(view: View) {
        val randomNumber1 = (100..999).random()
        val randomNumber2 = (100..999).random()
        val sum = randomNumber1 - randomNumber2

        val text: TextView = findViewById<TextView>(R.id.computation)
        text.text = (String.format("%d", randomNumber1) + " - " + String.format("%d", randomNumber2));
    }

    /*------------------------------------------------------------------------------------------------------------------------*/
    @SuppressLint("SetTextI18n")
    fun checkSum(view: View){

        val textCount: TextView = findViewById<TextView>(R.id.count)
        textCount.text = "Count: " + count

        try{
            val text: TextView = findViewById<TextView>(R.id.computation)
            val answer: EditText = findViewById<EditText>(R.id.answer)
            Log.d("H", "| Question: " + text.text as String)


            if(text.text.contains("+")){
                val computation = text.text as String
                val textSplit = computation.split("+")

                val additionSum : Float = textSplit[0].toFloat() + textSplit[1].toFloat()
                if(answer.getText().toString() == additionSum.toInt().toString()){
                    text.text = "Correctomundo"
                    answer.setText("")
                }
                else{
                    text.text = "Wrong; Answer was " + additionSum.toInt().toString()
                    answer.setText("")
                }
                count++;
                textCount.text = "Count: " + count
            }


            if(text.text.contains("*")){
                val computation = text.text as String
                val textSplit = computation.split("*")

                val additionSum : Float = textSplit[0].toFloat() * textSplit[1].toFloat()
                if(answer.getText().toString() == additionSum.toInt().toString()){
                    text.text = "Correctomundo"
                    answer.setText("")
                }
                else{
                    text.text = "Wrong; Answer was " + additionSum.toInt().toString()
                    answer.setText("")
                }
                count++;
                textCount.text = "Count: " + count
            }

            if(text.text.contains("-")){
                val computation = text.text as String
                val textSplit = computation.split("-")

                val additionSum : Float = textSplit[0].toFloat() - textSplit[1].toFloat()
                if(answer.getText().toString() == additionSum.toInt().toString()){
                    text.text = "Correctomundo"
                    answer.setText("")
                }
                else{
                    text.text = "Wrong; Answer was " + additionSum.toInt().toString()
                    answer.setText("")
                }
                count++;
                textCount.text = "Count: " + count
            }

        }catch(e: Exception){

        }






    }
}