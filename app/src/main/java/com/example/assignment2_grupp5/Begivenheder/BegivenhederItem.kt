package com.example.assignment2_grupp5.Begivenheder

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun BegivenhederItem(name: String, imageId: Int, goToContact: () -> Unit) {
    Box() {
        Row(
            Modifier
                .padding(all = 5.dp)
                .background(MaterialTheme.colors.primary)
                .clickable {
                    Log.v("ContactItem", name)
                    goToContact()
                }) {
            Image(
                painter = painterResource(id = imageId),
                contentDescription = "contact image",
                modifier = Modifier.width(100.dp)
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
                    .padding(5.dp),
                text = name,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colors.onPrimary
            )
        }
    }
}

