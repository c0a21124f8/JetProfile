package com.example.jetprofile.conponents

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun ProfileText(text_1: String, fontS: Int) {

    Text(
        text = text_1,
        color = Color.Gray,
        fontSize = fontS.sp,
        fontWeight = FontWeight.ExtraBold,
    )
}