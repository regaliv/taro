package com.example.testapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.testapp.databinding.ActivityMain5Binding
import kotlin.properties.Delegates
import kotlin.time.times

class MainActivity5 : AppCompatActivity() {



    val pf_c = 0.422
    val pf_c_m = 0.316
   // val pf_c = 5


    val ppl_hpl_c = 0.507
   // val ppl_hpl_c = 10
    val skaida_c = 0.401
   // val skaida_c = 15

    val pf_cP = 0.316
    val pfmazakP = 0.269
    val ppl_hpl_cP = 0.380
    val skaida_cP = 0.301


    lateinit var binding: ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain5Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val button = findViewById<View>(R.id.button7)
        button.setOnClickListener {

                val result = getResult()
                val result2 = getResult2()
                binding.kopa.text = result
                binding.kopa2.text = result2
        }
        val myCheckBox: CheckBox = findViewById(R.id.checkBox)
        myCheckBox.setOnClickListener {
            val isCheck = myCheckBox.isChecked
            if (isCheck){
                binding.CL.visibility = View.VISIBLE
            }else{
                binding.CL.visibility = View.GONE
            }
        }
    }








    private  fun getResult():String{

        var pf:Double
        val ppl:Double
        val sk:Double
        val pfM:Double



        binding.apply {

            pfM = if (editTextText2.text.isNullOrEmpty()){
                0.0
            }else
                editTextText2.text.toString().toDouble()

           pf = if (editText.text.isNullOrEmpty()){
               0.0
           }else
               editText.text.toString().toDouble()

            ppl = if (editText2.text.isNullOrEmpty()){
                0.0
            }else
                editText2.text.toString().toDouble()

            sk = if (editText3.text.isNullOrEmpty()) {
                0.0
            }else
                editText3.text.toString().toDouble()
        }
        val x = (pf*pf_c)+(pfM*pf_c_m)+(ppl*ppl_hpl_c)+(sk*skaida_c)
        val aaaa = String.format("%.2f", x)

        return aaaa

    }

    private  fun getResult2():String{

        var pf:Double
        val ppl:Double
        val sk:Double
        val pfM:Double



        binding.apply {

            pfM = if (editTextText2.text.isNullOrEmpty()){
                0.0
            }else
                editTextText2.text.toString().toDouble()

            pf = if (editText.text.isNullOrEmpty()){
                0.0
            }else
                editText.text.toString().toDouble()

            ppl = if (editText2.text.isNullOrEmpty()){
                0.0
            }else
                editText2.text.toString().toDouble()

            sk = if (editText3.text.isNullOrEmpty()) {
                0.0
            }else
                editText3.text.toString().toDouble()
        }
        val x1 = (pf*pf_cP)+(pfM*pfmazakP)+(ppl*ppl_hpl_cP)+(sk*skaida_cP)
        val aaaa = String.format("%.2f", x1)

        return aaaa

    }
}
// val aaaa = String.format("%.2f", a2)