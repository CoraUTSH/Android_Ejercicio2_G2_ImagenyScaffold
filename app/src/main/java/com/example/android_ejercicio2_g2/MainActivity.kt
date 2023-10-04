package com.example.android_ejercicio2_g2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Content()
        }
    }
}
@Composable
fun Content(){
    Column(
        verticalArrangement =Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.background))
            .padding(12.dp)
    ) {
        Text(text = "Mi Aplicación con imágen",
            modifier = Modifier
                .fillMaxWidth(),
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            letterSpacing = 4.sp
        )
        Spacer(modifier = Modifier.height(25.dp))
        Image(painter = painterResource(id = R.drawable.gatoenojado), contentDescription = "Gato Enojado")

    }
}
@Preview(showBackground = true)
@Composable
fun ViewApp(){
    Content()
}


