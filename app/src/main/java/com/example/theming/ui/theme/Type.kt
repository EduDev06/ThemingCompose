package com.example.theming.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.theming.R

private val Montserrat = FontFamily(
    Font(R.font.montserrat),
    Font(R.font.montserrat_medium, FontWeight.Medium),
    Font(R.font.montserrat_semibold, FontWeight.SemiBold)
)

private val Domine = FontFamily(
    Font(R.font.domine),
    Font(R.font.domine_bold, FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    defaultFontFamily = Montserrat,
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    button = TextStyle(
        fontFamily = Domine,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        letterSpacing = 1.25.sp
    )
)