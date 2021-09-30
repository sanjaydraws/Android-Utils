package com.example.androidutils.extension

import android.text.format.DateUtils
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.androidutils.R


/* use kotlin kapt plugin to apply data binding*/
/**
 * @param imageUrl pass image url
 * */

@BindingAdapter("loadImage")
fun ImageView.loadImage(imageUrl: Any?){
    imageUrl?.let {
        Glide.with(this).load(imageUrl).
        centerCrop().
        placeholder(R.drawable.ic_launcher_background).
        into(this)
    }
}

