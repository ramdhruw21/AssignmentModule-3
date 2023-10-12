package com.dhruw.foodapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.dhruw.foodapp.R

class AfterRegistrationAndForgotPasswordActivity : AppCompatActivity() {

    lateinit var txtName: TextView
    lateinit var txtEmail:TextView
    lateinit var txtMobileNumber:TextView
    lateinit var txtDelivery:TextView
    lateinit var txtPassword:TextView
    lateinit var txtConfPassword:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_registration_and_forgot_password)

        txtName = findViewById(R.id.txtName)
        txtEmail = findViewById(R.id.txtEmail)
        txtMobileNumber = findViewById(R.id.txtMobileNumber)
        txtDelivery = findViewById(R.id.txtDeliveryAddress)
        txtPassword = findViewById(R.id.txtPassword)
        txtConfPassword = findViewById(R.id.txtConfPassword)

        if (intent!=null){

               txtName.text = intent.getStringExtra("txtName")
               txtEmail.text = intent.getStringExtra("txtEmail")
               txtMobileNumber.text = intent.getStringExtra("txtMobileNumber")
               txtDelivery.text = intent.getStringExtra("txtDeliveryAddress")
               txtPassword.text = intent.getStringExtra("txtPassword")
               txtConfPassword.text = intent.getStringExtra("txtConfPassword")
        }

    }
}