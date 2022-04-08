package com.ebarahona.formulariobasico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var resultTextView: TextView
    private lateinit var greetingButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        greetingButton.setOnClickListener() {
            greeting()
        }
    }

    /* Enlaza las instancias creadas desde el xml en los atributos de la clase */
    private fun bind() {
        val nameLayout: TextInputLayout = findViewById(R.id.name_edit_text)
        nameEditText = nameLayout.editText!!
        resultTextView = findViewById(R.id.greeting_text_view)
        greetingButton = findViewById(R.id.action_greeting)
    }

    private fun greeting() {
        val name = nameEditText.text.toString()
        if (name.isEmpty()) {
            resultTextView.text = getString(R.string.helper_greeting)
        } else {
            resultTextView.text = getString(R.string.template_greeting, name)
        }
    }

    fun onBreeling(view: View) {
        greeting()
    }
}