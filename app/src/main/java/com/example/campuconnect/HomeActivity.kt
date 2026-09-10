package com.example.campuconnect

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val profileButton = findViewById<Button>(R.id.btnProfile)
        val courseButton = findViewById<Button>(R.id.btnCourse)

        profileButton.setOnClickListener {
            loadFragment(ProfileFragment())
        }

        courseButton.setOnClickListener {
            loadFragment(CourseRegistrationFragment())
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}