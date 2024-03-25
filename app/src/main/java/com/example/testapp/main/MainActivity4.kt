package com.example.testapp.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.testapp.R
import com.example.testapp.databinding.ActivityMain4Binding
import com.example.testapp.stundas.MainActivity5

class MainActivity4 : AppCompatActivity() {

    lateinit var binding: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val button = findViewById<View>(R.id.button6)
        button.setOnClickListener {
            Log.d("MyLog","Oksss")

            val intent = Intent(this@MainActivity4, MainActivity5::class.java)
            startActivity(intent)
        }
    }

    fun onClick1(view: View){

       val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("key1", "1")
        startActivity(intent)



    }

    fun onClick2(view: View){
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("key2", "1")
        startActivity(intent)
    }

    fun onClick3(view: View){
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("key3", "1")
        startActivity(intent)
    }
}