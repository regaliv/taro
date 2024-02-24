package com.example.testapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.testapp.databinding.ActivityMain2Binding
import com.example.testapp.databinding.ActivityMainBinding
import java.lang.String

class MainActivity2 : AppCompatActivity() {

    private var a1=0.0
    private var b1=0.0
    private var c1=0.0
    private var d1=0.0
    private var e1=0.0
    private var f1=0.0

    private var a2 = 0.0
    private var b2 = 0.0
    private var c2 = 0.0
    private var d2 = 0.0
    private var e2 = 0.0
    private var f2 = 0.0

    private val const: Double = 1/(0.75*0.40)


    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val message1  = intent.getStringExtra("message1")
        val message2  = intent.getStringExtra("message2")
        val message3  = intent.getStringExtra("message3")
        val message4  = intent.getStringExtra("message4")
        val message5  = intent.getStringExtra("message5")
        val message6  = intent.getStringExtra("message6")

        if (message1 != null) {
            a1=message1.toDouble()
        }
        if (message2 != null) {
            b1=message2.toDouble()
        }
        if (message3 != null) {
            c1=message3.toDouble()
        }
        if (message4 != null) {
            d1=message4.toDouble()
        }
        if (message5 != null) {
            e1=message5.toDouble()
        }
        if (message6 != null) {
            f1=message6.toDouble()
        }


    }
    @SuppressLint("DefaultLocale")
    fun onClick(view: View) {
        if (!isFieldEmpty()) {
            val a = binding.editTextA.text.toString().toDouble()
            val b = binding.editTextB.text.toString().toDouble()
            val c = binding.editTextC.text.toString().toDouble()
            val d = binding.editTextD.text.toString().toDouble()
            val e = binding.editTextE.text.toString().toDouble()
            val f = binding.editTextF.text.toString().toDouble()

            a2 = (a - a1)*const
            b2 = (b - b1)*const
            c2 = (c - c1)*const
            d2 = (d - d1)*const
            e2 = (e - e1)*const
            f2 = (f - f1)*const

            val aaaa = String.format("%.2f", a2)
            val bbbb = String.format("%.2f", b2)
            val cccc = String.format("%.2f", c2)
            val dddd = String.format("%.2f", d2)
            val eeee = String.format("%.2f", e2)
            val ffff = String.format("%.2f", f2)




            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("message7", aaaa.toString())
            intent.putExtra("message8", bbbb.toString())
            intent.putExtra("message9", cccc.toString())
            intent.putExtra("message10", dddd.toString())
            intent.putExtra("message11",eeee.toString())
            intent.putExtra("message12", ffff.toString())
            startActivity(intent)


        }
    }

    private fun isFieldEmpty(): Boolean {
        binding.apply {// apply даёт возможность прикрепить к binding несколько активностей
            if (editTextA.text.isNullOrEmpty()) editTextA.error = getString(R.string.no_value_entered)
            if (editTextB.text.isNullOrEmpty()) editTextB.error = getString(R.string.no_value_entered)
            if (editTextC.text.isNullOrEmpty()) editTextC.error = getString(R.string.no_value_entered)
            if (editTextD.text.isNullOrEmpty()) editTextD.error = getString(R.string.no_value_entered)
            if (editTextE.text.isNullOrEmpty()) editTextE.error = getString(R.string.no_value_entered)
            if (editTextF.text.isNullOrEmpty()) editTextF.error = getString(R.string.no_value_entered)


            return editTextA.text.isNullOrEmpty() || editTextB.text.isNullOrEmpty() || editTextC.text.isNullOrEmpty()
                    || editTextD.text.isNullOrEmpty() || editTextE.text.isNullOrEmpty() || editTextF.text.isNullOrEmpty()
        }

    }
}