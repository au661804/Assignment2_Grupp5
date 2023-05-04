package com.example.assignment2_grupp5

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.ButtonColors
import androidx.compose.material.TopAppBar
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import backend.Repository
//import backend.Repository
import com.example.assignment2_grupp5.Begivenheder.BegivenhederItem
//import com.example.assignment2_grupp5.tools.LoggedActivity
import com.example.assignment2_grupp5.ui.theme.Assignment2_Grupp5Theme

//
//
class BegivenhederActivity: LoggedActivity()  {
//
//    private val repository = Repository()
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        setContent {
//
//            Assignment2_Grupp5Theme(darkTheme = true) {
//                Column() {
//                    Button(onClick = {
//                        Log.v(this@BegivenhederActivity::class.simpleName, "Back Button Clicked")
//                        val intent = Intent(this@BegivenhederActivity, MainActivity::class.java)
//                        intent.putExtra("Back", 5)
//                        startActivity(intent)
//                    }) {
//                       Icon(painter = painterResource(id = R.drawable.contacts), contentDescription ="Go back", tint = Color.Blue)
//
//                    }
//                    repository.getBegivenhederList()
//                        .map {
//                            BegivenhederItem(name = it.name, imageId = it.imageId) {
//                                val intent =
//                                    Intent(this@BegivenhederActivity, MainActivity::class.java)
//                                intent.putExtra("name", it.name)
//                                startActivity(intent)
//
//                            }
//                        }
//                }
//            }
//
//        }
//    }
}
//
//
