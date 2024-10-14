package com.example.adoptme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.adoptme.ui.theme.AdoptMeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AdoptMeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Inicio",
                        modifier = Modifier.padding(innerPadding)
                    )
                    //TextMensaje(
                    //    "Adopción de Perritos"
                    //            FontStyle.Normal
                    //            FontWeight.Bold
                    //)
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Surface(color = Color.White , modifier = Modifier.fillMaxSize()) {

            Image(
                painterResource(R.drawable.concepto_adopcion_mascotas_lindo_perro),
                contentDescription = "perrito",
                modifier = Modifier.width(100.dp)

            )
            //Button() { }


    }
    Text( text = " $name",
             fontSize = 15.sp,
         color = Color.DarkGray)
}

@Composable

fun TextMensaje(text: String, fontStyle: FontStyle, fontWeight: FontWeight) {
     "Adopción de Perritos"
     FontStyle.Normal
     FontWeight.Bold;
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AdoptMeTheme {
        Greeting("Inicio" )
    }
}