package com.example.btn

import android.bluetooth.BluetoothA2dp
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global.putInt
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlin.random.Random

class MainActivity :  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btn)
        val sharedPreferences = getSharedPreferences("shareprefs", MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        var color:Int
        val past = sharedPreferences.getInt("name",111111)
        btn.setBackgroundColor(past)




        btn.setOnClickListener() {



                val rnd = Random //kotlin.random
                color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))


            editor.putInt("name",color).commit()









//            val colors = arrayOf(
//                Color.parseColor("#FFFFFF"),
//                Color.parseColor("#000000"),
//                Color.parseColor("#FF8F00"),
//                Color.parseColor("#EF6C00"),
//                Color.parseColor("#D84315"),
//                Color.parseColor("#37474F"),
//            )
//            val randomColor = colors.random()

            btn.setBackgroundColor(color)

            Toast.makeText(this, "Colour Changed!", Toast.LENGTH_SHORT).show()




            }






        }


    }















