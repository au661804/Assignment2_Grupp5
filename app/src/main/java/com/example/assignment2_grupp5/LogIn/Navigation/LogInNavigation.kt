package com.example.assignment2_grupp5.LogIn.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.assignment2_grupp5.LogIn.Components.LogIn
import com.example.assignment2_grupp5.LogIn.Components.LoginFront
import com.example.assignment2_grupp5.LogIn.Components.SignUp
import com.example.assignment2_grupp5.LogIn.service.LoginService
@Composable
fun LoginNavigation(navController: NavHostController, service:LoginService)
{
//    val navController = rememberNavController()
//
//    NavHost(navController=navController, startDestination="LogInSignUp")
//    {
//        composable("LogInSignUp"){
//            LoginFront(
//                navigateSignUp={navController.navigate("SignUp")},
//                navigateLogIn = {navController.navigate("LogIn")})}
//        composable("SignUp"){
//            SignUp(
//                service, nav = navController)
//                //SignedUp={navController.navigate("LogIn")}
//        }
//        composable("LogIn"){ LogIn(
//            loggedIn={navController.navigate("mainScreen")},
//            logIn = {userName,password->service.Login(userName,password)}
//        )}

    }


