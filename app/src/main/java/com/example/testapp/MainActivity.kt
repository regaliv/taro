package com.example.testapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.testapp.databinding.ActivityMainBinding

@SuppressLint("StaticFieldLeak")




class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    private var a1= 0
    private var a2= 0
    private var a3= 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val message1  = intent.getStringExtra("key1")
        if (message1 != null) {
            a1=message1.toInt()
        }
        val message2  = intent.getStringExtra("key2")
        if (message2 != null) {
            a2=message2.toInt()
        }
        val message3  = intent.getStringExtra("key3")
        if (message3 != null) {
            a3=message3.toInt()
        }

        Log.d("MyLog","1 $message1")
        Log.d("MyLog","1 $message2")
        Log.d("MyLog","1 $message3")



    }
    fun onClick(view: View){

    if (!isFieldEmpty()) {
        val a = binding.editTextA.text.toString()
        val b = binding.editTextB.text.toString()
        val c = binding.editTextC.text.toString()
        val d = binding.editTextD.text.toString()
        val e = binding.editTextE.text.toString()
        val f = binding.editTextF.text.toString()


        /* val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
       */
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("message1", a)
        intent.putExtra("message2", b)
        intent.putExtra("message3", c)
        intent.putExtra("message4", d)
        intent.putExtra("message5", e)
        intent.putExtra("message6", f)

        intent.putExtra("key1",a1.toString())
        intent.putExtra("key2",a2.toString())
        intent.putExtra("key3",a3.toString())


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