package com.example.androidutils.extension

/**
 * ```
 * author: Sanjay Prajapat
 * blog  : https://dev.to/sanjaydraws
 * time  : 18/9/2021
 * ```
 */

fun String?.safeSubstring(startIndex: Int, endIndex: Int): String?{
    return try {
        this?.substring(startIndex = startIndex , endIndex =endIndex) ?: ""
    }catch (e:Exception){
        ""
    }
}

fun String?.safetToInt(): Int {
    return this?.toIntOrNull() ?: -1
}
