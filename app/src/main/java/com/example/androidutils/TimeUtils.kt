package com.example.androidutils

import android.text.format.DateUtils




/**
 * to verify the given time is within a period or not.
 * */


//var isToday: Boolean = DateUtils.isToday(timeInMillis)

/**
 * to check time is with in week
 * */

fun isWithinWeek(millis: Long): Boolean {
    return System.currentTimeMillis() - millis <= DateUtils.WEEK_IN_MILLIS -
            DateUtils.DAY_IN_MILLIS
}

/**
 * to check time is with in year
 * */
fun isWithinYear(millis: Long): Boolean {
    return System.currentTimeMillis() - millis <= DateUtils.YEAR_IN_MILLIS
}

/**
 * To check the time is within a number day of day including today
 * */
fun isWithinDay(timeInMillis: Long, day: Int): Boolean {
    val diff = System.currentTimeMillis() - timeInMillis
    val dayCount = (diff / DateUtils.DAY_IN_MILLIS).toFloat()
    return dayCount < day
}