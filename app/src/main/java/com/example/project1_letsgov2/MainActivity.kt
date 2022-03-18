package com.example.project1_letsgov2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
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
                SimpleText("Let's Go")

                SimpleText1(displayText = "Create or Find Sporting Events")

                Login()

                CreateAccountButton()
            }
        }
    }
}

@Composable
fun SimpleText(displayText: String) {

    Text(
        text = displayText,
        fontFamily = FontFamily.Serif,
        fontSize = 45.sp,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun SimpleText1(displayText: String) {

    Text(text = displayText, fontSize = 20.sp)
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

fun LoginInput(user_name: String, password: String): String {

    var status: String = ""

    if (user_name.equals("Tyler") && password.equals("Porter")) {

        status = "Login Successful"

    } else {

        status = "Login Unsuccessful"
    }

    return status
}

@Composable
fun ForgotPasswordButton() {

    val context = LocalContext.current
    TextButton(
        onClick = {
            context.startActivity(Intent(context, ForgotPassword::class.java))
        },
        modifier = Modifier.absolutePadding(left = 200.dp)
    ) {
        Text("Forgot Password", color = Color(0xFF2196F3))
    }
}

@Composable
fun Login() {
    var context = LocalContext.current

    Column(

        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    )
    {

        var usernameInput by rememberSaveable { mutableStateOf("") }
        var passwordInput by rememberSaveable { mutableStateOf("") }

        Username(text = "Username")

        TextField(modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(), value = usernameInput, onValueChange = { usernameInput = it })

        Password(text = "Password")

        TextField(modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(), value = passwordInput, onValueChange = { passwordInput = it })

        var status by rememberSaveable {
            mutableStateOf("")

        }

        ForgotPasswordButton()

        val context = LocalContext.current
        val backgroundColor = Color(0xFF2196F3)
        Button(shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor),
            modifier = Modifier
                .padding(30.dp)
                .width(150.dp),
            onClick = {
                status = LoginInput(usernameInput, passwordInput); context.startActivity(
                Intent(context, UpdateProfile::class.java)
            )
            }) {

            Text(
                text = "Login",
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 20.sp, fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(16.dp)
            )
        }
        Text(text = "$status")

        //Text(username)
    }
}

@Composable
fun CreateAccountButton() {

    Column(
        modifier = Modifier
            .fillMaxSize(), Arrangement.Bottom, Alignment.CenterHorizontally
    ) {

        val context = LocalContext.current
        TextButton(
            onClick = {
                context.startActivity(Intent(context, CreateAccount::class.java))
            },

            ) {

            Text("Create Account", color = Color(0xFF2196F3))
        }
    }
}