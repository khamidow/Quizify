package uz.mobiler.gita.quizapplaunch.repository

import uz.mobiler.gita.quizapplaunch.R
import uz.mobiler.gita.quizapplaunch.models.CategoryData
import uz.mobiler.gita.quizapplaunch.models.QuestionData

class CategoryRepository {
    private val list = mutableListOf<CategoryData>()

    init {
        list.add(CategoryData(R.drawable.math_icon, "Mathematics", 10))
        list.add(CategoryData(R.drawable.eng_icon, "English", 10))
        list.add(CategoryData(R.drawable.science_icon, "Science", 10))
        list.add(CategoryData(R.drawable.football_icon, "Football", 10))
        list.add(CategoryData(R.drawable.movie_icon, "Movie", 10))
        list.add(CategoryData(R.drawable.capital_icon, "Capitals", 10))
        list.add(CategoryData(R.drawable.history, "History", 10))
        list.add(CategoryData(R.drawable.game, "Games", 10))
    }

    fun getAllCategories(): List<CategoryData> {
        return list
    }
    fun getCategoryByIndex(index:Int): CategoryData{
        return list[index]
    }
}