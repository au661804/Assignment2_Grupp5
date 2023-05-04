package com.example.assignment2_grupp5.AndenActivity.Component

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.assignment2_grupp5.EmployeeObj


@Composable
fun OpretBegivenhedComponent() {


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
                shape= RoundedCornerShape(percent=50),
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


@Preview
@Composable
fun previewOpretBegivenheder(){
    OpretBegivenhedComponent()
}