package com.rifqipadisiliwangi.barkasin.view.detail

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rifqipadisiliwangi.barkasin.R
import com.rifqipadisiliwangi.barkasin.databinding.ActivityDetilBinding
import com.rifqipadisiliwangi.barkasin.view.MainActivity

class DetilActivity : AppCompatActivity() {

    private lateinit var _binding : ActivityDetilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityDetilBinding.inflate(layoutInflater)
        setContentView(_binding.root)
        getItem()

        _binding.ivBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    fun getItem(){
        val item = intent
        val gambar = item.getIntExtra("gambar",0)
        val title = item?.getStringExtra("title")
        val date = item?.getStringExtra("date")
        val subTitle = item?.getStringExtra("subtitle")
        val number = item?.getStringExtra("number")

        _binding.ivBarangBekas.setImageResource(gambar)
        _binding.tvTitle.text = title
        _binding.tvDate.text = date
        _binding.tvSubTitle.text = subTitle
        _binding.tvUserNumber.text = number
    }
}