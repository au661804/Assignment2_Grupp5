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
import com.example.assignment2_grupp5.SignUp

@Composable
fun SignUp(SignedUp: () -> Unit, SignUp: (userName: String, password: String) -> Boolean) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painterResource(id = R.drawable.tdf_orig),
            contentDescription = "App Icon",
            modifier = Modifier
                .padding(top = 20.dp)
                .clip(RoundedCornerShape(8.dp))
        )

        Button(
            onClick = {
                val res = SignUp("ui", "jk")
                //do login shit
                //if ok
                if (res)
                    SignedUp()

            },
            modifier = Modifier
                .padding(top = 32.dp)
                .fillMaxWidth(0.8f)
        ) {
            Text(text = "Login")
        }


    }
}