package com.example.lessonsqlitekotlin.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase

class MyDbManager(  context: Context) {
  val  myDbHelper = MyDbHelper(context)

  var db: SQLiteDatabase? = null


  fun openBd(){
      db = myDbHelper.writableDatabase
  }
  fun insertToBd(title: String, content: String){
      val values  = ContentValues().apply {
          put(MyDbNameClass.COLUMN_NAME_TITLE, title)
          put(MyDbNameClass.COLUMN_NAME_CONTENT, content)


      }

      db?.insert(MyDbNameClass.TABLE_NAME, null, values)
  }
        fun redDbData():ArrayList<String>{
            val dataList = ArrayList<String>()
            val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null,
                null, null, null, null)

            with(cursor){
                while (this?.moveToNext()!!){
                    val dataText = cursor?.getString(cursor.getColumnIndexOrThrow(MyDbNameClass.COLUMN_NAME_TITLE))
                    val dataText2 = cursor?.getString(cursor.getColumnIndexOrThrow(MyDbNameClass.COLUMN_NAME_CONTENT))
                    dataList.add(dataText.toString())
                    dataList.add(dataText2.toString())
                }
            }
            cursor?.close()
            return dataList
        }
    fun closeDB(){
        myDbHelper.close()
    }




}