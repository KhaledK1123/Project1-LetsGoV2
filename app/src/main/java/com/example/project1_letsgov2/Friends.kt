package com.example.project1_letsgov2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
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

class Friends() : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

// Top bar, for the user's name, somewhere below 'Set Content'??

        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                SimpleText7("Please Select a Friend to Add")

                // 'Set' onClickListener(?), for locating & adding friend? {crossed my mind}

                AddFriend(" Added, as a Friend")
                AddedFriendBox()

                ConfirmFriendsUpdated("Confirm You've Finished Adding Friends")
                UpdatedFriendsBox()
                SubmitButton6()

                SimpleText8("Please Save Your Profile Updates")
                SubmitButton7()
            }
        }
    }
}

@Composable
fun SimpleText7(displayText: String) {

    Text(
        text = displayText,
        fontFamily = FontFamily.Serif,
        fontSize = 28.sp,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun FriendName(text: String) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 14.sp,
            color = Color.Black
        ),
        modifier = Modifier
            .paddingFromBaseline(top = 75.dp)
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
    )
}

fun FriendInput(friend_name: String, password: String): String {

    var status: String = ""

    if (friend_name.equals("Kevin Weakley")) {

        status = "Friend Added Successfully"

    } else {

        status = "Search for Friends to Add"
    }

    return status
}

@Composable
fun SimpleText8(displayText: String) {

    Text(
        text = displayText,
        fontFamily = FontFamily.Serif,
        fontSize = 28.sp,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun AddFriend(text: String) {
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
fun ConfirmFriendsUpdated(text: String) {
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
fun AddedFriendBox() {

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
fun UpdatedFriendsBox() {

    var text by remember { mutableStateOf(TextFieldValue()) }

    TextField(value = text,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        visualTransformation = PasswordVisualTransformation(),
        onValueChange = {
            text = it
        }
    )
}

@Composable
fun SubmitButton6() {

    val context = LocalContext.current
    Card(
        shape = RoundedCornerShape(8.dp),
        backgroundColor = Color(0xFF2196F3),
        modifier = Modifier
            .padding(30.dp)
            .width(150.dp)
            .clickable(onClick = {
                context.startActivity(Intent(context, MainActivity::class.java))
            })
    ) {
        Text(
            text = "Submit",
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 18.sp, fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.padding(16.dp)
        )
    }
}
@Composable
fun SubmitButton7() {

    val context = LocalContext.current
    Card(
        shape = RoundedCornerShape(8.dp),
        backgroundColor = Color(0xFF2196F3),
        modifier = Modifier
            .padding(30.dp)
            .width(150.dp)
            .clickable(onClick = {
                context.startActivity(Intent(context, MainActivity::class.java))
            })
    ) {
        Text(
            text = "Submit",
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 18.sp, fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.padding(16.dp)
        )
    }
}
