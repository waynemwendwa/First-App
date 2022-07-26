package com.wayne.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun homeBtnClicked(view: View) {
        Toast.makeText(applicationContext,"Going Home",Toast.LENGTH_SHORT).show()
    }
    fun aboutBtnClicked(view: View) {
        Toast.makeText(applicationContext,"About us",Toast.LENGTH_LONG).show()
    }
    fun servicesBtnClicked(view: View) {
        Toast.makeText(applicationContext,"services offered",Toast.LENGTH_LONG).show()
    }
    fun callBtnClicked(view: View) {
        Toast.makeText(applicationContext,"Calling",Toast.LENGTH_LONG).show()
    }
    fun signInClicked(view: View) {
        Toast.makeText(applicationContext,"Signing in",Toast.LENGTH_LONG).show()
    }
    fun signUpClicked(view: View) {
        Toast.makeText(applicationContext,"Signing Up",Toast.LENGTH_LONG).show()
    }
}

