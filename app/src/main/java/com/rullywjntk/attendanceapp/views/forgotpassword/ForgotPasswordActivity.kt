package com.rullywjntk.attendanceapp.views.forgotpassword

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rullywjntk.attendanceapp.databinding.ActivityForgotPasswordBinding

class ForgotPasswordActivity : AppCompatActivity() {

    // variabel global
    private lateinit var forgotPasswordBinding: ActivityForgotPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        forgotPasswordBinding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(forgotPasswordBinding.root)

        init()
    }

    private fun init() {
        setSupportActionBar(forgotPasswordBinding.toolbarForgotPass)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}