package com.example.onboarding_domain.use_case

import com.example.core.util.UiText
import com.example.onboarding_domain.R

class ValidateNutrients {

    operator fun invoke(
        carbsRatioText: String,
        proteinRatioText: String,
        fatRatioText: String
    ): Unit{
        val carbsRatio = carbsRatioText.toIntOrNull()
        val proteinRatio = proteinRatioText.toIntOrNull()
        val fatRatio = fatRatioText.toIntOrNull()

        if(carbsRatio == null || proteinRatio == null || fatRatio == null){

        }
    }

    sealed class Result{
        data class Success(
            val carbsRatio: Int,
            val proteinRatio: Int,
            val fatRatio: Int
        ): Result()
        data class Error(val message: UiText): Result()
    }
}