package com.example.assignment2_grupp5.LogIn.service

import android.util.Log
import androidx.compose.ui.text.input.TextFieldValue
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import dk.howards.androidApp.firestore.service.User
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine



class LoginService(private val auth: FirebaseAuth)
{    companion object {
        const val TAG = "FIRE_STORE_SERVICE"
    }


    suspend fun login(email: String, password: String):User {
    return suspendCoroutine { continuation ->
            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        Log.d(TAG, "Logged in :success")
                        val user = auth.currentUser ?: throw Exception("Something wrong")
                        val SignedInUser = User(user)
                            //?: throw Exception("createUserWithEmail:$email failure")
                        continuation.resume(SignedInUser)
                    } else {
                        // If sign in fails, display a message to the user.
                        Log.w(TAG, "Logged in:failure", task.exception)
                        throw throw Exception("login: $email failure", task.exception)
                    }
                }
        }
    }



    suspend fun signup(email: String, password: String) :User {
    return suspendCoroutine { continuation ->
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Log.d(TAG, "createUserWithEmail:success")
                    val user = auth.currentUser ?: throw Exception("Something wrong")
                    val signedInUser =  User(user)
                        ?: throw Exception("createUserWithEmail:$email failure")
                    continuation.resume(signedInUser)

                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "createUserWithEmail:failure", task.exception)
                    throw throw Exception("createUserWithEmail: $email failure", task.exception)
                }
            }
    }
}



}
