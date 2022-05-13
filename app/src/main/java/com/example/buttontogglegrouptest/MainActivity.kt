package com.example.buttontogglegrouptest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.buttontogglegrouptest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toggleGroup.addOnButtonCheckedListener { group, checkedId, isChecked ->
            when (checkedId) {
                R.id.yes_button -> binding.textView.text = "${binding.textView.text} \nYes clicked!"
                R.id.no_button -> binding.textView.text = "${binding.textView.text} \nNo clicked!"
            }
        }
    }
}