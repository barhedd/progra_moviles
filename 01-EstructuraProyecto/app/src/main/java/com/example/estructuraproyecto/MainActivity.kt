package com.example.estructuraproyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Accediendo a los views a traves de código
        val gretingTextView: TextView = findViewById(R.id.greting_text_view) // aqui se pone el id que definimos en activiy_main.xml
        gretingTextView.text = "Probando cambiar texto"
    }
}