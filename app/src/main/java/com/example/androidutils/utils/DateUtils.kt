package com.example.androidutils.utils

import android.text.format.DateFormat
import java.util.*

fun getTimeTodayYestFromMilli(msgTimeMillis: Long): String? {
    val messageTime = Calendar.getInstance()
    messageTime.timeInMillis = msgTimeMillis
    // get Currunt time
    val now = Calendar.getInstance()
    val strTimeFormate = "h:mm aa"
    val strDateFormate = "dd/MM/yyyy h:mm aa"
    return if (now[Calendar.DATE] == messageTime[Calendar.DATE] && now[Calendar.MONTH] == messageTime[Calendar.MONTH] && now[Calendar.YEAR] == messageTime[Calendar.YEAR]) {
        //            return "today at " + DateFormat.format(strTimeFormate, messageTime);
        "Today"
    } else if (now[Calendar.DATE] - messageTime[Calendar.DATE] == 1 && now[Calendar.MONTH] == messageTime[Calendar.MONTH] &&
        now[Calendar.YEAR] == messageTime[Calendar.YEAR]
    ) {
        //            return "yesterday at " + DateFormat.format(strTimeFormate, messageTime);
        "Yesterday"
    } else {
        val mDay = DateFormat.format(strDateFormate, messageTime).toString() + ""
        //            return "date : " + DateFormat.format(strDateFormate, messageTime);
        DateFormat.format(strDateFormate, messageTime).toString() + ""
    }
}