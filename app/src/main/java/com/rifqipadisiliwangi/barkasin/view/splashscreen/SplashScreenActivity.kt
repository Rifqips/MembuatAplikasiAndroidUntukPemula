package com.rifqipadisiliwangi.barkasin.view.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.result.contract.ActivityResultContracts
import com.rifqipadisiliwangi.barkasin.databinding.ActivitySplashScreenBinding
import com.rifqipadisiliwangi.barkasin.view.MainActivity

class SplashScreenActivity : AppCompatActivity() {

    private  lateinit var binding : ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        Handler(Looper.myLooper()!!).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
        }, 3000)
        setContentView(binding.root)
    }
}