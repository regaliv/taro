package com.example.testapp.stundas

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.lessonsqlitekotlin.db.MyDbManager

import com.example.testapp.databinding.ActivityMain6Binding
import java.time.LocalDate
import java.time.LocalTime
import java.util.Calendar

class MainActivity6 : AppCompatActivity() {
    lateinit var binding: ActivityMain6Binding
    var a1 = 0
    var a2 = 0


    val myDbManager = MyDbManager(this)


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain6Binding.inflate(layoutInflater)
        setContentView(binding.root)


        //date()

        val message1  = intent.getStringExtra("key1")


        myDbManager.openBd()

        if (message1 != null) {
            myDbManager.insertToBd( date(),message1)
        }



        val dataList = myDbManager.redDbData()

        for (item in dataList){
            binding.tvTest.append(item)
            binding.tvTest.append("\n")


        }


    }
    override fun onResume() {
        super.onResume()
        myDbManager.openBd()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun date(): String {
        val currentDate = LocalDate.now()
        val dayofMonth = currentDate.dayOfMonth
        val month = currentDate.monthValue
        val currentTime = LocalTime.now()
        val hour = currentTime.hour
        val minute = currentTime.minute
        val second = currentTime.second
        return "$dayofMonth.$month"
    }

}