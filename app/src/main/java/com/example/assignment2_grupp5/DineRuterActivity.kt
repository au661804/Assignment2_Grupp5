package com.example.assignment2_grupp5

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.assignment2_grupp5.ui.theme.Assignment2_Grupp5Theme


class DineRuterActivity: AppCompatActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment2_Grupp5Theme() {


                // on below line creating variable for freebase database
                // and database reference.
               // val firebaseDatabase = FirebaseDatabase.getInstance();
                //val databaseReference = firebaseDatabase.getReference("DineRuterInfor");

                // on below line we are calling method to display UI
                //OnDineRuter(LocalContext.current, databaseReference)


            }
        }
    }
}

@Composable
fun OnDineRuter()
{


}

@Preview
@Composable
fun PreviewOnDineRuter()
{
    OnDineRuter()
}