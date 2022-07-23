package com.example.opehelloworld

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener()
        {
           Log.i( "Ope", "Tapped on Button" )
            findViewById<TextView>(R.id.textView).setTextColor( Color.parseColor("#88B048"))
        }

        findViewById<Button>(R.id.button2).setOnClickListener()
        {
            Log.i( "Ope", "Tapped on Button" )
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(Color.parseColor("#D3D3D3") )
        }

        val tx: EditText = findViewById<EditText>(R.id.new_text)
        tx.text.toString()

        findViewById<Button>(R.id.button3).setOnClickListener()
        {
            Log.i( "Ope", "Tapped on Button" )
            val tv1: TextView = findViewById(R.id.textView)
            tv1.text = getString(R.string.text)
        }

    }
}