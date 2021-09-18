package com.example.androidutils.extension




/**
 * ```
 * author: Sanjay Prajapat
 * blog  : https://dev.to/sanjaydraws
 * time  : 18/9/2021
 * desc  : utility function
 * ```
 */


fun String?.safetToInt(): Int {
    return this?.toIntOrNull() ?: -1
}


