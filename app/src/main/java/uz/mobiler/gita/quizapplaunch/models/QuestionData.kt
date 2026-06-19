package uz.mobiler.gita.quizapplaunch.models

import java.io.Serializable

data class QuestionData(
    val img: Int,
    val category: String,
    val question: String,
    val variant1: String,
    val variant2: String,
    val variant3: String,
    val variant4: String,
    val correctVariantIndex: Int,
    var selectedVariant: Int,
) : Serializable