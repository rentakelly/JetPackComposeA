package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.ui.theme.JetPackComposeTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeuApp{
                Greeting("Android")
            }
        }
    }
}

@Composable
fun MeuApp(content: @Composable () -> Unit) {
    JetPackComposeTheme {
        Surface(color = Color.Red) {
            content()
        }
    }
}

@Composable
fun Greeting(name: String) {
        Text(text = "Hello $name!", modifier = Modifier.padding(24.dp))
}

@Preview//(showBackground = true)
@Composable
fun DefaultPreview() {
    MeuApp{
        Greeting("Android")
    }
//    JetPackComposeTheme {
//        Greeting("Android")
//    }
}