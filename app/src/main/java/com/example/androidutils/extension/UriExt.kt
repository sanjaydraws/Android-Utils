package com.example.androidutils.extension

import android.content.Context
import android.net.Uri
import java.io.File




private fun Context.getFileFromUri(
    uri: Uri,
    selection: String? = null,
    selectionArgs: kotlin.Array<String>? = null
): File? {
    val cursor = contentResolver.query(
        uri, arrayOf("_data"), selection, selectionArgs, null
    )
    if (cursor == null) {
        return null
    }
    try {
        return if (cursor.moveToFirst()) {
            val columnIndex = cursor.getColumnIndex("_data")
            if (columnIndex > -1) {
                File(cursor.getString(columnIndex))
            } else {
                null
            }
        } else {
            null
        }
    } catch (e: Exception) {
        return null
    } finally {
        cursor.close()
    }
}
