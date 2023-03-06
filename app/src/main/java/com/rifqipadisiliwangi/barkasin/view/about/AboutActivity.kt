package com.rifqipadisiliwangi.barkasin.view.about

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rifqipadisiliwangi.barkasin.R
import com.rifqipadisiliwangi.barkasin.databinding.ActivityAboutBinding
import com.rifqipadisiliwangi.barkasin.view.MainActivity

class AboutActivity : AppCompatActivity() {

    private lateinit var _binding : ActivityAboutBinding
    private var userInfo: MainActivity.UserInfo? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(_binding.root)


        _binding.ivBack.setOnClickListener {
         startActivity(Intent(this, MainActivity::class.java))
        }

        userInfo = intent.getSerializableExtra("serialzable") as MainActivity.UserInfo?
        val name: String = userInfo?.getName().toString()
        val email: String = userInfo?.getEmail().toString()
        _binding.tvEmail.text = email
        _binding.tvNamaUser.text = name
    }
}