package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener{
            if(binding.textInputEditText.text.isNullOrEmpty()){
                binding.textView.text = "Please enter the licence plate code"
            }
            else{
                var plateCode = binding.textInputEditText.text.toString()
                when(plateCode){
                    "DA" -> binding.textView.text = "Darmstadt"
                    "F" -> binding.textView.text = "Frankfurt"
                    "S" -> binding.textView.text = "Stuttgart"
                    "HD" -> binding.textView.text = "Heidelberg"
                    "MA" -> binding.textView.text = "Mannheim"
                    "DI" -> binding.textView.text = "Dieburg"
                    "WI" -> binding.textView.text = "Wiesbaden"
                    "M" -> binding.textView.text = "München"
                    "B" -> binding.textView.text = "Berlin"
                    "KA" -> binding.textView.text = "Karlsruhe"
                    "BAD" -> binding.textView.text = "Baden-Baden"
                    "C" -> binding.textView.text = "Chemnitz"
                    "D" -> binding.textView.text = "Düsseldorf"
                    "DO" -> binding.textView.text = "Dortmund"
                    else -> {
                        binding.textView.text = "Not Found"
                    }
                }
            }
        }
    }
}