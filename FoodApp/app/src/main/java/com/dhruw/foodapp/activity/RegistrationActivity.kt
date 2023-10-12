package com.dhruw.foodapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.dhruw.foodapp.R

class RegistrationActivity : AppCompatActivity() {

    lateinit var editName : EditText
    lateinit var editEmailId: EditText
    lateinit var editMobileNumber: EditText
    lateinit var editAddress: EditText
    lateinit var editPassword: EditText
    lateinit var editConfPassword: EditText
    private lateinit var btnRegister : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        editName = findViewById(R.id.editName)
        editEmailId =findViewById(R.id.editEmail)
        editMobileNumber = findViewById(R.id.editMobileNumber)
        editAddress = findViewById(R.id.editDeliveryAddress)
        editPassword = findViewById(R.id.editPassword)
        editConfPassword = findViewById(R.id.editConfirmPassword)
        btnRegister = findViewById(R.id.btnRegister)


        btnRegister.setOnClickListener{

           /*  if(editMobileNumber.text.length == 10 && editName.text.length>=4 &&
                 editEmailId.text.isNotBlank() && editAddress.text.isNotBlank()&&
                 editPassword.text.toString().equals(editConfPassword.text.toString())){

                 intent = Intent(this@RegistrationActivity, AfterRegistrationAndForgotPasswordActivity::class.java)
                 intent.putExtra("txtName", editName.text.toString())
                 intent.putExtra("txtEmail", editEmailId.text.toString())
                 intent.putExtra("txtMobileNumber", editMobileNumber.text.toString())
                 intent.putExtra("txtDeliveryAddress", editAddress.text.toString())
                 intent.putExtra("txtPassword", editPassword.text.toString())
                 intent.putExtra("txtConfPassword", editConfPassword.text.toString())
                 startActivity(intent)
             }
            else{
                 Toast.makeText(this, "Please enter valid credentials", Toast.LENGTH_SHORT).show()
             }*/

            if(editMobileNumber.text.length==10 && editName.text.length>=2 && editEmailId.text.isNotBlank()&& editAddress.text.isNotBlank()&&editPassword.text.toString().equals(editConfPassword.text.toString())){
                intent= Intent(this@RegistrationActivity, AfterRegistrationAndForgotPasswordActivity::class.java)
                intent.putExtra("txtName", editName.text.toString())
                intent.putExtra("txtEmail", editEmailId.text.toString())
                intent.putExtra("txtMobileNumber",editMobileNumber.text.toString())
                intent.putExtra("txtDeliveryAddress",editAddress.text.toString())
                intent.putExtra("txtPassword",editPassword.text.toString())
                intent.putExtra("txtConfPassword",editConfPassword.text.toString())
                startActivity(intent)
            }else{
                Toast.makeText(this,"Please enter valid credentials", Toast.LENGTH_SHORT).show()
            }
        }
    }
}