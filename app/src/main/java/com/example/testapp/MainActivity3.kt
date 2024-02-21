package com.example.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.testapp.databinding.ActivityMain3Binding
import com.example.testapp.databinding.ActivityMainBinding
import com.example.testapp.databinding.ActivityTestBinding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val message1  = intent.getStringExtra("message7")
        val message2  = intent.getStringExtra("message8")
        val message3  = intent.getStringExtra("message9")
        val message4  = intent.getStringExtra("message10")
        val message5  = intent.getStringExtra("message11")
        val message6  = intent.getStringExtra("message12")

        binding.textView1.text = message1
        binding.textView2.text = message2
        binding.textView3.text = message3
        binding.textView4.text = message4
        binding.textView5.text = message5
        binding.textView6.text = message6


    }

    fun onClick(view:View){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}