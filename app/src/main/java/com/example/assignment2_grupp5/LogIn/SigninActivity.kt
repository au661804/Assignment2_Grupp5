package com.example.assignment2_grupp5.LogIn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.navigation.compose.rememberNavController
import com.example.assignment2_grupp5.LogIn.Navigation.LoginNavigation
import com.example.assignment2_grupp5.LogIn.service.LoginService
import com.example.assignment2_grupp5.ui.theme.Assignment2_Grupp5Theme

class SigninActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Assignment2_Grupp5Theme() {
                val navController= rememberNavController()
                Column() {
                    LoginNavigation(navController = navController, service = LoginService())
                }
            }
        }
    }
}
