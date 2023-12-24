package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.ui.theme.COmposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            COmposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BirthdayCard("Roma")
                }
            }
        }
    }
}

@Composable
fun BirthdayCard(name: String, modifier: Modifier = Modifier.fillMaxSize()) {
    Column(modifier) {



        Row(
            modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
        ) {
            Row(
                modifier = Modifier
                    .background(Color.Blue)
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight()
            ) {
                Text(text = "1234")
                Text(text = "5678")
            }
            Row(
                modifier = Modifier
                    .background(Color.DarkGray)
                    .fillMaxHeight()
                    .fillMaxWidth()
            ) {
                Text(text = "1234")
                Text(text = "5678")
            }
        }
        Row(
            modifier = Modifier
                .background(Color.Magenta)
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Row(
                modifier = Modifier
                    .background(Color.Red)
                    .fillMaxHeight()
                    .fillMaxWidth(0.5f)
            ) {
                Text(text = "1234")
                Text(text = "5678")
            }
            Row(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight()
                    .fillMaxWidth()
            ) {
                Text(text = "1234")
                Text(text = "5678")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    COmposeTheme {
        BirthdayCard("Roma")
    }
}