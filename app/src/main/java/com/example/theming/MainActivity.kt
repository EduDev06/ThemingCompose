package com.example.theming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.theming.ui.theme.ThemingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThemingTheme {
                MyScreen()
            }
        }
    }
}

@Composable
fun MyScreen(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxWidth(),
    ) {
        Column {
            Text(
                text = "Hello everyone",
                style = MaterialTheme.typography.h4
            )
            Button(
                onClick = { /*TODO*/ },
            ) {
                Text(
                    text = "Button",
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ThemingTheme (darkTheme = false) {
        MyScreen()
    }
}