package com.example.websitelaunch

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView
import android.webkit.WebViewClient

class Main2Activity : AppCompatActivity() {
    var mywebview: WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
         var strURL: String = intent.getStringExtra("website")
        var strNAME: String = intent.getStringExtra("webname")
        mywebview = findViewById<WebView>(R.id.webView)
        mywebview!!.settings.javaScriptEnabled = true
        mywebview!!.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        mywebview!!.loadUrl(strURL)

    }




}
