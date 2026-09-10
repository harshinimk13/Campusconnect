package com.example.campuconnect

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class RegistrationConfirmationActivity : AppCompatActivity() {

    private val CHANNEL_ID = "registration_channel"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_registration_confirmation)

        val course = intent.getStringExtra("COURSE_NAME")
        val semester = intent.getStringExtra("SEMESTER")

        val tvCourse = findViewById<TextView>(R.id.tvCourse)
        val tvSemester = findViewById<TextView>(R.id.tvSemester)
        val btnBackHome = findViewById<Button>(R.id.btnBackHome)

        tvCourse.text = "Course: $course"
        tvSemester.text = "Semester: $semester"

        createNotificationChannel()

        showNotification(course ?: "Course")

        btnBackHome.setOnClickListener {

            val intent = Intent(
                this,
                HomeActivity::class.java
            )

            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP

            startActivity(intent)

            finish()
        }
    }

    private fun createNotificationChannel() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            val channel = NotificationChannel(
                CHANNEL_ID,
                "Course Registration",
                NotificationManager.IMPORTANCE_DEFAULT
            )

            val manager =
                getSystemService(NotificationManager::class.java)

            manager.createNotificationChannel(channel)
        }
    }

    private fun showNotification(course: String) {

        val notification =
            NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle("CampusConnect")
                .setContentText(
                    "$course registration successful"
                )
                .setPriority(
                    NotificationCompat.PRIORITY_DEFAULT
                )
                .build()

        if (Build.VERSION.SDK_INT < 33 ||
            checkSelfPermission(
                android.Manifest.permission.POST_NOTIFICATIONS
            ) == android.content.pm.PackageManager.PERMISSION_GRANTED
        ) {

            NotificationManagerCompat
                .from(this)
                .notify(1, notification)
        }
    }
}