package com.pickersoft.mylogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onMatch(view: View) {
        //2nd, id and password matching function.
        val textId = findViewById<EditText>(R.id.editTextId)
        val textPass = findViewById<EditText>(R.id.editTextTextPassword)
        val textTitle = findViewById<TextView>(R.id.textViewTitle)

        if (textId.text.toString() == "picker" && textPass.text.toString() == "password") {
            Toast.makeText(this, "Login Successfully.", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this,"Login failed",Toast.LENGTH_LONG).show()
        }
    }
}