package com.example.assignment2_grupp5

import android.content.Intent
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat.startActivity
import kotlinx.coroutines.launch


class StartScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("start","start of startscreen activity")
        setContent {
            Column(modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(id = R.drawable.tdf_orig),
                    contentDescription = "App Icon",
                    modifier = Modifier
                        .padding(top =20.dp)
                        .clip(RoundedCornerShape(8.dp))
                )

                Button(onClick = {
                        val intent = Intent(this@StartScreenActivity, SignupActivity::class.java)
                        startActivity(intent)
                    },
                    modifier = Modifier
                        .padding(top = 32.dp)
                        .fillMaxWidth(0.8f)
                ) {
                    Text(text = "Login")
                }

                Button(onClick = {
                    val intent = Intent(this@StartScreenActivity, SignupActivity::class.java)
                    startActivity(intent)
                },
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .fillMaxWidth(0.8f)
                ) {
                    Text(text = "Sign Up")
                }
            }
        }


    }
}

