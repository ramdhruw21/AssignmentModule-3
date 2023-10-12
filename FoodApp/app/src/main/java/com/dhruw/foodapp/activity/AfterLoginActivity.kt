package com.dhruw.foodapp.activity

import android.os.Bundle
import android.widget.TextView
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import com.dhruw.foodapp.R

class AfterLoginActivity : AppCompatActivity() {

    lateinit var txtMobileNumber: TextView
    lateinit var txtPassword: TextView
    lateinit var toolbar: Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_login)


        /*toolbar = findViewById(R.id.toolbar_layout)

        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "New Activity"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)*/

        txtMobileNumber = findViewById(R.id.textMobileNumber)
        txtPassword = findViewById(R.id.txtPassword)

        if (intent!=null){

               val password = intent.getStringExtra("password").toString()
               val mobileNumber = intent.getStringExtra("mobileNumber").toString()

              if (password!="" && mobileNumber!=""){
                     txtPassword.text = password
                     txtMobileNumber.text = mobileNumber
              }
        }

    }

   /*override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }*/

}