package com.example.toasterlibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage {
    fun showToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}
