package com.example.capturaestados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private var onCreate=0
    private var onStart=1
    private var onResume=2
    private var onPause=3
    private var onRestart=4
    private var onStop=5
    private var onDestroy=6
    private lateinit var txtEmail:EditText
    private lateinit var txtContra:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate $onCreate")
        txtEmail=findViewById(R.id.editTextTextCorreo)
        txtContra=findViewById(R.id.editTextTextPassword)
    }

    override fun onStart() {
        super.onStart()
        println("onStart $onStart")
    }

    override fun onResume() {
        super.onResume()
        println("onResume $onResume")
    }

    override fun onPause() {
        super.onPause()
        println("onPause $onPause")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart $onRestart")
    }

    override fun onStop() {
        super.onStop()
        println("onStop $onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy $onDestroy")
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle){
        super.onSaveInstanceState(savedInstanceState)

        savedInstanceState.putString("TAGEMAIL", txtEmail.text.toString())
        savedInstanceState.putString("TAGCONTRA", txtContra.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        txtEmail.setText(savedInstanceState.getString("TAGEMAIL"))
        txtContra.setText(savedInstanceState.getString("TAGCONTRA"))
    }
}