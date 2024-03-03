package com.example.testapp

import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.testapp.databinding.ActivityMainBinding
import com.example.testapp.databinding.ActivityTestBinding
import com.google.android.material.internal.WindowUtils
import java.lang.String

class MainActivity3 : AppCompatActivity() {

    private var g1= 0
    private var g2= 0
    private var g3= 0

    private var t1= 0
    private var t2= 0
    private var t3= 0
    private var t4= 0
    private var t5= 0
    private var t6= 0

    private var t11= 0
    private var t22= 0
    private var t33= 0
    private var t44= 0
    private var t55= 0
    private var t66= 0

    private var t111= 0
    private var t222= 0
    private var t333= 0
    private var t444= 0
    private var t555= 0
    private var t667= 0





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


       // Log.d("MyLog"," Activity3  message1= $message1")
       // Log.d("MyLog"," Activity3  intValue= $intValue")



        binding.textView1.text = message1
        binding.textView2.text = message2
        binding.textView3.text = message3
        binding.textView4.text = message4
        binding.textView5.text = message5
        binding.textView6.text = message6

        val message7  = intent.getStringExtra("key1")
        val message8  = intent.getStringExtra("key2")
        val message9  = intent.getStringExtra("key3")

        if (message7 != null) {
            g1=message7.toInt()
        }
        if (message8 != null) {
            g2=message8.toInt()
        }
        if (message9 != null) {
            g3=message9.toInt()
        }

        //~~~Проверка на число в границах POLIFORMS
        //левый низ
        val message10 = intent.getStringExtra("tok1")
        if (message10 != null) {
            t1 = message10.toInt()
        }


        if (t1==1){
            val textView = findViewById<TextView>(R.id.textView1)
            textView.setTextColor(ContextCompat.getColor(this,R.color.red))
        }

        //левый верх
        val message11 = intent.getStringExtra("tok2")
        if (message11 != null) {
            t2 = message11.toInt()
        }
        if (t2==1){
            val textView = findViewById<TextView>(R.id.textView2)
            textView.setTextColor(ContextCompat.getColor(this,R.color.red))
        }

        //средний низ
        val message12 = intent.getStringExtra("tok3")
        if (message12 != null) {
            t3 = message12.toInt()
        }
        if (t3==1){
            val textView = findViewById<TextView>(R.id.textView3)
            textView.setTextColor(ContextCompat.getColor(this,R.color.red))
        }


        // средний верх
        val message13 = intent.getStringExtra("tok4")
        if (message13 != null) {
            t4 = message13.toInt()
        }
        if (t4==1){
            val textView = findViewById<TextView>(R.id.textView4)
            textView.setTextColor(ContextCompat.getColor(this,R.color.red))
        }


        //правый низ
        val message14 = intent.getStringExtra("tok5")
        if (message14 != null) {
            t5 = message14.toInt()
        }
        if (t5==1){
            val textView = findViewById<TextView>(R.id.textView5)
            textView.setTextColor(ContextCompat.getColor(this,R.color.red))
        }
        //средний верх
        val message15 = intent.getStringExtra("tok6")
        if (message15 != null) {
            t6 = message15.toInt()
        }
        if (t6==1){
            val textView = findViewById<TextView>(R.id.textView6)
            textView.setTextColor(ContextCompat.getColor(this,R.color.red))
        }

        //~~~~

        //~~~Проверка на число в границах PPL/HPL
        //левый низ
        val message16 = intent.getStringExtra("tok7")
        if (message16 != null) {
            t11 = message16.toInt()
        }


        if (t11==1){
            val textView = findViewById<TextView>(R.id.textView1)
            textView.setTextColor(ContextCompat.getColor(this,R.color.red))
        }

        //левый верх
        val message17 = intent.getStringExtra("tok8")
        if (message17 != null) {
            t22 = message17.toInt()
        }
        if (t22==1){
            val textView = findViewById<TextView>(R.id.textView2)
            textView.setTextColor(ContextCompat.getColor(this,R.color.red))
        }

        //средний низ
        val message18 = intent.getStringExtra("tok9")
        if (message18 != null) {
            t33 = message18.toInt()
        }
        if (t33==1){
            val textView = findViewById<TextView>(R.id.textView3)
            textView.setTextColor(ContextCompat.getColor(this,R.color.red))
        }


        // средний верх
        val message19 = intent.getStringExtra("tok10")
        if (message19 != null) {
            t44 = message19.toInt()
        }
        if (t44==1){
            val textView = findViewById<TextView>(R.id.textView4)
            textView.setTextColor(ContextCompat.getColor(this,R.color.red))
        }


        //правый низ
        val message20 = intent.getStringExtra("tok11")
        if (message20 != null) {
            t55 = message20.toInt()
        }
        if (t55==1){
            val textView = findViewById<TextView>(R.id.textView5)
            textView.setTextColor(ContextCompat.getColor(this,R.color.red))
        }
        //средний верх
        val message21 = intent.getStringExtra("tok12")
        if (message21 != null) {
            t66 = message21.toInt()
        }
        if (t66==1){
            val textView = findViewById<TextView>(R.id.textView6)
            textView.setTextColor(ContextCompat.getColor(this,R.color.red))
        }

        //~~~~

        //~~~Проверка на число в границах SKAIDA
        //левый низ
        val message22 = intent.getStringExtra("tok13")
        if (message22 != null) {
            t111 = message22.toInt()
        }


        if (t111==1){
            val textView = findViewById<TextView>(R.id.textView1)
            textView.setTextColor(ContextCompat.getColor(this,R.color.red))
        }

        //левый верх
        val message23 = intent.getStringExtra("tok14")
        if (message23 != null) {
            t222 = message23.toInt()
        }
        if (t222==1){
            val textView = findViewById<TextView>(R.id.textView2)
            textView.setTextColor(ContextCompat.getColor(this,R.color.red))
        }

        //средний низ
        val message24 = intent.getStringExtra("tok15")
        if (message24 != null) {
            t333 = message24.toInt()
        }
        if (t333==1){
            val textView = findViewById<TextView>(R.id.textView3)
            textView.setTextColor(ContextCompat.getColor(this,R.color.red))
        }


        // средний верх
        val message25 = intent.getStringExtra("tok16")
        if (message25 != null) {
            t444 = message25.toInt()
        }
        if (t444==1){
            val textView = findViewById<TextView>(R.id.textView4)
            textView.setTextColor(ContextCompat.getColor(this,R.color.red))
        }


        //правый низ
        val message26 = intent.getStringExtra("tok17")
        if (message26 != null) {
            t555 = message26.toInt()
        }
        if (t555==1){
            val textView = findViewById<TextView>(R.id.textView5)
            textView.setTextColor(ContextCompat.getColor(this,R.color.red))
        }
        //средний верх
        val message27 = intent.getStringExtra("tok18")
        if (message27 != null) {
            t667 = message27.toInt()
        }
        if (t667==1){
            val textView = findViewById<TextView>(R.id.textView6)
            textView.setTextColor(ContextCompat.getColor(this,R.color.red))
        }













        Log.d("MyLog", " $message7")
        Log.d("MyLog", "$message8")
        Log.d("MyLog", "$message9")

        if (g1==1 && g2 == 0 && g3 == 0){
            binding.pv2.text = "POLIFOMS"
        }
        if (g1==0 && g2 == 1 && g3 == 0){
            binding.pv2.text = "PPL/HPL"
        }
        if (g1==0 && g2 == 0 && g3 == 1){
            binding.pv2.text = "SKAIDA"
        }

    }


    fun onClick(view: View){
        val view = findViewById<View>(R.id.box)
        val bitmap = takeScreenshot(view)
        saveScreenshotToGallery(bitmap)

    }

    private fun takeScreenshot(view: View):Bitmap{

        val bitmap = Bitmap.createBitmap(view.width, view.height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        view.draw(canvas)
        return bitmap
    }

    private fun saveScreenshotToGallery(bitmap: Bitmap){
        val mediaStore = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        val context: Context = this
        val contentResolver =context.contentResolver

        val values = ContentValues().apply {
            put(MediaStore.Images.Media.DISPLAY_NAME, "Screenshot_${System.currentTimeMillis()}.png")
            put(MediaStore.Images.Media.MIME_TYPE, "image/png")
            put(MediaStore.Images.Media.RELATIVE_PATH, Environment.DIRECTORY_PICTURES)
        }
        val uri = contentResolver.insert(mediaStore,values)



        if (uri != null){
            val sreenshotUri = uri
            val shareIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra((Intent.EXTRA_STREAM),sreenshotUri)
                type = "image/*"
            }
            startActivity(Intent.createChooser(shareIntent,"Отправить скриншот через"))


            val outputStream = contentResolver.openOutputStream(uri)
            if (outputStream != null) {
                bitmap.compress(Bitmap.CompressFormat.PNG,100,outputStream)
                outputStream.close()
            }
            Toast.makeText(this, R.string.The_screenshot_has_been_saved, Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this,"Ошибка при сохранении скриншота", Toast.LENGTH_SHORT).show()
        }
    }


}