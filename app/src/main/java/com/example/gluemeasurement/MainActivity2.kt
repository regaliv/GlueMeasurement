package com.example.gluemeasurement

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.gluemeasurement.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val massage2 = intent.getStringExtra("key")
        val c = massage2.toString().toDouble()
        if (c>20) binding.textView3.visibility = View.VISIBLE

            binding.textView3.text = c.toString()





    }

    fun onClick2(view: View){
        val message = intent.getStringExtra("key")


        val a = binding.textInt.text.toString().toDouble()
        val i = message.toString().toDouble()
        val z = a*i
        binding.textView2.text=z.toString()


    }

}