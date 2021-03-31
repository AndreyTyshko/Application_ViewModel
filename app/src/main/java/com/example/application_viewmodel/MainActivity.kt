package com.example.application_viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.application_viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), LifecycleOwner {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var viewModel = ViewModelProvider(this).get(MainActivityVM::class.java)

        binding.textView11.text = viewModel.number.toString()


        binding.button111.setOnClickListener {
            viewModel.addNumber()
            viewModel.liveData.observe(this, Observer {
                binding.textView11.text = it
            })

        }

    }
}