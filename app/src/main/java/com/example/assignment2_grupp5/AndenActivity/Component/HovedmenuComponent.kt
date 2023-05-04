package com.example.assignment2_grupp5.AndenActivity.Component

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.assignment2_grupp5.*
import com.example.assignment2_grupp5.R
import com.example.assignment2_grupp5.topmenu.menu.MenuItem
import com.example.assignment2_grupp5.ui.theme.Assignment2_Grupp5Theme
import kotlinx.coroutines.launch


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HovedmenuScreen(
    navigateOpretBegivenhed: () -> Unit,
    navigateFindVej: () -> Unit,
    navigateTDF: () -> Unit,
    navigateBegivenheder: () -> Unit,
    navigateDineRuter: () -> Unit
) {
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HovedmenuComposable(
    navigateOpretBegivenhed: () -> Unit,
    navigateFindVej: () -> Unit,
    navigateTDF: () -> Unit,
    navigateBegivenheder: () -> Unit,
    navigateDineRuter: () -> Unit
) {


    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            AppBar(title = "TOUR",

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
            DrawerBody(
                items = listOf(
                    MenuItem(
                        id = "begivenheder",
                        title = "Begivenheder",
                        contentDescription = "Go to Begivenheder",
                        icon = painterResource(id = R.drawable.begivenheder_icon)

                    ),
                    MenuItem(
                        id = "TDF",
                        title = "Tour de Fredagsbar",
                        contentDescription = "Go to tdf",
                        icon = painterResource(id = android.R.drawable.ic_menu_agenda)

                    ),
                    MenuItem(
                        id = "DineRuter",
                        title = "Dine Ruter",
                        contentDescription = "Go to DineRuter",
                        icon = painterResource(
                            id = android.R.drawable.ic_menu_my_calendar
                        )
                    ),
                    MenuItem(
                        id = "FindVej",
                        title = "Find Vej",
                        contentDescription = "Go to FindVej",
                        icon = painterResource(
                            id = android.R.drawable.ic_dialog_map
                        )
                    ),
                    MenuItem(
                        id = "OpretBegivenhed",
                        title = "Opret Begivenhed",
                        contentDescription = "Go to OpretBegivenhed",
                        icon = painterResource(
                            id = android.R.drawable.ic_menu_add
                        )
                    )
                ),
                onItemClick = {
                    when (it.id) {
                        "begivenheder" -> {
                            Log.v(this::class.simpleName, "Begivenheder clicked")
                            scope.launch {
                                navigateBegivenheder()

                                scaffoldState.drawerState.open()
                            }
                        }
                        "TDF" -> {
                            Log.v(this::class.simpleName, "TDF clicked")
                            scope.launch {
                                navigateTDF()

                                scaffoldState.drawerState.open()
                            }
                        }
                        "DineRuter" -> {
                            Log.v(this::class.simpleName, "Dine Ruter clicked")
                            scope.launch {
                                navigateDineRuter()


                                scaffoldState.drawerState.open()
                            }
                        }
                        "FindVej" -> {
                            Log.v(this::class.simpleName, "FindVej clicked")
                            scope.launch {
                                navigateFindVej()

                                scaffoldState.drawerState.open()
                            }
                        }
                        "OpretBegivenhed" -> {
                            Log.v(this::class.simpleName, "Home clicked")
                            scope.launch {
                                navigateOpretBegivenhed()

                                scaffoldState.drawerState.open()
                            }
                        }
                    }
                },
            )


        }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(25.dp)
                .fillMaxSize()
        ) {


            Image(
                painter = painterResource(id = R.drawable.tdf_orig),
                contentDescription = "Start-up Icon",
                Modifier.size(200.dp), Alignment.Center
            )

            Spacer(modifier = Modifier.padding(bottom = 80.dp))

            TextAlign
            Text("Hvad kan du finde?", modifier = Modifier.background(Color.White))
            Text("- Planlæg din egen tour de fredagsbar")
            Text("- Se fredagsbarer og deres åbningstider")
            Text("- Se begivenheder fra fredagsbarer eller andres tour de fredagsbar")
        }

    }

}














