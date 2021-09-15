package com.example.androidutils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidutils.extension.safetToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        print("23".safetToInt())

    }
}