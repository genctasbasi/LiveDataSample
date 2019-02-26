package com.escmobile.livedatasample

import android.annotation.SuppressLint
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var myViewModel: MyViewModel

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myViewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)

        // 1- set text view from this MainActivity so we can understand when it changes later when the button is clicked
        text_view.text = "This value is set from MainActivity"

        // 2- when button clicked, make view model call to change the text view value
        call_button.setOnClickListener { myViewModel.updateText() }

        // 3- observe the changed value
        val nameObserver = Observer<String> { changedValue ->
            text_view.text = changedValue.toString()
        }

        myViewModel.myVar.observe(this, nameObserver)
    }

}
