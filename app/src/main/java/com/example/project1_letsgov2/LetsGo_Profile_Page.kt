package com.example.project1_letsgov2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.project1_letsgov2.ui.theme.Project1LetsGoV2Theme

class LetsGo_Profile_Page(function: () -> Unit) : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project1LetsGoV2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ProfileGreeting("Let's Go " + String)
                }
@Composable
fun UpdateProfile() {

    LetsGo_Profile_Page() {
        toolbar.title = ("Update Profile")
        Button(onClick = { /*TODO*/ })

    }

            }
        }
    }
}
@Composable
fun ProfileGreeting(name: String) {
    Text(text = "Today's the day, "+String+"!")
    }

@Composable
fun defaultPreview()
{

    }
}


@Composable
fun






fun PasswordVisualTransformation() {
Set onClickListener
}


