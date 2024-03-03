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

    private var g1=0
    private var g2=0
    private var g3=0

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

        val message7  = intent.getStringExtra("key1")
        val message8  = intent.getStringExtra("key2")
        val message9  = intent.getStringExtra("key3")

         Log.d("MyLog"," Activity2- 2 $message7")
         Log.d("MyLog"," Activity2- 2 $message8")
         Log.d("MyLog"," Activity2- 2 $message9")

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

        if (message7 != null) {
            g1=message7.toInt()
        }
        if (message8 != null) {
            g2=message8.toInt()
        }
        if (message9 != null) {
            g3=message9.toInt()
        }

        Log.d("MyLog"," Activity2 q1 $g1")
        Log.d("MyLog"," Activity2 q1 $g2")
        Log.d("MyLog"," Activity2 q1 $g3")



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

            a2 = (a - a1)
            b2 = (b - b1)
            c2 = (c - c1)
            d2 = (d - d1)
            e2 = (e - e1)
            f2 = (f - f1)





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

            intent.putExtra("key1", g1.toString())
            intent.putExtra("key2", g2.toString())
            intent.putExtra("key3", g3.toString())

            if (g1 !=0 && a2<100 || a2>110) intent.putExtra("tok1","1")
            if (g1 !=0 && b2<100 || b2>110) intent.putExtra("tok2","1")
            if (g1 !=0 && c2<100 || c2>110) intent.putExtra("tok3","1")
            if (g1 !=0 && d2<100 || d2>110) intent.putExtra("tok4","1")
            if (g1 !=0 && e2<100 || e2>110) intent.putExtra("tok5","1")
            if (g1 !=0 && f2<100 || f2>110) intent.putExtra("tok6","1")

            if (g2 !=0 && a2<85 || a2>90) intent.putExtra("tok7","1")
            if (g2 !=0 && b2<85 || b2>90) intent.putExtra("tok8","1")
            if (g2 !=0 && c2<85 || c2>90) intent.putExtra("tok9","1")
            if (g2 !=0 && d2<85 || d2>90) intent.putExtra("tok10","1")
            if (g2 !=0 && e2<85 || e2>90) intent.putExtra("tok11","1")
            if (g2 !=0 && f2<85 || f2>90) intent.putExtra("tok12","1")

            if (g3 !=0 && a2<80 || a2>90) intent.putExtra("tok13","1")
            if (g3 !=0 && b2<80 || b2>90) intent.putExtra("tok14","1")
            if (g3 !=0 && c2<80 || c2>90) intent.putExtra("tok15","1")
            if (g3 !=0 && d2<80 || d2>90) intent.putExtra("tok16","1")
            if (g3 !=0 && e2<80 || e2>90) intent.putExtra("tok17","1")
            if (g3 !=0 && f2<80 || f2>90) intent.putExtra("tok18","1")



            startActivity(intent)




        }
    }

    fun isTest(){
        if (g1 != 0 && a2 <100 || a2 >110){
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("tok1","1")
            startActivity(intent)
        }else

            intent.putExtra("tok1","0")
        startActivity(intent)




        if (g1 != 0 && b2 <100 || b2 >110){
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("tok2","1")
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