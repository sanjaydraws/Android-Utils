package com.example.androidutils.extension




/*
  Created By Sanjay Prajapat
 */

fun String?.safetToInt(): Int {
    return this?.toIntOrNull() ?: -1
}


