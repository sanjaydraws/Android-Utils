package com.example.androidutils.extension

import android.view.Window
import android.view.WindowManager


/**
 * ```
 * author: Sanjay Prajapat
 * blog  : https://dev.to/sanjaydraws
 * created on  29/12/2021
 * ```
 */
fun Window.setFullScreen(){
    setFlags(
        WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
        WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
}