package uz.mobiler.gita.quizapplaunch

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.mobiler.gita.quizapplaunch.databinding.ActivityResultBinding
import uz.mobiler.gita.quizapplaunch.models.QuestionData
import java.io.Serializable

class ResultActivity : AppCompatActivity() {
    private val binding by lazy { ActivityResultBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        loadViews()

    }

    fun loadViews() {
        val list = intent.getSerializableExtra("list") as? List<QuestionData>

        val corrects = intent.getIntExtra("correct", 0)
        binding.correctCountTv.text = corrects.toString()
        binding.wrongCountTv.text = intent.getIntExtra("wrong", 0).toString()
        binding.skipCountTv.text = intent.getIntExtra("skip", 0).toString()

        val correctPercent: Int = (corrects.toDouble() / list!!.size * 100).toInt()
        if (correctPercent > 79) {
            binding.tvStatus.text = "Amazing"
        } else if (correctPercent > 65) {
            binding.tvStatus.text = "Well done"
        } else if (correctPercent > 55) {
            binding.tvStatus.text = "Good"
        } else if (correctPercent > 39) {
            binding.tvStatus.text = "Not bad"
        } else {
            binding.tvStatus.text = "Not good"
        }

        val sharedPreferences = getSharedPreferences("MyData", MODE_PRIVATE)
        val totalCoins =
            sharedPreferences.getString("coins", "0")?.toInt()?.plus((correctPercent / 2))
        sharedPreferences.edit().putString("coins", totalCoins.toString()).apply()
        binding.pointsTv.text = (correctPercent / 2).toString()

        binding.tvCategory.text = list[0].category
        binding.categoryIcon.setImageResource(
            when (list[0].category) {
                "Mathematics" -> R.drawable.math_icon
                "English" -> R.drawable.eng_icon
                "Science" -> R.drawable.science_icon
                "Football" -> R.drawable.football_icon
                "Movie" -> R.drawable.movie_icon
                "Capitals" -> R.drawable.capital_icon
                "History" -> R.drawable.history
                "Games" -> R.drawable.game
                else -> R.drawable.math_icon
            }
        )

        binding.homeBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finishAffinity()
        }

        binding.viewAnswersBtn.setOnClickListener {
            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("answers", true)
            intent.putExtra("list", list as Serializable)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        //diable back press
//        super.onBackPressed()
    }
}