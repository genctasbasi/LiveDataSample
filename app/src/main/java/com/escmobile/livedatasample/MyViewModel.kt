package com.escmobile.livedatasample

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    val myVar: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    fun updateText() {
        myVar.value = "This value is set from the view model and activity is updated"
    }
}