package com.example.capturaestados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.capturaestados.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    private val binding = ActivityMain2Binding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }
}