package com.example.praktam_2407051007

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.praktam_2407051007.ui.theme.Praktam_2407051007Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Praktam_2407051007Theme {
                val name = "ilham"
                val npm = "2407051007"

                Greeting(name = name, npm = npm)
            }
        }
    }
}

@Composable
fun Greeting(name: String, npm: String, modifier: Modifier = Modifier) {
    Text(
        text = "Halo, saya $name dengan NPM $npm siap belajar compose!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Praktam_2407051007Theme {
        Greeting("Android", "0000000000")
    }
}