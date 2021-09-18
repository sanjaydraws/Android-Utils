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


/**
*  return list of string that contains string
* */
fun List<String>?.filterContains(chars :String, ignoreCase:Boolean = false):List<String>?{
    return try{
        this?.filter {
            it.contains(chars, ignoreCase = ignoreCase)
        }
        return this
    } catch(e:java.lang.Exception){
        ArrayList()
    }
}




