package com.example.mycomposecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycomposecard.ui.theme.MyComposeCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.Black.copy(alpha = 0.8f)),
                        contentAlignment = Alignment.Center
                    ) {
                        MyCustomCard(
                            modifier = Modifier.fillMaxWidth(0.8f),
                            image = R.drawable.elephant,
                            title = "Shadows & Lightnings",
                            text = "Create subtle and stunning UI designs with these tips using Jetpack Compose, The new UI Toolkit for building UI in Android",
                            publisher = Publisher(
                                name = "Mohammed Nawas",
                                job = "Android Developer",
                                image = R.drawable.mohammed
                            )
                        )
                    }
                }
            }
        }
    }
}
