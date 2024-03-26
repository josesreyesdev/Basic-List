package com.jsrdev.basiclist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.jsrdev.basiclist.ui.theme.BasicListTheme
import com.jsrdev.basiclist.ui.tutorial.composables.Conversation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BasicListTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Conversation()
                    //MyApp(modifier = Modifier.fillMaxSize())
                }
            }
        }
    }
}