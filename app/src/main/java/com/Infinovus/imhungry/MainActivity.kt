package com.Infinovus.imhungry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.Infinovus.imhungry.ui.ImHungryApp
import com.Infinovus.imhungry.ui.theme.ImHungryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImHungryTheme {
                ImHungryApp()
            }
        }
    }
}