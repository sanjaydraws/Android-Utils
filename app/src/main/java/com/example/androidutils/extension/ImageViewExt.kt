package com.example.androidutils.extension

import android.text.format.DateUtils
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide


/* use kotlin kapt plugin to apply data binding*/
/**
 * @param imageUrl pass image url
 * */

@BindingAdapter("loadImage")
fun ImageView.loadImage(imageUrl: Any?){
    imageUrl?.let {
        Glide.with(this).load(imageUrl).centerCrop().into(this)
    }
}

