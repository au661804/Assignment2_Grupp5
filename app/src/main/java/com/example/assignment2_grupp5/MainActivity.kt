package com.example.assignment2_grupp5

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.R
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                        AppBar (title = "TOUR",
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
                                id = "begivenheder",
                                title = "Begivenheder",
                                contentDescription = "Go to Begidenheder",
                                icon = painterResource(id = android.R.drawable.ic_input_add)

                            ),
                            MenuItem(
                                id = "TDF",
                                title = "Tour de Fredagsbar",
                                contentDescription = "Go to tdf",
                                icon = painterResource(id = android.R.drawable.ic_dialog_info)

                            ),
                            MenuItem(
                                id = "DineRuter",
                                title = "Dine Ruter",
                                contentDescription = "Go to DineRuter",
                                icon = painterResource(id = android.R.drawable.ic_input_add
                                )
                            ),
                            MenuItem(
                                id = "FindVej",
                                title = "Find Vej",
                                contentDescription = "Go to FindVej",
                                icon = painterResource(id = android.R.drawable.ic_input_delete
                                )
                            ),
                            MenuItem(
                                id = "OpretBegivenhed",
                                title = "Opret Begivenhed",
                                contentDescription = "Go to OpretBegivenhed",
                                icon = painterResource(id = android.R.drawable.ic_input_add
                                )
                            )
                        ),
                            onItemClick = {
                                when(it.id){
                                    "begivenheder" ->{
                                        scope.launch {
                                        val intent = Intent(this@MainActivity, BegivenhederActivity::class.java)
                                        startActivity(intent)
                                        scaffoldState.drawerState.open() }
                                    }
                                    "TDF" ->{ Log.v(this::class.simpleName, "TDF clicked")
                                    }
                                    "DineRuter" ->{ Log.v(this::class.simpleName, "Dine Ruter clicked")
                                    }
                                    "FindVej" ->{ Log.v(this::class.simpleName, "Find Vej clicked")
                                    }
                                    "OpretBegivenhed" -> { Log.v(this::class.simpleName, "Home clicked")
                                    }
                               }
                            },
                        )

                        //Text(text = "Scaffold Content")

                    }
                    )   {
                    Image(painter = painterResource(id = drawable.tdf_orig),
                        contentDescription = "Start-up Icon",
                        Modifier.size(200.dp), Alignment.Center)


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