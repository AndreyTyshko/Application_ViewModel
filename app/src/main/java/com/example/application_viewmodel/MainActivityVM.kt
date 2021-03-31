package com.example.application_viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityVM : ViewModel() {

    val liveData = MutableLiveData<String>()


    var number = 0

    fun addNumber() {
        number++
        liveData.value = number.toString()
    }

}