package com.rullywjntk.attendanceapp.views.changepassword

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rullywjntk.attendanceapp.databinding.ActivityChangePasswordBinding

class ChangePasswordActivity : AppCompatActivity() {

    // variabel global
    private lateinit var changePasswordBinding: ActivityChangePasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        changePasswordBinding = ActivityChangePasswordBinding.inflate(layoutInflater)
        setContentView(changePasswordBinding.root)

        init()
        onClick()
    }

    private fun onClick() {
        changePasswordBinding.toolbarChangePass.setNavigationOnClickListener {
            finish()
        }
    }

    private fun init() {
        setSupportActionBar(changePasswordBinding.toolbarChangePass)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}