package com.example.appupdate.listeners

import com.example.appupdate.model.UpdateType

interface AppUpdateLoadingListener {
    fun onUpdateAvailable(type: UpdateType)
    fun noNoUpdateAvailable()
    fun onFailure(reason: String)
}