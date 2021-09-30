package com.example.androidutils.extension

import java.util.concurrent.TimeUnit

/**
 * ```
 * author: Sanjay Prajapat
 * blog  : https://dev.to/sanjaydraws
 * time  : 18/9/2021
 * desc  : utility function
 * ```
 */



val Int?.secondsToMillis get() = this?.toLong()?.let { TimeUnit.SECONDS.toMillis(it) }
val Int?.millisToSeconds get() = this?.toLong()?.let { TimeUnit.MILLISECONDS.toSeconds(it) }


