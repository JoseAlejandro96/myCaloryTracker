package com.example.tracker_presentation.tracker_overview

import androidx.annotation.DrawableRes
import com.example.core.util.UiText
import com.example.tracker_domain.model.MealType
import com.example.core.R

data class Meal(
    val name: UiText,
    @DrawableRes val drawableResource: Int,
    val mealType: MealType,
    val carbs: Int = 0,
    val protein: Int = 0,
    val fat: Int = 0,
    val calories: Int = 0,
    val isExpanded: Boolean = false
)

val defaultMeals = listOf(
    Meal(
        name = UiText.StringResource(R.string.breakfast),
        drawableResource = R.drawable.ic_breakfast,
        mealType = MealType.Breakfast
    ),
    Meal(
        name = UiText.StringResource(R.string.lunch),
        drawableResource = R.drawable.ic_lunch,
        mealType = MealType.Lunch
    ),
    Meal(
        name = UiText.StringResource(R.string.dinner),
        drawableResource = R.drawable.ic_dinner,
        mealType = MealType.Dinner
    ),
    Meal(
        name = UiText.StringResource(R.string.snacks),
        drawableResource = R.drawable.ic_snack,
        mealType = MealType.Snack
    ),
)
