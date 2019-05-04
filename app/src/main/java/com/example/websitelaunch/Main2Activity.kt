package com.example.websitelaunch

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView

class Main2Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val mywebview = findViewById<WebView>(R.id.webView)
        var strURL: String = intent.getStringExtra("SendStuff")
        println(strURL)

        if (mywebview != null) {

            val webSettings = mywebview.settings
            webSettings.javaScriptEnabled = true
            mywebview.fitsSystemWindows = true
           // mywebview.settings = webSettings
            mywebview.loadUrl(strURL)
            //mywebview.webViewClient =  WebViewClient()
        }

    }


}
