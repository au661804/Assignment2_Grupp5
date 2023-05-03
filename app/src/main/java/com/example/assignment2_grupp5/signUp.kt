package com.example.assignment2_grupp5

import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase

class SignUp : AppCompatActivity() {

    //private lateinit var editTextEmail2: EditText
    //private lateinit var editTextPassword2: EditText
    //private lateinit var buttonSignUp: Button

    private lateinit var firebaseAuth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signupscreen)

        val editTextEmail2: EditText = findViewById(R.id.editTextEmail2)
        val editTextPassword2: EditText = findViewById(R.id.editTextPassword2)
        val buttonSignUp: Button = findViewById(R.id.button2)

     //  val auth = Firebase.auth
        firebaseAuth = Firebase.auth
        FirebaseApp.initializeApp(this)
        val db = FirebaseFirestore.getInstance()
       // val service=FireStore(db,auth)

        buttonSignUp.setOnClickListener {
            val email = editTextEmail2.text.toString().trim()
            val password = editTextPassword2.text.toString().trim()

            if (TextUtils.isEmpty(email)) {
                Toast.makeText(applicationContext, "Please enter email", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if (TextUtils.isEmpty(password)) {
                Toast.makeText(applicationContext, "Please enter password", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        val user = firebaseAuth.currentUser
                        Toast.makeText(applicationContext, "Sign up successful", Toast.LENGTH_LONG).show()
                        Log.d("userid"," user id = ${user!!.uid}")
                    } else {
                        val user = firebaseAuth.currentUser
                        if (user!=null)
                            Log.d("userid"," user id = ${user!!.uid}")
                        Toast.makeText(applicationContext, "Sign up failed", Toast.LENGTH_LONG).show()
                    }
                }

}}}