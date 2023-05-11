package com.example.assignment2_grupp5.LogIn


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.assignment2_grupp5.LogIn.Components.LogIn
import com.example.assignment2_grupp5.LogIn.Components.LoginFront
import com.example.assignment2_grupp5.LogIn.Components.SignUp
import com.example.assignment2_grupp5.LogIn.service.LoginService
import com.example.assignment2_grupp5.ui.theme.Assignment2_Grupp5Theme
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class Main : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val auth = Firebase.auth
        FirebaseApp.initializeApp(this);
        val service = LoginService(auth)
        Firebase.firestore.app

        //madpassword
        auth.currentUser
        setContent {
             Assignment2_Grupp5Theme{
                val navController = rememberNavController()

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    NavHost(navController=navController, startDestination="LogInSignUp")
                    {
                        composable("LogInSignUp"){
                            LoginFront(navigateSignUp={navController.navigate("SignUp")},
                                navigateLogIn = {navController.navigate("LogIn")})
                        }
                        composable("Signup") { SignUp(service, nav = navController) }
                        composable("LogIn"){ LogIn(service, nav=navController)}
                        }
                        //composable("mainScreen"){}
                    }

                }
            }
        }
    }




