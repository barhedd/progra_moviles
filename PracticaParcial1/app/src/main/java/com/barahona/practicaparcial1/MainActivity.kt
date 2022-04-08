package com.barahona.practicaparcial1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.barahona.practicaparcial1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Data
    private var scoreTeamA = 0
    private var scoreTeamB = 0

    // Views
    private lateinit var teamAOnePointButton: Button
    private lateinit var teamATwoPointsButton: Button
    private lateinit var teamAThreePointsButton: Button
    private lateinit var teamBOnePointButton: Button
    private lateinit var teamBTwoPointsButton: Button
    private lateinit var teamBThreePointsButton: Button
    private lateinit var saveButton: Button

    // ViewModel
    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        bind()
        addListeners()
    }

    private fun bind() {
        // Team A
        teamAOnePointButton = findViewById(R.id.action_one_point_team_a)
        teamATwoPointsButton = findViewById(R.id.action_two_points_team_a)
        teamAThreePointsButton = findViewById(R.id.action_three_points_team_a)
        // Team B
        teamBOnePointButton = findViewById(R.id.action_one_point_team_b)
        teamBTwoPointsButton = findViewById(R.id.action_two_points_team_b)
        teamBThreePointsButton = findViewById(R.id.action_three_points_team_b)
        // Save
        saveButton = findViewById(R.id.action_save)
    }

    private fun addListeners() {
        // Team A
        teamAOnePointButton.setOnClickListener {
            scoreTeamA += 1
            binding.viewModel!!.scoreTeamA.setValue(scoreTeamA)
        }
        teamATwoPointsButton.setOnClickListener{
            scoreTeamA += 2
            binding.viewModel!!.scoreTeamA.setValue(scoreTeamA)
        }
        teamAThreePointsButton.setOnClickListener {
            scoreTeamA += 3
            binding.viewModel!!.scoreTeamA.setValue(scoreTeamA)
        }
        // Team B
        teamBOnePointButton.setOnClickListener {
            scoreTeamB += 1
            binding.viewModel!!.scoreTeamB.setValue(scoreTeamB)
        }
        teamBTwoPointsButton.setOnClickListener{
            scoreTeamB += 2
            binding.viewModel!!.scoreTeamB.setValue(scoreTeamB)
        }
        teamBThreePointsButton.setOnClickListener {
            scoreTeamB += 3
            binding.viewModel!!.scoreTeamB.setValue(scoreTeamB)
        }
        // Save
        saveButton.setOnClickListener {
            val intent = Intent(this, ScoreActivity::class.java)
            startActivity(intent)
        }
    }

}