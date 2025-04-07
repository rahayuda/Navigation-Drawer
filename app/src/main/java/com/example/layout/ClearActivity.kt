package com.example.layout

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText

class ClearActivity : AppCompatActivity() {
    var et1: EditText? = null
    var et2: EditText? = null
    var et3: EditText? = null
    var btn1: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clear)

        et1 = findViewById<View>(R.id.editText1) as EditText
        et2 = findViewById<View>(R.id.editText2) as EditText
        et3 = findViewById<View>(R.id.editText3) as EditText
        btn1 = findViewById<View>(R.id.button1) as Button

        btn1!!.setOnClickListener {
            et1!!.setText("")
            et2!!.setText("")
            et3!!.setText("")
        }
    }
}