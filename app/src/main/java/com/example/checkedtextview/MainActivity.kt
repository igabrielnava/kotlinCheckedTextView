package com.example.checkedtextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckedTextView

class MainActivity : AppCompatActivity() {

    lateinit var checked_text_view_id: CheckedTextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checked_text_view_id = findViewById<CheckedTextView>(R.id.checked_text_view_id)

        checked_text_view_id.setOnClickListener{

            checked_text_view_id.toggle()

        }


    }
}