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
import android.widget.Toast
import com.example.testapp.databinding.ActivityMainBinding
import com.example.testapp.databinding.ActivityTestBinding
import com.google.android.material.internal.WindowUtils
import java.lang.String

class MainActivity3 : AppCompatActivity() {

    private var g1= 0
    private var g2= 0
    private var g3= 0

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

        var message7  = intent.getStringExtra("key1")
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