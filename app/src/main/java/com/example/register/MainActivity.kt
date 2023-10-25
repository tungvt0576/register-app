package com.example.register

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var firstNameEditText: EditText
    private lateinit var lastNameEditText: EditText
    private lateinit var maleRadioButton: RadioButton
    private lateinit var femaleRadioButton: RadioButton
    private lateinit var birthdayEditText: EditText
    private lateinit var addressEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var agreementCheckBox: CheckBox
    private lateinit var registerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Khởi tạo các view
        firstNameEditText = findViewById(R.id.first_name_edittext)
        lastNameEditText = findViewById(R.id.last_name_edittext)
        maleRadioButton = findViewById(R.id.male_radio_button)
        femaleRadioButton = findViewById(R.id.female_radio_button)
        birthdayEditText = findViewById(R.id.birthday)
        addressEditText = findViewById(R.id.address)
        emailEditText = findViewById(R.id.email)
        agreementCheckBox = findViewById(R.id.agreement_checkbox)
        registerButton = findViewById(R.id.register_button)

        // Thiết lập sự kiện cho nút "Register"
        registerButton.setOnClickListener { onRegisterButtonClick() }
    }

    private fun onRegisterButtonClick() {
        // Lấy dữ liệu từ các trường nhập
        val firstName = firstNameEditText.text.toString()
        val lastName = lastNameEditText.text.toString()
        val gender = if (maleRadioButton.isChecked) "Male" else "Female"
        val birthday = birthdayEditText.text.toString()
        val address = addressEditText.text.toString()
        val email = emailEditText.text.toString()
        val agreementChecked = agreementCheckBox.isChecked

        // Kiểm tra xem các trường đã được điền đầy đủ và CheckBox đã được chọn
        if (firstName.isEmpty() || lastName.isEmpty() || birthday.isEmpty() || address.isEmpty() || email.isEmpty() || !agreementChecked) {
            Toast.makeText(this, "Please fill in all fields and agree to the terms of use.", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Registration successful!", Toast.LENGTH_SHORT).show()
        }
    }
}
