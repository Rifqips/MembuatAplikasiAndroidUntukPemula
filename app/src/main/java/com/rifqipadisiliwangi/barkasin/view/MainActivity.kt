package com.rifqipadisiliwangi.barkasin.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.rifqipadisiliwangi.barkasin.view.adapter.AdapterBarangBekas
import com.rifqipadisiliwangi.barkasin.model.BarkasSingleton
import com.rifqipadisiliwangi.barkasin.databinding.ActivityMainBinding
import com.rifqipadisiliwangi.barkasin.view.about.AboutActivity
import com.rifqipadisiliwangi.barkasin.view.detail.DetilActivity
import java.io.Serializable

class MainActivity : AppCompatActivity() {

    private lateinit var _binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)
        recyclerShown()

        _binding.ivUser.setOnClickListener {
            if (TextUtils.isEmpty(_binding.tvUsername.text.toString()) && TextUtils.isEmpty(_binding.tvEmail.text.toString())) {
                Toast.makeText(this, "Something is wrong kindly check", Toast.LENGTH_LONG).show()
            } else {
                sendUserData(_binding.tvUsername.text.toString(), _binding.tvEmail.text.toString())
            }

        }
    }

    private fun recyclerShown(){
        _binding.rvBarkas.adapter = AdapterBarangBekas(BarkasSingleton.listProduk)
        _binding.rvBarkas.layoutManager =  GridLayoutManager(this,2)
    }

    private fun sendUserData(username: String, userEmail: String) {
        val userInfo = UserInfo()
        userInfo.setName(username)
        userInfo.setEmail(userEmail)
        val send = Intent(this@MainActivity, AboutActivity::class.java)
        val b = Bundle()
        b.putSerializable("serialzable", userInfo)
        send.putExtras(b)
        startActivity(send)
    }
    class UserInfo : Serializable {
        private lateinit var name: String
        private lateinit var email: String
        fun getName(): String? {
            return name
        }

        @JvmName("setName1")
        fun setName(name: String?) {
            this.name = name!!
        }

        fun getEmail(): String? {
            return email
        }

        @JvmName("setEmail1")
        fun setEmail(email: String?) {
            this.email = email!!
        }
    }
}