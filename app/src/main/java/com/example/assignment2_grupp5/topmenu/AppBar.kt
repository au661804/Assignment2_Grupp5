package com.example.assignment2_grupp5

import android.util.Log
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.assignment2_grupp5.ui.theme.Assignment2_Grupp5Theme

@Composable
fun AppBar(title: String, onNavigationIconClick: () -> Unit){
    TopAppBar(
        title = {
            Text(title)
        },
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = MaterialTheme.colors.onPrimary,
        navigationIcon = {
            IconButton(onClick = onNavigationIconClick) {
                Icon(imageVector = Icons.Default.Home,
                    contentDescription = "Toggle drawer")
            }
        }
    )

}
@Preview
@Composable
fun AppBarPreview() {
    Assignment2_Grupp5Theme(darkTheme = true) {
        AppBar(title = "TestTitle") {
            Log.v("AppBar", "menuClicked")
        }
    }
}