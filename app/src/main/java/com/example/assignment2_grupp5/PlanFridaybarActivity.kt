package com.example.assignment2_grupp5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class PlanFridaybarActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var numOptions by remember { mutableStateOf(1) }

            LazyColumn(
                modifier = Modifier.padding(16.dp)
            ) {
                item {
                    Text(
                        text = "Tour de fredagsbar",
                        style = MaterialTheme.typography.h5
                    )

                    Text(
                        text = "Startbar",
                        style = MaterialTheme.typography.h6,
                        modifier = Modifier.padding(top = 16.dp)
                    )
                }

                items(numOptions) { index ->
                    DropdownMenu(
                        expanded = false,
                        onDismissRequest = { /* do nothing */ }
                    ) {
                        DropdownMenuItem(onClick = { /* do nothing */ }) {
                            Text(text = "1")
                        }
                        DropdownMenuItem(onClick = { /* do nothing */ }) {
                            Text(text = "2")
                        }
                        DropdownMenuItem(onClick = { /* do nothing */ }) {
                            Text(text = "3")
                        }
                    }
                }

                item {
                    Button(
                        onClick = { numOptions++ },
                        modifier = Modifier
                            .padding(top = 30.dp)
                            //.align(Alignment.BottomEnd)
                    )
                    {
                        Text(text = "+")
                    }

                }

                item {
                    Button(
                        onClick = { /* gem i firebase */ },
                        modifier = Modifier.padding(top = 16.dp)
                    ) {
                        Text(text = "Save")
                    }
                }
            }
        }
    }
}