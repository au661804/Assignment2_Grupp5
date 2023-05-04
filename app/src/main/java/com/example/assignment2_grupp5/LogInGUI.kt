package com.example.assignment2_grupp5

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.assignment2_grupp5.ui.theme.Assignment2_Grupp5Theme
import com.example.assignment2_grupp5.EmailPasswordActivity

class LogInGUI : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            Column() {
                Row(){
                    Text("Email: ")
                    Button(onClick = {

                    },
                        modifier = Modifier
                            .padding(top = 32.dp)
                            .fillMaxWidth(0.8f)

                }
            }

        }
    }
}
