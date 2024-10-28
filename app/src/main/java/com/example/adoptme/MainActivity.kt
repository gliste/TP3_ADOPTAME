package com.example.adoptme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.adoptme.navigation.AppNavigation
import com.example.adoptme.screens.FirstScreen
import com.example.adoptme.ui.theme.AdoptMeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() //se habilita el diseño de pantalla completo
//        setContent { //se establece el contenido de la actividad utilizando un tema personalizado
//            AdoptMeTheme {
//               //Scaffold: se utiliza para estructurar la interfaz de usuario
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Inicio",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//
//                }
//            }
//        }
        setContent {
            AdoptMeTheme {
                Surface (color = MaterialTheme.colorScheme.background){
                    AppNavigation()
                }
            }
        }
    }
}
@Preview(showBackground = true)
//@Composable
//    fun GreetingPreview() {
//        AdoptMeTheme {
//            Greeting("Inicio")
//        }
//    }

@Composable
fun DefaultPreview(){
    AdoptMeTheme {
         AppNavigation()
    }
}



