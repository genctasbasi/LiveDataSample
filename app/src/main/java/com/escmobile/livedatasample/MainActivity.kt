package com.escmobile.livedatasample

import android.annotation.SuppressLint
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.escmobile.livedatasample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var myViewModel: MyViewModel

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        myViewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)

        // 2 - when button clicked, make view model call to change the text view value
        binding.callButton.setOnClickListener { myViewModel.updateText() }

        // 3- observe the changed value
        val nameObserver = Observer<String> { changedValue ->
            binding.textView.text = changedValue.toString()
        }

        myViewModel.bindingText.observe(this, nameObserver)

        // myViewModel.bindingText.value = "dd"
        // text_view.text = "This value is set from MainActivity"
        // 1 - set text view value through binding


        binding.textView.text = "This value is set from MainActivity"

    }

}
