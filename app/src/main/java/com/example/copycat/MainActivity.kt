package com.example.copycat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.copycat.ui.theme.CopyCatTheme
import com.example.copycat.ui.theme.Purple80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CopyCatTheme {
            MyApp()
            }
        }
    }
}

@Composable
fun MyApp(){
    Surface(
        // A surface container using the 'background' color from the theme
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Greeting("Android")
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier.background(color = MaterialTheme.colorScheme.primary).padding(16.dp),
        color = Color(0xFFD0BCFF)

    )
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CopyCatTheme {
        Greeting("Android")
    }
}