package com.example.androidutils.extension

import android.widget.ImageView
import com.bumptech.glide.Glide
import androidx.databinding.BindingAdapter

// use kotlin kapt plugin to apply data binding
@BindingAdapter("loadImage")
fun ImageView.loadImage(image: Any?){
    image?.let {
        Glide.with(this).load(image).centerCrop().into(this)
    }
}