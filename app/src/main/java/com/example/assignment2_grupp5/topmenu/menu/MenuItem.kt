package com.example.assignment2_grupp5.topmenu.menu
import androidx.compose.ui.graphics.painter.Painter


data class MenuItem(
    val id: String,
    val title: String,
    val contentDescription: String,
    val icon: Painter
)
