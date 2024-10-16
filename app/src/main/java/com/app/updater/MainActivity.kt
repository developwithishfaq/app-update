package com.app.updater

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.app.updater.ui.theme.AppUpdateTheme
import com.example.appupdate.AppUpdateHelper

class MainActivity : ComponentActivity() {
    private val helper = AppUpdateHelper()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppUpdateTheme {

            }
        }
    }
}