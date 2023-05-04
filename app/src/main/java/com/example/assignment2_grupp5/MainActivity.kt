package com.example.assignment2_grupp5

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.R
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.assignment2_grupp5.AndenActivity.Navigation.IndholdNavigation
import com.example.assignment2_grupp5.topmenu.menu.MenuItem
import com.example.assignment2_grupp5.ui.theme.Assignment2_Grupp5Theme
import com.example.assignment2_grupp5.R.drawable
import com.example.assignment2_grupp5.AppBar
import kotlinx.coroutines.launch
import com.example.assignment2_grupp5.LoggedActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Assignment2_Grupp5Theme() {
                val navController = rememberNavController()
                Column() {
                    IndholdNavigation(navController = navController)
                }
            }
        }
    }
}

//class MainActivity : LoggedActivity() {
//
//
//
//    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//
//        setContent {
//            Assignment2_Grupp5Theme {
//
//                val scaffoldState = rememberScaffoldState()
//                val scope = rememberCoroutineScope()
//                val navController = rememberNavController()
//
//
//
//                Scaffold(
//                    scaffoldState = scaffoldState,
//                    topBar = {
//                        AppBar (title = "TOUR",
//
//                            onNavigationIconClick = {
//                                scope.launch {
//                                    Log.v(this::class.simpleName, "in launch launch Click")
//                                    scaffoldState.drawerState.open()
//                                }
//                            }
//                        )
//                    },
//                    drawerContent = {
//                        DrawerHeader()
//                        DrawerBody(items = listOf(
//                            MenuItem(
//                                id = "begivenheder",
//                                title = "Begivenheder",
//                                contentDescription = "Go to Begivenheder",
//                                icon = painterResource(id = drawable.begivenheder_icon)
//
//                            ),
//                            MenuItem(
//                                id = "TDF",
//                                title = "Tour de Fredagsbar",
//                                contentDescription = "Go to tdf",
//                                icon = painterResource(id = android.R.drawable.ic_menu_agenda)
//
//                            ),
//                            MenuItem(
//                                id = "DineRuter",
//                                title = "Dine Ruter",
//                                contentDescription = "Go to DineRuter",
//                                icon = painterResource(id = android.R.drawable.ic_menu_my_calendar
//                                )
//                            ),
//                            MenuItem(
//                                id = "FindVej",
//                                title = "Find Vej",
//                                contentDescription = "Go to FindVej",
//                                icon = painterResource(id = android.R.drawable.ic_dialog_map
//                                )
//                            ),
//                            MenuItem(
//                                id = "OpretBegivenhed",
//                                title = "Opret Begivenhed",
//                                contentDescription = "Go to OpretBegivenhed",
//                                icon = painterResource(id = android.R.drawable.ic_menu_add
//                                )
//                            )
//                        ),
//                            onItemClick = {
//                                when(it.id){
//                                    "begivenheder" ->{
//                                        Log.v(this::class.simpleName, "Begivenheder clicked")
//
////                                        scope.launch {
////                                        val intent = Intent(this@MainActivity, BegivenhederActivity::class.java)
////                                        startActivity(intent)
////                                        scaffoldState.drawerState.open()
////                                        }
//                                    }
//                                    "TDF" ->{ Log.v(this::class.simpleName, "TDF clicked")
//                                    }
//                                    "DineRuter" ->{ Log.v(this::class.simpleName, "Dine Ruter clicked")
//                                        scope.launch {
//                                            val intent = Intent(this@MainActivity, DineRuterActivity::class.java)
//                                            startActivity(intent)
//                                            scaffoldState.drawerState.open()
//                                    }}
//                                    "FindVej" ->{ Log.v(this::class.simpleName, "FindVej clicked")
//                                        scope.launch {
//                                        val intent = Intent(this@MainActivity, FindVejActivity::class.java)
//                                        startActivity(intent)
//                                        scaffoldState.drawerState.open()
//                                        }
//                                    }
//                                    "OpretBegivenhed" -> { Log.v(this::class.simpleName, "Home clicked")
//                                        scope.launch {
//                                            val intent = Intent(this@MainActivity, OpretBegivenhedActivity::class.java)
//                                            startActivity(intent)
//                                            scaffoldState.drawerState.open()
//                                    }}
//                               }
//                            },
//                        )
//
//
//
//                    }
//                    )   {
//                    Column(
//                        horizontalAlignment=Alignment.CenterHorizontally,
//                        modifier= Modifier
//                            .padding(25.dp)
//                            .fillMaxSize()
//                    ) {
//
//
//                        Image(painter = painterResource(id = drawable.tdf_orig),
//                            contentDescription = "Start-up Icon",
//                            Modifier.size(200.dp)
//
//                            , Alignment.Center)
//
//                        Spacer(modifier=Modifier.padding(bottom=80.dp))
//
//                        TextAlign
//                        Text("Hvad kan du finde?", modifier = Modifier.background(Color.White),)
//                        Text("- Planlæg din egen tour de fredagsbar")
//                        Text("- Se fredagsbarer og deres åbningstider")
//                        Text("- Se begivenheder fra fredagsbarer eller andres tour de fredagsbar")
//
//                    }
//
//
//
//                }
//
//            }
//
//
//        }
//    }
//}





