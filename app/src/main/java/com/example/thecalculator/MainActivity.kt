package com.example.thecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var etNumber1: EditText? = null  // on the activity etNum1
    private var etNumber2: EditText? = null  // on the activity etNum2
    private var tvDisplay: TextView? = null  // on the activity tvDisplay

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNumber1 = findViewById<EditText>(R.id.etNum1)
        etNumber2 = findViewById<EditText>(R.id.etNum2)
        tvDisplay = findViewById<TextView>(R.id.tvDisplay)

        val btnAddition = findViewById<Button>(R.id.btnAdd)
        btnAddition.setOnClickListener{
            add()
        }
        val btnSubtraction = findViewById<Button>(R.id.btnSub)
        btnSubtraction.setOnClickListener{
            subt()
        }
        val btnMultiplication = findViewById<Button>(R.id.btnMul)
        btnMultiplication.setOnClickListener{
            mult()
        }
        val btnDivision = findViewById<Button>(R.id.btnDiv)
        btnDivision.setOnClickListener{
            divs()
        }
    }

    private fun add(){
        var intNum1: Int = 0
        var intNum2: Int = 0
        var intAns: Int = 0

        intNum1 = etNumber1.text.toString().toInt()
        intNum2 = etNumber2.text.toString().toInt()

        intAns = intNum1 + intNum2

        // output intNum1 + "
    }
}