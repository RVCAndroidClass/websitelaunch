package com.example.websitelaunch

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    val wsitename = arrayOf("Choose One","Google","Apple","Microsoft")
    val wsiteurl = arrayOf("#","https://google.com", "https://apple.com","https://microsoft.com")
    var count = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spin = findViewById<Spinner>(R.id.spinner)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, wsitename)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spin.adapter = adapter

        val intent = Intent(this, Main2Activity::class.java)

        spin.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                println("position" + position)
                if (count == 0){
                    count = 1
                }else{
                    //putExtra sets value to name SendStuff (Could be called whatever you want
                    intent.putExtra("SendStuff",wsiteurl[position])
                    //Go to second activity
                    startActivity(intent)
                }

            }
        }

    }




}
