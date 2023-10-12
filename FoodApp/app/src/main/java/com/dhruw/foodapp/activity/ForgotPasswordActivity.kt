package com.dhruw.foodapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.dhruw.foodapp.R

class ForgotPasswordActivity : AppCompatActivity() {

    lateinit var editMobileNumber: EditText
    lateinit var editEmail: EditText
    lateinit var btnNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        editMobileNumber = findViewById(R.id.editMobileNumber)
        editEmail = findViewById(R.id.editEmailId)
        btnNext = findViewById(R.id.btnNext)

        btnNext.setOnClickListener{

               if (editMobileNumber.text.length ==10){

                   intent = Intent(this@ForgotPasswordActivity, AfterRegistrationAndForgotPasswordActivity::class.java)
                   intent.putExtra("txtEmail", editEmail.text.toString())
                   intent.putExtra("txtMobileNumber", editMobileNumber.text.toString())
                   startActivity(intent)
               }else{

                     Toast.makeText(this, "Please enter valid credentials", Toast.LENGTH_SHORT).show()
               }
        }


    }
}