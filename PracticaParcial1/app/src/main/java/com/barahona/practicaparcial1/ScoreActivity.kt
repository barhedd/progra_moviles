package com.barahona.practicaparcial1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.barahona.practicaparcial1.databinding.ActivityScoreBinding

class ScoreActivity : AppCompatActivity() {

    // ViewModel
    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityScoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_score)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}