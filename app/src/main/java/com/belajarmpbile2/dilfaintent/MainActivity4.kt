package com.belajarmpbile2.dilfaintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity4 : AppCompatActivity(), View.OnClickListener {
    companion object{
        const val EXTRA_TEXT = "extra_text"
    }
    private lateinit var buttono1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        buttono1 = findViewById(R.id.buttono1)
        buttono1.setOnClickListener(this)
    }
    override fun onClick(v: View){
        when(v.id){
            R.id.buttono1 -> {
                val intent = Intent(this@MainActivity4, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}