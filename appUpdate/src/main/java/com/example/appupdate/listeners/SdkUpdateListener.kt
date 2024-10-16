package com.example.appupdate.listeners

interface SdkUpdateListener {
    fun onUpdateFailed(reason: String)
    fun onUpdateSuccess()
    fun onUpdateStarted()
}