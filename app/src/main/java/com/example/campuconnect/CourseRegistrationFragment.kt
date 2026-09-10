package com.example.campuconnect

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class CourseRegistrationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(
            R.layout.fragment_course_registration,
            container,
            false
        )

        val courseName = view.findViewById<EditText>(
            R.id.etCourseName
        )

        val semesterGroup = view.findViewById<RadioGroup>(
            R.id.rgSemester
        )

        val registerButton = view.findViewById<Button>(
            R.id.btnRegister
        )

        registerButton.setOnClickListener {

            val course = courseName.text.toString()

            val selectedSemesterId =
                semesterGroup.checkedRadioButtonId

            if (course.isEmpty()) {

                Toast.makeText(
                    requireContext(),
                    "Please enter course name",
                    Toast.LENGTH_SHORT
                ).show()

                return@setOnClickListener
            }

            if (selectedSemesterId == -1) {

                Toast.makeText(
                    requireContext(),
                    "Please select semester",
                    Toast.LENGTH_SHORT
                ).show()

                return@setOnClickListener
            }

            val selectedRadioButton =
                view.findViewById<RadioButton>(
                    selectedSemesterId
                )

            val semester =
                selectedRadioButton.text.toString()

            val intent = Intent(
                requireContext(),
                RegistrationConfirmationActivity::class.java
            )

            intent.putExtra("COURSE_NAME", course)
            intent.putExtra("SEMESTER", semester)

            startActivity(intent)
        }

        return view
    }
}