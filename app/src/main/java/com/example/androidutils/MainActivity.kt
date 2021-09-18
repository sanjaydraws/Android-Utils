package com.example.androidutils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.androidutils.extension.longToast
import com.example.androidutils.extension.safetToInt
import com.example.androidutils.extension.setImageResourceExt
import com.example.androidutils.extension.toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        longToast("Hello World")

    }
}