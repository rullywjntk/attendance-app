package com.rullywjntk.attendanceapp.views.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.rullywjntk.attendanceapp.R
import com.rullywjntk.attendanceapp.databinding.ActivityMainBinding
import com.rullywjntk.attendanceapp.views.attendance.AttendanceFragment
import com.rullywjntk.attendanceapp.views.history.HistoryFragment
import com.rullywjntk.attendanceapp.views.profile.ProfileFragment

class MainActivity : AppCompatActivity() {

    // variabel global
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        init()
    }

    private fun init() {
        mainBinding.btmNavMain.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.act_history -> {
                    openFragment(HistoryFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.act_location -> {
                    openFragment(AttendanceFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.act_person -> {
                    openFragment(ProfileFragment())
                    return@setOnNavigationItemSelectedListener true
                }
            }
            return@setOnNavigationItemSelectedListener false
        }
        openHomeFragment()
    }

    private fun openHomeFragment() {
        mainBinding.btmNavMain.selectedItemId = R.id.act_location
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_main, fragment)
            .addToBackStack(null)
            .commit()
    }
}