package com.example.project1_letsgov2

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                //verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                SimpleText("Sport Event App")

                SimpleText1(displayText = "Create or Find Sporting Events")

                Username("Please Login: Type Username")
                UsernameBox()

                Password("Password")
                PasswordBox()

                ForgotPasswordButton()

                Login()

                CreateAccountButton()
            }
        }
    }
}

@Composable
fun SimpleText(displayText: String) {

    Text(text = displayText, fontFamily = FontFamily.Serif, fontSize = 45.sp, modifier = Modifier.padding(16.dp))
}

@Composable
fun SimpleText1(displayText: String) {

    Text(text = displayText,fontSize = 20.sp)
}

@Composable
fun Username(text: String) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 16.sp,
            color = Color.Black
        ),
        modifier = Modifier
            .paddingFromBaseline(top = 75.dp)
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
    )
}

@Composable
fun Password(text: String) {
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

@ExperimentalFoundationApi
@Composable
fun UsernameBox() {

    var text by remember { mutableStateOf(TextFieldValue()) }

    TextField(
        value = text,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        onValueChange = {
            text = it
        }
    )
}

@ExperimentalFoundationApi
@Composable
fun PasswordBox() {

    var text by remember { mutableStateOf(TextFieldValue()) }

    TextField(value = text,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        //keyboardType = KeyboardType.Password,
        visualTransformation = PasswordVisualTransformation(),
        onValueChange = {
            text = it
        }
    )
}

@Composable
fun ForgotPasswordButton() {

    val context = LocalContext.current
    TextButton(
        onClick = {
            context.startActivity(Intent(context, ForgotPassword::class.java))
        },
        modifier = Modifier.absolutePadding(left = 230.dp)
    ) {
        Text("Forgot Password",color = Color(0xFF2196F3))
    }
}

@Composable
fun Login() {

    val context = LocalContext.current
    Card(
        shape = RoundedCornerShape(10.dp),
        backgroundColor = Color(0xFF2196F3),
        modifier = Modifier
            .padding(30.dp)
            .width(150.dp)
            .clickable(onClick = {
                Toast
                    .makeText(context, "Welcome", Toast.LENGTH_SHORT)
                    .show()
            })
    ) {
        Text(
            text = "Login",
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 20.sp, fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun CreateAccountButton() {

    Column (
        modifier = Modifier
            .fillMaxSize(), Arrangement.Bottom,Alignment.CenterHorizontally
    ){

        val context = LocalContext.current
        TextButton(
            onClick = { context.startActivity(Intent(context, CreateAccount::class.java))
            },

            ) {

            Text("Create Account", color = Color(0xFF2196F3))
        }
    }
}