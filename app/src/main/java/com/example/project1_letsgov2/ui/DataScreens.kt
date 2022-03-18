package com.example.project1_letsgov2

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.project1_letsgov2.R
import androidx.navigation.NavController

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun UpdateProfile(openDrawer:()->Unit)
{
    Column(

        modifier=Modifier.fillMaxSize()
    ) {


        TopBar(title = "Profile",   buttonIcon =Icons.Filled.Menu,onButtonClicked = {openDrawer()})


        Column(
            modifier=Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            SimpleText4("Please Update Your Account With a New Password")

            UpdatedPassword("Updated Password")
            UpdatedPasswordBox()

            ConfirmUpdatedPassword("Confirm Updated Password")
            UpdatedPasswordBox2()

            SubmitButton2()

            SimpleText5("Please Save Your Profile Changes")
            SubmitButton3()

        }

    }


}


@Composable
fun Communities(openDrawer:()->Unit)
{
    Column(

        modifier=Modifier.fillMaxSize()
    ) {


        TopBar(title = "Communities",   buttonIcon =Icons.Filled.Menu,onButtonClicked = {openDrawer()})


        Column(
            modifier=Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Default("My Communities")
            Default("You are not part of any communities.... Find one you like or create your own!")
            StartCommunity()
        }

    }

}


@Composable
fun Events(openDrawer:()->Unit)
{
    Column(

        modifier=Modifier.fillMaxSize()
    ) {


        TopBar(title = "Events",   buttonIcon =Icons.Filled.Menu,onButtonClicked = {openDrawer()})


        Column(
            modifier=Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            SimpleText1("My Events")
            Default("You are not part of any Events.... Find one you like or create your own!")
            StartEvent()
            //Text(text = "Help Page Content goes here")
        }

    }


}