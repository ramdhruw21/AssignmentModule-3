package com.dhruw.foodapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.dhruw.foodapp.R



class LoginActivity : AppCompatActivity() {

    lateinit var editMobileNumber: EditText
    lateinit var editPassword : EditText
    lateinit var btnLogin : Button
    lateinit var txtForgotPassword : TextView
    lateinit var txtSignUp : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        editMobileNumber = findViewById(R.id.editMobileNumber)
        editPassword = findViewById(R.id.editPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        txtSignUp = findViewById(R.id.txtSignUp)



        //User Login
        btnLogin.setOnClickListener{

            var intent = Intent(this@LoginActivity, AfterLoginActivity::class.java)
            val mobileNumber = editMobileNumber.text.toString()
            val password = editPassword.text.toString()

            if(mobileNumber.length == 10 && password.length>=4){

                    intent.putExtra("mobileNumber", "Mobile Number :$mobileNumber")
                    intent.putExtra("password", "password:$password")
                    startActivity(intent)
            }
            else{
                Toast.makeText(this@LoginActivity, "Please enter valid credentials", Toast.LENGTH_SHORT).show()
            }
        }

        txtForgotPassword.setOnClickListener{

            var intent = Intent(this@LoginActivity,ForgotPasswordActivity::class.java)
                  startActivity(intent)
        }
        txtSignUp.setOnClickListener{

             var intent = Intent(this@LoginActivity, RegistrationActivity::class.java )
              startActivity(intent)
        }

    }
}