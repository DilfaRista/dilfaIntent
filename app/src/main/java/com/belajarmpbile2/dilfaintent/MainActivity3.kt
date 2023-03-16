package com.belajarmpbile2.dilfaintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity3 : AppCompatActivity(), View.OnClickListener {

    private lateinit var buttono : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        buttono= findViewById(R.id.buttono)
        buttono.setOnClickListener(this)
    }

    override fun onClick(v: View){
        when(v.id){
            R.id.buttono -> {
                val intent = Intent(this@MainActivity3, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}