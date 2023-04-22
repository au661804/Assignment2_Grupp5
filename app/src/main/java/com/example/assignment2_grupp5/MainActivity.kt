package com.example.assignment2_grupp5

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.R
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.assignment2_grupp5.topmenu.menu.MenuItem
import com.example.assignment2_grupp5.ui.theme.Assignment2_Grupp5Theme
import com.example.assignment2_grupp5.R.drawable
import com.example.assignment2_grupp5.AppBar
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment2_Grupp5Theme {

                val scaffoldState = rememberScaffoldState()
                val scope = rememberCoroutineScope()

                Scaffold(
                    scaffoldState = scaffoldState,
                    topBar = {
                        AppBar (title = "My Contact book",
                            onNavigationIconClick = {
                                scope.launch {
                                    Log.v(this::class.simpleName, "in launch launch Click")
                                    scaffoldState.drawerState.open()
                                }
                            }
                        )
                    },
                    drawerContent = {
                        DrawerHeader()
                        DrawerBody(items = listOf(
                            MenuItem(
                                id = "home",
                                title = "Home",
                                contentDescription = "Go to homescreen",
                                icon = painterResource(id = drawable.contacts)

                            ),
                            MenuItem(
                                id = "info",
                                title = "Info",
                                contentDescription = "Go to info",
                                icon = painterResource(id = android.R.drawable.ic_dialog_info)

                            ),
                            MenuItem(
                                id = "contacts",
                                title = "Contacts",
                                contentDescription = "Go to contacts",
                                icon = painterResource(id = drawable.contacts
                                )
                            )
                        ),
                            onItemClick = {
                                when(it.id){
                                    "home" ->{ Log.v(this::class.simpleName, "Home clicked")
                                    }
                                    "editor" ->{ Log.v(this::class.simpleName, "Home clicked")
                                    }
                                    "contacts" -> {
                                        scope.launch {
                                            val intent = Intent(this@MainActivity, BegivenhederActivity::class.java)
                                            startActivity(intent)
                                            scaffoldState.drawerState.open() }
                                    }
                                }   }
                        )

                        //Text(text = "Scaffold Content")

                    }
                    )   {
                    Image(painter = painterResource(id = drawable.contacts),
                        contentDescription = "Start-up Icon",
                        Modifier.fillMaxSize())


                }

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Assignment2_Grupp5Theme {
        Greeting("Android")
    }
}