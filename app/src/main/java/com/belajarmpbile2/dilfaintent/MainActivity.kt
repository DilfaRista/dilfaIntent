package com.belajarmpbile2.dilfaintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var buttone : Button
    private lateinit var buttona1 : Button
    private lateinit var btn1 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttone = findViewById(R.id.buttone)
        buttone.setOnClickListener(this)
        buttona1 = findViewById(R.id.buttona1)
        buttona1.setOnClickListener(this)
        btn1 = findViewById(R.id.btn1)
        btn1.setOnClickListener(this)
    }
    override fun onClick(v: View){
        when(v.id){
            R.id.buttone -> {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)
            }
        }
        when(v.id){
        R.id.buttona1 -> {
            val intent = Intent(this@MainActivity, MainActivity3::class.java)
            startActivity(intent)
        }
        }
        when(v.id){
            R.id.btn1 -> run {
                val intentdata = Intent(this@MainActivity, MainActivity4::class.java)
                intentdata.putExtra(MainActivity4.EXTRA_TEXT, "Halo Mari belajar Intent")
                startActivity(intentdata)
            }
        }
    }
}