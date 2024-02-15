package br.com.fiap.myapplication3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import br.com.fiap.myapplication3.ui.theme.MyApplication3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplication3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LayoutScreen()
                }
            }
        }
    }
}

@Composable
fun LayoutScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Botão 1")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Botão 2")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Botão 3")
        }
        Column {
            Text(text = "FIAP")
            Text(text = "ANDROID")
            Text(text = "ANDROID STUDIO")
            Row {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Botão 4")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Botão 5")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Botão 6")
                }
                Column {
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Botão 4")
                    }
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Botão 5")
                    }
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Botão 6")
                    }
                }
            }
            Row(
                horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                modifier = Modifier
                    .background(Color.Magenta)
                    .fillMaxWidth(),

            ){
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Botão 4")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Botão 5")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Botão 6")
                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LayoutScreenPreview( ) {
    LayoutScreen()
}