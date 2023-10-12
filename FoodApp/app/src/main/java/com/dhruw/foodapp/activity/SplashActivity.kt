package com.dhruw.foodapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.lifecycle.lifecycleScope
import com.dhruw.foodapp.R
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
/*
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )*/

        lifecycleScope.launch {
            Handler(Looper.getMainLooper()).postDelayed({

                val startSplash = Intent(this@SplashActivity, LoginActivity::class.java)
                startActivity(startSplash)
                finish() // pop activity from stack
            }, 3000)
        }
    }
}