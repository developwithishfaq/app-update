package com.example.appupdate.extension

import android.util.Log
import androidx.activity.ComponentActivity
import com.example.appupdate.AppUpdateHelper
import com.example.appupdate.listeners.SdkUpdateListener

fun AppUpdateHelper.checkAndStartUpdate(
    activity: ComponentActivity,
    onDismiss: (Boolean) -> Unit,
) {
    checkAndStartUpdate(activity, object : SdkUpdateListener {
        override fun onUpdateFailed(reason: String) {
            onDismiss.invoke(false)
        }

        override fun onUpdateSuccess() {
            onDismiss.invoke(true)

        }

        override fun onUpdateStarted() {
        }
    })
}


fun logAds(message: String, isError: Boolean = false) {
    if (isError) {
        Log.e("adsPlugin", "Ads: $message")
    } else {
        Log.d("adsPlugin", "Ads: $message")
    }
}