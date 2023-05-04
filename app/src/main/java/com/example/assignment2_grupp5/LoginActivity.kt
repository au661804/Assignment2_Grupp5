////package com.example.assignment2_grupp5
////
////import android.annotation.SuppressLint
////import android.content.ContentValues.TAG
////import androidx.appcompat.app.AppCompatActivity
////import android.os.Bundle
////import android.util.Log
////import androidx.activity.compose.setContent
////import androidx.compose.foundation.Image
////import androidx.compose.foundation.layout.Column
////import androidx.compose.foundation.layout.Row
////import androidx.compose.foundation.layout.fillMaxWidth
////import androidx.compose.foundation.layout.padding
////import androidx.compose.foundation.shape.RoundedCornerShape
////import androidx.compose.foundation.text.KeyboardOptions
////import androidx.compose.material.Button
////import androidx.compose.material.Text
////import androidx.compose.material.TextField
////import androidx.compose.runtime.*
////import androidx.compose.ui.Alignment
////import androidx.compose.ui.Modifier
////import androidx.compose.ui.draw.clip
////import androidx.compose.ui.res.painterResource
////import androidx.compose.ui.text.input.KeyboardType
////import androidx.compose.ui.tooling.preview.Preview
////import androidx.compose.ui.unit.dp
////import androidx.navigation.NavController
////import com.example.assignment2_grupp5.ui.theme.Assignment2_Grupp5Theme
////import kotlinx.coroutines.launch
////import com.google.firebase.FirebaseApp
////import com.google.firebase.auth.FirebaseAuth
////import com.google.firebase.auth.ktx.auth
////import com.google.firebase.firestore.FirebaseFirestore
////import com.google.firebase.firestore.auth.User
////import com.google.firebase.ktx.Firebase
////import kotlin.coroutines.resume
////import kotlin.coroutines.suspendCoroutine
////
//class LoginActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
////
////
////        }
////    }
////}
////suspend fun Login(email: String, password:String) {
////    val auth=Firebase.auth
////    FirebaseApp.initializeApp(this)
////    val db=FirebaseFirestore.getInstance()
////    val service=FireStore(db,auth)
////
////    suspendCoroutine { continuation ->
////        auth.signInWithEmailAndPassword(email, password)
////            .addOnCompleteListener { task ->
////                if (task.isSuccessful) {
////                    Log.d(TAG, "Createuserwithemail success")
////                    val user = auth.currentUser ?: throw Exception("Somethings wrong")
////                    val signedInUser = user.email?.let { User(user.providerId) }
////                        ?: throw Exception("createUserWithEmail:$email failure")
////                    continuation.resume(signedInUser)
////                } else {
////                    Log.w(TAG, "Createuserwithemail:failure", task.exception)
////                    throw Exception("createduserwithemail: $email failure", task.exception)
////                }
////            }
////    }
////}
////fun login(service: FireStore, nav: NavController)
////{
////    val auth=Firebase.auth
////    FirebaseApp.initializeApp(this)
////    val db=FirebaseFirestore.getInstance()
////    val service=FireStore(db,auth)
////
////    val email= remember { mutableStateOf("") }
////    val password = remember {mutableStateOf("") }
////    val scope = rememberCoroutineScope()
////    Column(){
////        Row(){
////            Text("Email")
////            TextField(value=email.value, onValueChange = {newText->email.value=newText})
////        }
////        Row(){
////            Text("Password")
////            TextField(
////                value=password.value,
////                onValueChange={newText->password.value=newText},
////                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
////            )
////        }
////        Button(onClick =
////        {
////            scope.launch {
////                val user=service.login(email.value,password.value)
////            }
////        }){}
//    }
//
//
