package com.example.toasterlibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage {
    fun showToast(context: Context, msg: String, length : Int) {
        Toast.makeText(context, msg, length).show()
    }
}
