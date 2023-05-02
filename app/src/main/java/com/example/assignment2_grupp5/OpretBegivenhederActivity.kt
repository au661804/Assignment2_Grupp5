package com.example.assignment2_grupp5

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
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
import com.example.assignment2_grupp5.ui.theme.Assignment2_Grupp5Theme

class OpretBegivenhedActivity :AppCompatActivity(){
    override fun onCreate (savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContent{
            Assignment2_Grupp5Theme(){
                OnOpretBegivenhed()
            }
        }
    }
}

@Composable
fun OnOpretBegivenhed(){
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

        Column(
            horizontalAlignment=Alignment.CenterHorizontally,
            modifier=Modifier.padding(15.dp)
        ){

            Text("Opretbegivenhed",
                color=Color.Black,
                fontWeight=FontWeight.Light,
                fontSize=20.sp,
                textAlign=TextAlign.Center)

            Spacer(modifier=Modifier.padding(bottom=25.dp))

            val colors = listOf(Color(0xFFffe53b),Color(0xFFff2525))

            OutlinedButton(onClick={/*TODO*/},
                modifier=Modifier.size(50.dp),//avoidtheovalshape
                shape=CircleShape,
                border=BorderStroke(1.dp,brush=Brush.horizontalGradient(colors=colors,0.1f)),
                contentPadding=PaddingValues(0.dp),//avoidthelittleicon
                colors=ButtonDefaults.outlinedButtonColors(contentColor=Color.Blue)
            ){
                Icon(Icons.Default.Add,contentDescription="contentdescription")
            }

            Spacer(modifier=Modifier.padding(bottom=25.dp))

            OutlinedTextField(value=text,
                modifier=Modifier
                    .width(110.dp)
                    .height(30.dp)
                    .focusRequester(focusRequester),

                onValueChange={newText->
                    text=newText
                },
                label={Text(text="Navnpåbegivenhed",
                    color=Color.Black.copy(0.5f),
                    fontWeight=FontWeight.Light,
                    fontSize=5.sp,
                    textAlign=TextAlign.Left,

                    )},
                placeholder={Text(text="YourPlaceholder/Hint",
                    color=Color.Black.copy(0.5f),
                    fontWeight=FontWeight.Light,
                    fontSize=5.sp,
                    textAlign=TextAlign.Left
                )},)

            Spacer(modifier=Modifier.padding(bottom=10.dp))

            OutlinedTextField(value=text,
                modifier=Modifier
                    .width(110.dp)
                    .height(30.dp),

                onValueChange={newText->
                    text=newText
                },
                label={Text(text="Dato for begivenhed",
                    color=Color.Black.copy(0.5f),
                    fontWeight=FontWeight.Light,
                    fontSize=5.sp,
                    textAlign=TextAlign.Left,

                    )},
                placeholder={Text(text="Your Placeholder/Hint",
                    color=Color.Black.copy(0.5f),
                    fontWeight=FontWeight.Light,
                    fontSize=5.sp,
                    textAlign=TextAlign.Left
                )},)

            Spacer(modifier=Modifier.padding(bottom=10.dp))

            OutlinedTextField(value=text,
                modifier=Modifier
                    .width(110.dp)
                    .height(30.dp),

                onValueChange={newText->
                    text=newText
                },
                label={Text(text="Lokation for begivenhed",
                    color=Color.Black.copy(0.5f),
                    fontWeight=FontWeight.Light,
                    fontSize=5.sp,
                    textAlign=TextAlign.Left,

                    )},
                placeholder={Text(text="Your Placeholder/Hint",
                    color=Color.Black.copy(0.5f),
                    fontWeight=FontWeight.Light,
                    fontSize=5.sp,
                    textAlign=TextAlign.Left
                )},)

            Spacer(modifier=Modifier.padding(bottom=50.dp))

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



@Preview
@Composable
fun CardPreview(){
    Assignment2_Grupp5Theme{
        OnOpretBegivenhed()

    }
}
