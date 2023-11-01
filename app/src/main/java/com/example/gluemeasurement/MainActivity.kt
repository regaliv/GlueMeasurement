package com.example.gluemeasurement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.gluemeasurement.R
import com.example.gluemeasurement.databinding.ActivityMainBinding

import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }

    fun onClick (view: View){



    }

    fun Clic(view: View){

        val intent =  Intent(this, MainActivity2::class.java)
        intent.putExtra("key",getResult().toString())
        startActivity(intent)

        if (!isFieldEmpty()) {
            val result = getString(R.string.result_info)+getResult()
            binding.tvResult.text = result
        }

    }

    private fun isFieldEmpty():Boolean{
        binding.apply {// apply даёт возможность прикрепить к binding несколько активностей
            if (edA.text.isNullOrEmpty()) edA.error = getString(R.string.no_value_entered)
            if (edB.text.isNullOrEmpty()) edB.error = getString(R.string.no_value_entered)
            return edA.text.isNullOrEmpty() || edB.text.isNullOrEmpty()
        }

    }

    private fun getResult(): Double {
        val a: Double
        val b: Double

        binding.apply {
            a= edA.text.toString().toDouble()
            b= edB.text.toString().toDouble()
        }
        return a*b







    }

}