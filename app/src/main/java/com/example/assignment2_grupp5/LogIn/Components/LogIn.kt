package com.example.assignment2_grupp5.LogIn.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.assignment2_grupp5.R

@Composable
fun LogIn(loggedIn: () -> Unit, logIn: (userName: String, password: String) -> Boolean) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(
            onClick = {
                val res = logIn("ui", "jk")
                //do login shit
                //if ok
                if (res)
                    loggedIn()
            },
            modifier = Modifier
                .padding(top = 32.dp)
                .fillMaxWidth(0.8f)
        ) {
            Text(text = "Login")
        }

        Button(
            onClick = {

            },
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth(0.8f)
        ) {
            Text(text = "Sign Up")
        }
    }
}