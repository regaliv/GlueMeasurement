package com.example.gluemeasurement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.gluemeasurement.databinding.ActivityMain2Binding
import com.example.gluemeasurement.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val massege = intent.getStringExtra("key")
        binding.textView2.text = massege

    }
    fun onClick2(view: View){
        finish()
    }

}