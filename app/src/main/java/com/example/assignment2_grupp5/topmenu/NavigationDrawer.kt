package com.example.assignment2_grupp5

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.assignment2_grupp5.topmenu.menu.MenuItem
import com.example.assignment2_grupp5.ui.theme.Assignment2_Grupp5Theme

@Composable
fun DrawerHeader(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 64.dp)

    ) 
    {
        Text(text = "Fredagsbar!", color = MaterialTheme.colors.onBackground, style = MaterialTheme.typography.h4)
    }
}

@Composable
fun DrawerBody(
    items: List<MenuItem>,
    modifier: Modifier = Modifier,
    itemTextStyle: TextStyle = TextStyle(fontSize = 18.sp),
    onItemClick: (MenuItem) -> Unit
){
    LazyColumn(modifier){
        items(items){item ->
            Row(modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    onItemClick(item)
                }
                .padding(16.dp)
            ) {
                Icon(modifier = Modifier.width(30.dp) ,painter = item.icon,
                    contentDescription = item.contentDescription, tint = Color.Red)
                Spacer(modifier = Modifier
                    .width(16.dp)
                    .align(Alignment.CenterVertically))
                Text(text = item.title, style = itemTextStyle, modifier = Modifier.weight(1f))
            }
        }

    }

}

@Preview
@Composable
fun previewDrawer()
{
    DrawerHeader()
}
