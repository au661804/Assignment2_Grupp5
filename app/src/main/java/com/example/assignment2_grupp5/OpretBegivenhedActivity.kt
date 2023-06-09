package com.example.assignment2_grupp5

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.platform.LocalContext
import com.example.assignment2_grupp5.firestore.service.Firestore
import com.example.assignment2_grupp5.ui.theme.Assignment2_Grupp5Theme
import com.google.firebase.FirebaseApp
import com.google.firebase.database.*
import com.google.firebase.firestore.FirebaseFirestore





class OpretBegivenhedActivity:AppCompatActivity() {

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            Assignment2_Grupp5Theme() {


                        // on below line creating variable for freebase database
                        // and database reference.
                       // val firebaseDatabase = FirebaseDatabase.getInstance();
                       // val databaseReference = firebaseDatabase.getReference("BegivenhedsInfo");

                        // on below line we are calling method to display UI
                        OnOpretBegivenhed()


            }
        }
    }
}

@Composable
fun OnOpretBegivenhed(){

    Card() {


        val focusRequester = remember { FocusRequester() }


        val name = remember {
            mutableStateOf(TextFieldValue())
        }


        val dato = remember {
            mutableStateOf(TextFieldValue())
        }

        val lokation = remember {
            mutableStateOf(TextFieldValue())
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(25.dp)
                .fillMaxSize()
        ) {

            Text(
                "Opret begivenhed",
                color = Color.Black,
                fontWeight = FontWeight.Light,
                fontSize = 40.sp,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.padding(bottom = 80.dp))

            val colors = listOf(Color(0xFFffe53b), Color(0xFFff2525))

            OutlinedButton(
                onClick = { Log.v(this::class.simpleName, "HALLI HALLO clicked") },
                modifier = Modifier.size(150.dp),
                shape = CircleShape,
                border = BorderStroke(
                    1.dp,
                    brush = Brush.horizontalGradient(colors = colors, 0.1f)
                ),
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Blue)
            ) {
                Icon(Icons.Default.Add, contentDescription = "contentdescription")
            }

            Spacer(modifier = Modifier.padding(bottom = 40.dp))

            OutlinedTextField(
                value = name.value,
                modifier = Modifier
                    .width(210.dp)
                    .height(40.dp)
                    .focusRequester(focusRequester),


                onValueChange = {
                    name.value = it
                    //db.collection("begivenheder").add(name)
                },
                label = {
                    Text(
                        text = "Navn på begivenhed",
                        color = Color.Black.copy(0.5f),
                        fontWeight = FontWeight.Light,
                        fontSize = 10.sp,
                        textAlign = TextAlign.Left,

                        )
                },
                placeholder = {
                    Text(
                        text = "YourPlaceholder/Hint",
                        color = Color.Black.copy(0.5f),
                        fontWeight = FontWeight.Light,
                        fontSize = 10.sp,
                        textAlign = TextAlign.Left
                    )
                },
            )

            Spacer(modifier = Modifier.padding(bottom = 10.dp))

            OutlinedTextField(
                value = dato.value,
                modifier = Modifier
                    .width(210.dp)
                    .height(40.dp),

                onValueChange = {
                    dato.value = it
                },
                label = {
                    Text(
                        text = "Datoforbegivenhed",
                        color = Color.Black.copy(0.5f),
                        fontWeight = FontWeight.Light,
                        fontSize = 10.sp,
                        textAlign = TextAlign.Left,

                        )
                },
                placeholder = {
                    Text(
                        text = "YourPlaceholder/Hint",
                        color = Color.Black.copy(0.5f),
                        fontWeight = FontWeight.Light,
                        fontSize = 10.sp,
                        textAlign = TextAlign.Left
                    )
                },
            )

            Spacer(modifier = Modifier.padding(bottom = 10.dp))

            //TEKSTFELT
            OutlinedTextField(
                value = lokation.value,
                modifier = Modifier
                    .width(210.dp)
                    .height(40.dp),

                onValueChange = {
                    lokation.value = it
                },
                label = {
                    Text(
                        text = "Lokation for begivenhed",
                        color = Color.Black.copy(0.5f),
                        fontWeight = FontWeight.Light,
                        fontSize = 10.sp,
                        textAlign = TextAlign.Left,

                        )
                },
                placeholder = {
                    Text(
                        text = "YourPlaceholder/Hint",
                        color = Color.Black.copy(0.5f),
                        fontWeight = FontWeight.Light,
                        fontSize = 10.sp,
                        textAlign = TextAlign.Left
                    )
                },
            )

            Spacer(modifier = Modifier.padding(bottom = 50.dp))

            // KNAP
            Button(onClick={/*TODO*/},
                colors=ButtonDefaults.buttonColors(
                    backgroundColor=Color.Blue,
                    contentColor=Color.Gray),
                shape=RoundedCornerShape(percent=50),
                modifier=Modifier.size(width=130.dp,height=35.dp)

            )
            {
                Text("Opret Begivenhed",
                    color=Color.White.copy(0.8f),
                    fontWeight=FontWeight.Bold,
                    fontSize=9.sp)
            }


        }
    }

}







//@Preview
//@Composable
//fun CardPreview(){
//    Assignment2_Grupp5Theme{
//        OnOpretBegivenhed()
//
//    }
//}
