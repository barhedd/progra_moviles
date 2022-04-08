package com.barahona.viewmodels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.barahona.viewmodels.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private val viewModel:MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        addListeners()
    }

    private fun addListeners() {
        binding.actionSearch.setOnClickListener() {
            viewModel.onSearch()
        }
    }
}