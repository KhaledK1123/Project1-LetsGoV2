package com.example.project1_letsgov2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class CommunitiesManage : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                //verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,

            ) {
                    Default("My Communities")
                    Default("You are not part of any communities.... Find one you like or create your own!")
                    StartCommunity()
            }
        }
    }
}

@Composable
fun Default(text: String) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 16.sp,
            color = Color.Black
        ),
        modifier = Modifier
            .paddingFromBaseline(top = 50.dp)
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
    )
}
@Composable
fun StartCommunity() {

    Column (
        modifier = Modifier
            .fillMaxSize(), Arrangement.Bottom,Alignment.CenterHorizontally
    ){

        val context = LocalContext.current
        TextButton(
            onClick = { context.startActivity(Intent(context, CommunitiesCreate::class.java))
            },

            ) {

            Text("Start a Community", color = Color(0xFF2196F3))
        }
    }
}