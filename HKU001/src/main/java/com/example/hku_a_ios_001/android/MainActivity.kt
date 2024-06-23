package com.example.hku_a_ios_001.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.hku_a_ios_001.android.ui.theme.HKUTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

// Not preferred method
//        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            HKUTheme {
                HKUApp()
            }
        }
    }
}