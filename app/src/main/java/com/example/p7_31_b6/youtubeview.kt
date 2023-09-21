package com.example.p7_31_b6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.webkit.WebSettings
import androidx.core.view.WindowCompat
import com.example.p7_31_b6.databinding.ActivityYoutubeviewBinding

class youtubeview : AppCompatActivity() {
    private lateinit var binding: ActivityYoutubeviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window,false)
        super.onCreate(savedInstanceState)

        binding = ActivityYoutubeviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initvideoplayer()

    }
    private val youtubeid = "LJdmAIzYwZA"

    private fun initvideoplayer(){
        val webSettings: WebSettings = binding.mywebview.settings
        webSettings.javaScriptEnabled=true
        webSettings.loadWithOverviewMode=true
        webSettings.useWideViewPort=true
        binding.mywebview.loadUrl("https://www.youtube.com/embed/$youtubeid")
    }
}