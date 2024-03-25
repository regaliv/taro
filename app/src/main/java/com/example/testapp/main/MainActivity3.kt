package com.example.testapp.main

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
import com.example.testapp.R
import com.example.testapp.databinding.ActivityMainBinding
import com.example.testapp.databinding.ActivityTestBinding
import com.google.android.material.internal.WindowUtils

open class MainActivity3 : AppCompatActivity() {

    private var g1= 0
    private var g2= 0
    private var g3= 0



    private var a2 = 0.0
    private var b2 = 0.0
    private var c2 = 0.0
    private var d2 = 0.0
    private var e2 = 0.0
    private var f2 = 0.0





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





        if (message1 != null) {
            a2= message1.toDouble()
        }


        if (message2 != null) {
            b2= message2.toDouble()
        }

        if (message3 != null) {
            c2= message3.toDouble()
        }
        if (message4 != null) {
            d2= message4.toDouble()
        }
        if (message5 != null) {
            e2= message5.toDouble()
        }
        if (message6 != null) {
            f2= message6.toDouble()
        }




           val aaaa = String.format("%.2f", a2)
           val bbbb = String.format("%.2f", b2)
           val cccc = String.format("%.2f", c2)
           val dddd = String.format("%.2f", d2)
           val eeee = String.format("%.2f", e2)
           val ffff = String.format("%.2f", f2)








        binding.textView1.text = aaaa
        binding.textView2.text = bbbb
        binding.textView3.text = cccc
        binding.textView4.text = dddd
        binding.textView5.text = eeee
        binding.textView6.text = ffff







        Log.d("MyLog"," Activity3  message1= $message1")
       // Log.d("MyLog"," Activity3  intValue= $intValue")



        val message7  = intent.getStringExtra("key1")
        val message8  = intent.getStringExtra("key2")
        val message9  = intent.getStringExtra("key3")
        Log.d("MyLog", "$message7")
        Log.d("MyLog", "$message8")
        Log.d("MyLog", "$message9")

        if (message7 != null) {
            g1 = message7.toInt()
        }
        if (message8 != null) {
            g2 = message8.toInt()
        }
        if (message9 != null) {
            g3 = message9.toInt()
        }

        // Код для вывода названия вида поверхности.

        // проверка по новой PF

        if (g1!=0){
            pF()
        }


        // проверка по новой PPl
        if (g2!=0){
            ppL()
        }

        //проверка по новой skaida

        if (g3!=0){
           skiDa()
        }



        Log.d("MyLog", "Test222  ++ $g1")
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
    fun pF(){
        if (g1 !=0 && a2<95 || a2 >115) {
            val textView = findViewById<TextView>(R.id.textView1)
            textView.setTextColor(ContextCompat.getColor(this, R.color.red))
        }
        if (g1 !=0 && b2<95 || b2>115) {
            val textView = findViewById<TextView>(R.id.textView2)
            textView.setTextColor(ContextCompat.getColor(this, R.color.red))
        }

        if (g1 !=0 && c2<95 || c2>115){
            val textView = findViewById<TextView>(R.id.textView3)
            textView.setTextColor(ContextCompat.getColor(this, R.color.red))

        }
        if (g1 !=0 && d2<95 || d2>115){
            val textView = findViewById<TextView>(R.id.textView4)
            textView.setTextColor(ContextCompat.getColor(this, R.color.red))
        }
        if (g1 !=0 && e2<95 || e2>115){
            val textView = findViewById<TextView>(R.id.textView5)
            textView.setTextColor(ContextCompat.getColor(this, R.color.red))
        }
        if (g1 !=0 && f2<95 || f2>115){
            val textView = findViewById<TextView>(R.id.textView6)
            textView.setTextColor(ContextCompat.getColor(this, R.color.red))
        }


    }

    fun ppL(){
        if (g2 !=0 && a2<80 || a2 >95) {
            val textView = findViewById<TextView>(R.id.textView1)
            textView.setTextColor(ContextCompat.getColor(this, R.color.red))
        }
        if (g2 !=0 && b2<80 || b2>95) {
            val textView = findViewById<TextView>(R.id.textView2)
            textView.setTextColor(ContextCompat.getColor(this, R.color.red))
        }

        if (g2 !=0 && c2<80 || c2>95){
            val textView = findViewById<TextView>(R.id.textView3)
            textView.setTextColor(ContextCompat.getColor(this, R.color.red))
        }
        if (g2 !=0 && d2<80 || d2>95){
            val textView = findViewById<TextView>(R.id.textView4)
            textView.setTextColor(ContextCompat.getColor(this, R.color.red))
        }
        if (g2 !=0 && e2<80 || e2>95){
            val textView = findViewById<TextView>(R.id.textView5)
            textView.setTextColor(ContextCompat.getColor(this, R.color.red))
        }
        if (g2 !=0 && f2<80 || f2>95){
            val textView = findViewById<TextView>(R.id.textView6)
            textView.setTextColor(ContextCompat.getColor(this, R.color.red))
        }


    }
    fun skiDa(){
        if (g3 !=0 && a2<75 || a2 >95) {
            val textView = findViewById<TextView>(R.id.textView1)
            textView.setTextColor(ContextCompat.getColor(this, R.color.red))
        }
        if (g3 !=0 && b2<75 || b2>95) {
            val textView = findViewById<TextView>(R.id.textView2)
            textView.setTextColor(ContextCompat.getColor(this, R.color.red))
        }

        if (g3 !=0 && c2<75 || c2>95){
            val textView = findViewById<TextView>(R.id.textView3)
            textView.setTextColor(ContextCompat.getColor(this, R.color.red))
            ppL()
        }
        if (g3 !=0 && d2<75 || d2>95){
            val textView = findViewById<TextView>(R.id.textView4)
            textView.setTextColor(ContextCompat.getColor(this, R.color.red))
        }
        if (g3!=0 && e2<75 || e2>95){
            val textView = findViewById<TextView>(R.id.textView5)
            textView.setTextColor(ContextCompat.getColor(this, R.color.red))
        }
        if (g3 !=0 && f2<75 || f2>95){
            val textView = findViewById<TextView>(R.id.textView6)
            textView.setTextColor(ContextCompat.getColor(this, R.color.red))
        }


    }



}


