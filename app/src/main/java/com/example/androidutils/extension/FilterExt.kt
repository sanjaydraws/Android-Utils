package com.example.androidutils.extension






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



