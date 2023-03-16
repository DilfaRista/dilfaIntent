package com.belajarmpbile2.dilfaintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity2 : AppCompatActivity(), View.OnClickListener{

    private lateinit var buttona : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        buttona = findViewById(R.id.buttona)
        buttona.setOnClickListener(this)
    }
    override fun onClick(v: View){
        when(v.id){
            R.id.buttona -> {
                val intent = Intent(this@MainActivity2, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}