package com.example.tracker_domain.use_case

import com.example.tracker_domain.model.MealType
import java.util.prefs.Preferences

class CalculateMealNutrients(
    private val preferences: Preferences
) {

    data class MealNutrients(
        val carbs: Int,
        val protein: Int,
        val fat: Int,
        val calories: Int,
        val mealType: MealType
    )
}