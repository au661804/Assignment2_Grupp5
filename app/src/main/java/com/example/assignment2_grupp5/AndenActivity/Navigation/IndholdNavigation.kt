package com.example.assignment2_grupp5.AndenActivity.Navigation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.assignment2_grupp5.AndenActivity.Component.HovedmenuComposable
import com.example.assignment2_grupp5.AndenActivity.Component.HovedmenuScreen
import com.example.assignment2_grupp5.AndenActivity.Component.OpretBegivenhedComponent
import com.example.assignment2_grupp5.OnOpretBegivenhed
import com.example.assignment2_grupp5.ui.theme.Assignment2_Grupp5Theme

@Composable
fun IndholdNavigation(navController: NavHostController)  {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Hovedmenu") {

        composable(route = "Hovedmenu") {
            HovedmenuComposable(
                navigateOpretBegivenhed = { navController.navigate("OpretBegivenhed") },
                navigateFindVej = { navController.navigate("FindVej") },
                navigateTDF = { navController.navigate("TDF") },
                navigateBegivenheder = { navController.navigate("Begivenheder") },
                navigateDineRuter = { navController.navigate("DineRuter") },
            )
        }
        composable(route = "OpretBegivenhed") { OpretBegivenhedComponent() }
        composable(route = "DineRuter") {}
        composable(route = "Begivenheder") { }
        composable(route = "TDF") {}
        composable(route = "FindVej") {}

    }
}









