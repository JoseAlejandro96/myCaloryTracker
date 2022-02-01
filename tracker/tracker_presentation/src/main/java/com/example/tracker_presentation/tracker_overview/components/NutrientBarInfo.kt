package com.example.tracker_presentation.tracker_overview.components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun NutrientBarInfo(
    value: Int,
    goal: Int,
    name: String,
    color: Color,
    modifier: Modifier = Modifier,
    strokeWidth: Dp = 8.dp
){
    val background = MaterialTheme.colors.background
    val goalExceededColor = MaterialTheme.colors.error

    val angleRatio = remember{
        Animatable(0f)
    }
    LaunchedEffect(key1 = value){
        angleRatio.animateTo(
            targetValue = if(goal > 0){
                value / goal.toFloat()
            }else 0f,
            animationSpec = tween(
                durationMillis = 300
            )
        )
    }


}