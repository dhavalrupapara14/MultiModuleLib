package com.errorutil

import android.util.Log

object ErrorDebug {

    fun e(msg: String) {
        Log.e("ErrorDebug", msg)
    }
}