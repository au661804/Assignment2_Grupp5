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
import com.example.assignment2_grupp5.ui.theme.Assignment2_Grupp5Theme
import com.google.firebase.database.*

class OpretBegivenhedActivity:AppCompatActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment2_Grupp5Theme() {


                        // on below line creating variable for freebase database
                        // and database reference.
                        val firebaseDatabase = FirebaseDatabase.getInstance();
                        val databaseReference = firebaseDatabase.getReference("BegivenhedsInfo");

                        // on below line we are calling method to display UI
                        OnOpretBegivenhed(LocalContext.current, databaseReference)


            }
        }
    }
}

@Composable
fun OnOpretBegivenhed(context: android.content.Context, databaseReference: DatabaseReference){
    Card(){

//Image(
//painter=painterResource(id=R.drawable.background_opretbegivenhed),
//contentDescription=null,
//modifier=Modifier
//.fillMaxSize()
//)

        var text by remember{mutableStateOf(TextFieldValue(""))}
        var value by remember{mutableStateOf("EnterText")}
        val focusRequester =remember{FocusRequester()}

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
            horizontalAlignment=Alignment.CenterHorizontally,
            modifier= Modifier
                .padding(25.dp)
                .fillMaxSize()
        ){

            Text("Opret begivenhed",
                color=Color.Black,
                fontWeight=FontWeight.Light,
                fontSize=40.sp,
                textAlign=TextAlign.Center)

            Spacer(modifier=Modifier.padding(bottom=80.dp))

            val colors=listOf(Color(0xFFffe53b),Color(0xFFff2525))

            OutlinedButton(onClick={ Log.v(this::class.simpleName, "HALLI HALLO clicked")},
                modifier=Modifier.size(150.dp),//avoidtheovalshape
                shape=CircleShape,
                border=BorderStroke(1.dp,brush=Brush.horizontalGradient(colors=colors,0.1f)),
                contentPadding=PaddingValues(0.dp),//avoidthelittleicon
                colors=ButtonDefaults.outlinedButtonColors(contentColor=Color.Blue)
            ){
                Icon(Icons.Default.Add,contentDescription="contentdescription")
            }

            Spacer(modifier=Modifier.padding(bottom=40.dp))

            OutlinedTextField(value=name.value,
                modifier= Modifier
                    .width(210.dp)
                    .height(40.dp)
                    .focusRequester(focusRequester),


                onValueChange={
                    name.value = it
                },
                label={Text(text="Navn på begivenhed",
                    color=Color.Black.copy(0.5f),
                    fontWeight=FontWeight.Light,
                    fontSize=10.sp,
                    textAlign=TextAlign.Left,

                    )},
                placeholder={Text(text="YourPlaceholder/Hint",
                    color=Color.Black.copy(0.5f),
                    fontWeight=FontWeight.Light,
                    fontSize=10.sp,
                    textAlign=TextAlign.Left
                )},)

            Spacer(modifier=Modifier.padding(bottom=10.dp))

            OutlinedTextField(value=dato.value,
                modifier= Modifier
                    .width(210.dp)
                    .height(40.dp),

                onValueChange={dato.value = it
                },
                label={Text(text="Datoforbegivenhed",
                    color=Color.Black.copy(0.5f),
                    fontWeight=FontWeight.Light,
                    fontSize=10.sp,
                    textAlign=TextAlign.Left,

                    )},
                placeholder={Text(text="YourPlaceholder/Hint",
                    color=Color.Black.copy(0.5f),
                    fontWeight=FontWeight.Light,
                    fontSize=10.sp,
                    textAlign=TextAlign.Left
                )},)

            Spacer(modifier=Modifier.padding(bottom=10.dp))

            OutlinedTextField(value= lokation.value,
                modifier= Modifier
                    .width(210.dp)
                    .height(40.dp),

                onValueChange={lokation.value = it
                },
                label={Text(text="Lokation for begivenhed",
                    color=Color.Black.copy(0.5f),
                    fontWeight=FontWeight.Light,
                    fontSize=10.sp,
                    textAlign=TextAlign.Left,

                    )},
                placeholder={Text(text="YourPlaceholder/Hint",
                    color=Color.Black.copy(0.5f),
                    fontWeight=FontWeight.Light,
                    fontSize=10.sp,
                    textAlign=TextAlign.Left
                )},)

            Spacer(modifier=Modifier.padding(bottom=50.dp))

            Button(onClick={val empObj =
                EmployeeObj(name.value.text, dato.value.text, lokation.value.text);
                // we are use add value event listener method
                // which is called with database reference.
                databaseReference.addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        // inside the method of on Data change we are setting
                        // our object class to our database reference.
                        // data base reference will sends data to firebase.
                        databaseReference.setValue(empObj)

                        // after adding this data we
                        // are showing toast message.
                        Toast.makeText(
                            context,
                            "Data added to Firebase Database",
                            Toast.LENGTH_SHORT
                        ).show()
                    }

                     override fun onCancelled(error: DatabaseError) {
                        // if the data is not added or it is cancelled then
                        // we are displaying a failure toast message.
                        Toast.makeText(
                            context,
                            "Fail to add data $error",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                })
            },
                colors=ButtonDefaults.buttonColors(
                    backgroundColor=Color.Blue,
                    contentColor=Color.Gray),
                shape=RoundedCornerShape(percent=50),
                modifier=Modifier.size(width=210.dp,height=40.dp)

            )
            {
                Text("Opret Begivenhed",
                    color=Color.White.copy(0.8f),
                    fontWeight=FontWeight.Bold,
                    fontSize=15.sp)
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
