package com.example.androidutils.extension

import android.text.format.DateUtils
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide


// use kotlin kapt plugin to apply data binding
@BindingAdapter("loadImage")
fun ImageView.loadImage(image: Any?){
    image?.let {
        Glide.with(this).load(image).centerCrop().into(this)
    }
}


private fun isWithinWeek(millis: Long): Boolean {
    return System.currentTimeMillis() - millis <= DateUtils.WEEK_IN_MILLIS -
            DateUtils.DAY_IN_MILLIS
}