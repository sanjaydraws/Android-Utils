package com.example.androidutils.extension

import android.app.Activity
import android.content.Context


/**
 * @return If the activity is finishing, returns true; else returns false.
 * */
fun Context.isActivityFinishing(): Boolean {
    return this is Activity && isFinishing
}


/**
 *  @return true if destroyed
 * */
fun Context.isActivityDestroyed(): Boolean {
    return this is Activity && isDestroyed
}