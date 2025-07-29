package hk.hku.cdapp.android.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import hk.hku.cdapp.android.android.ui.theme.HKUTheme

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