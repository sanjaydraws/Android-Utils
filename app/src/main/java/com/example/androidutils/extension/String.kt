package com.example.androidutils.extension


fun String?.safeSubstring(startIndex: Int, endIndex: Int): String?{
    return try {
        this?.substring(startIndex = startIndex , endIndex =endIndex) ?: ""
    }catch (e:Exception){
        ""
    }
}

