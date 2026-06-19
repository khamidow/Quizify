package uz.mobiler.gita.quizapplaunch

import android.animation.ValueAnimator
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Parcelable
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.mobiler.gita.quizapplaunch.databinding.ActivityQuizBinding
import uz.mobiler.gita.quizapplaunch.models.CategoryData
import uz.mobiler.gita.quizapplaunch.models.QuestionData
import uz.mobiler.gita.quizapplaunch.repository.CategoryRepository
import uz.mobiler.gita.quizapplaunch.repository.QuestionsRepository
import java.io.Serializable
import java.util.ArrayList

class QuizActivity : AppCompatActivity() {
    private val binding by lazy { ActivityQuizBinding.inflate(layoutInflater) }
    private val list by lazy { mutableListOf<QuestionData>() }
    private val repository = QuestionsRepository()
    private val catRepository = CategoryRepository()
    private lateinit var category: CategoryData
    private var questionCount = 0
    private var questionIndex = 0
    private val categoryPos by lazy { intent.getIntExtra("pos", 0) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        if (intent.getBooleanExtra("answers", false)) {
            questionIndex = 0
            list.clear()
            list.addAll(intent.getSerializableExtra("list") as List<QuestionData>)
            questionCount = list.size

            val categoryFromListTemp = list[0].category
            if (categoryFromListTemp == "Mathematics") {
                category = catRepository.getCategoryByIndex(0)
            } else if (categoryFromListTemp == "English") {
                category = catRepository.getCategoryByIndex(1)
            } else if (categoryFromListTemp == "Science") {
                category = catRepository.getCategoryByIndex(2)
            } else if (categoryFromListTemp == "Football") {
                category = catRepository.getCategoryByIndex(3)
            } else if (categoryFromListTemp == "Movie") {
                category = catRepository.getCategoryByIndex(4)
            } else if (categoryFromListTemp == "Capitals") {
                category = catRepository.getCategoryByIndex(5)
            }else if (categoryFromListTemp == "History") {
                category = catRepository.getCategoryByIndex(6)
            }else if (categoryFromListTemp == "Games") {
                category = catRepository.getCategoryByIndex(7)
            }

            loadQuestionAndAnswerForResultByIndex(questionIndex)
            loadClicksForAnswersResult()
        } else {
            loadData()
            loadClicks()
        }


    }

    fun loadClicksForAnswersResult() {
        binding.backBtn.setOnClickListener { finish() }
        binding.nextBtn.setOnClickListener {
            if (questionIndex == questionCount - 1) {
//                Toast.makeText(this, "Back to Result Activity", Toast.LENGTH_SHORT).show()
//                val intent = Intent(this, ResultActivity::class.java)
//                var correct = 0
//                var wrong = 0
//                var skip = 0
//                for (i in list.indices) {
//                    if (list[i].selectedVariant == list[i].correctVariantIndex) correct++
//                    else if (list[i].selectedVariant == -1) skip++
//                    else wrong++
//                }
//                intent.putExtra("correct", correct)
//                intent.putExtra("wrong", wrong)
//                intent.putExtra("skip", skip)
//                intent.putExtra("questionCount", skip)
//                intent.putExtra("list", list as Serializable)
//                startActivity(intent)
                finish()
            } else {
                questionIndex++
                loadQuestionAndAnswerForResultByIndex(questionIndex)
            }
        }
        binding.prevBtn.setOnClickListener {
            questionIndex--
            loadQuestionAndAnswerForResultByIndex(questionIndex)
        }
    }

    fun loadClicks() {
        binding.backBtn.setOnClickListener { finish() }
        binding.nextBtn.setOnClickListener {
            if (questionIndex == questionCount - 1) {
//                Toast.makeText(this, "Result Activity", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, ResultActivity::class.java)
                var correct = 0
                var wrong = 0
                var skip = 0
                for (i in list.indices) {
                    if (list[i].selectedVariant == list[i].correctVariantIndex) correct++
                    else if (list[i].selectedVariant == -1) skip++
                    else wrong++
                }
                intent.putExtra("correct", correct)
                intent.putExtra("wrong", wrong)
                intent.putExtra("skip", skip)
                intent.putExtra("questionCount", skip)
                intent.putExtra("list", list as Serializable)
                startActivity(intent)
                finish()
            } else {
                questionIndex++
                loadQuestionByIndex(questionIndex)
            }
        }
        binding.prevBtn.setOnClickListener {
            questionIndex--
            loadQuestionByIndex(questionIndex)
        }

        binding.variant1Tv.setOnClickListener {
            if (list[questionIndex].selectedVariant != -1) {
                when (list[questionIndex].selectedVariant) {
                    1 -> {
                        binding.variant2Tv.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant2Tv.setTextColor(Color.parseColor("#462B20"))
                    }

                    2 -> {
                        binding.variant3Tv.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant3Tv.setTextColor(Color.parseColor("#462B20"))
                    }

                    3 -> {
                        binding.variant4Tv.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant4Tv.setTextColor(Color.parseColor("#462B20"))
                    }
                }
            }
            if (list[questionIndex].selectedVariant == 0) {
                list[questionIndex] = list[questionIndex].copy(selectedVariant = -1)
                binding.variant1Tv.setBackgroundResource(R.drawable.variant_bcg)
                binding.variant1Tv.setTextColor(Color.parseColor("#462B20"))
            } else {
                list[questionIndex] = list[questionIndex].copy(selectedVariant = 0)
                binding.variant1Tv.setBackgroundResource(R.drawable.variant_selected_bcg)
                binding.variant1Tv.setTextColor(Color.parseColor("#F4F0BB"))
            }
        }
        binding.variant2Tv.setOnClickListener {
            if (list[questionIndex].selectedVariant != -1) {
                when (list[questionIndex].selectedVariant) {
                    0 -> {
                        binding.variant1Tv.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant1Tv.setTextColor(Color.parseColor("#462B20"))
                    }

                    2 -> {
                        binding.variant3Tv.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant3Tv.setTextColor(Color.parseColor("#462B20"))
                    }

                    3 -> {
                        binding.variant4Tv.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant4Tv.setTextColor(Color.parseColor("#462B20"))
                    }
                }
            }

            if (list[questionIndex].selectedVariant == 1) {
                list[questionIndex] = list[questionIndex].copy(selectedVariant = -1)
                binding.variant2Tv.setBackgroundResource(R.drawable.variant_bcg)
                binding.variant2Tv.setTextColor(Color.parseColor("#462B20"))
            } else {
                list[questionIndex] = list[questionIndex].copy(selectedVariant = 1)
                binding.variant2Tv.setBackgroundResource(R.drawable.variant_selected_bcg)
                binding.variant2Tv.setTextColor(Color.parseColor("#F4F0BB"))
            }
        }
        binding.variant3Tv.setOnClickListener {
            if (list[questionIndex].selectedVariant != -1) {
                when (list[questionIndex].selectedVariant) {
                    0 -> {
                        binding.variant1Tv.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant1Tv.setTextColor(Color.parseColor("#462B20"))
                    }

                    1 -> {
                        binding.variant2Tv.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant2Tv.setTextColor(Color.parseColor("#462B20"))
                    }

                    3 -> {
                        binding.variant4Tv.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant4Tv.setTextColor(Color.parseColor("#462B20"))
                    }
                }
            }

            if (list[questionIndex].selectedVariant == 2) {
                list[questionIndex] = list[questionIndex].copy(selectedVariant = -1)
                binding.variant3Tv.setBackgroundResource(R.drawable.variant_bcg)
                binding.variant3Tv.setTextColor(Color.parseColor("#462B20"))
            } else {
                list[questionIndex] = list[questionIndex].copy(selectedVariant = 2)
                binding.variant3Tv.setBackgroundResource(R.drawable.variant_selected_bcg)
                binding.variant3Tv.setTextColor(Color.parseColor("#F4F0BB"))
            }
        }
        binding.variant4Tv.setOnClickListener {
            if (list[questionIndex].selectedVariant != -1) {
                when (list[questionIndex].selectedVariant) {
                    0 -> {
                        binding.variant1Tv.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant1Tv.setTextColor(Color.parseColor("#462B20"))
                    }

                    1 -> {
                        binding.variant2Tv.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant2Tv.setTextColor(Color.parseColor("#462B20"))
                    }

                    2 -> {
                        binding.variant3Tv.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant3Tv.setTextColor(Color.parseColor("#462B20"))
                    }
                }
            }

            if (list[questionIndex].selectedVariant == 3) {
                list[questionIndex] = list[questionIndex].copy(selectedVariant = -1)
                binding.variant4Tv.setBackgroundResource(R.drawable.variant_bcg)
                binding.variant4Tv.setTextColor(Color.parseColor("#462B20"))
            } else {
                list[questionIndex] = list[questionIndex].copy(selectedVariant = 3)
                binding.variant4Tv.setBackgroundResource(R.drawable.variant_selected_bcg)
                binding.variant4Tv.setTextColor(Color.parseColor("#F4F0BB"))
            }
        }

        ////////////////////////////////////////////////////////////////////////////////////////////

        binding.variant1Tv2.setOnClickListener {
            if (list[questionIndex].selectedVariant != -1) {
                when (list[questionIndex].selectedVariant) {
                    1 -> {
                        binding.variant2Tv2.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant2Tv2.setTextColor(Color.parseColor("#462B20"))
                    }

                    2 -> {
                        binding.variant3Tv2.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant3Tv2.setTextColor(Color.parseColor("#462B20"))
                    }

                    3 -> {
                        binding.variant4Tv2.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant4Tv2.setTextColor(Color.parseColor("#462B20"))
                    }
                }
            }

            if (list[questionIndex].selectedVariant == 0) {
                list[questionIndex] = list[questionIndex].copy(selectedVariant = -1)
                binding.variant1Tv2.setBackgroundResource(R.drawable.variant_bcg)
                binding.variant1Tv2.setTextColor(Color.parseColor("#462B20"))
            } else {
                list[questionIndex] = list[questionIndex].copy(selectedVariant = 0)
                binding.variant1Tv2.setBackgroundResource(R.drawable.variant_selected_bcg)
                binding.variant1Tv2.setTextColor(Color.parseColor("#F4F0BB"))
            }
        }
        binding.variant2Tv2.setOnClickListener {
            if (list[questionIndex].selectedVariant != -1) {
                when (list[questionIndex].selectedVariant) {
                    0 -> {
                        binding.variant1Tv2.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant1Tv2.setTextColor(Color.parseColor("#462B20"))
                    }

                    2 -> {
                        binding.variant3Tv2.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant3Tv2.setTextColor(Color.parseColor("#462B20"))
                    }

                    3 -> {
                        binding.variant4Tv2.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant4Tv2.setTextColor(Color.parseColor("#462B20"))
                    }
                }
            }

            if (list[questionIndex].selectedVariant == 1) {
                list[questionIndex] = list[questionIndex].copy(selectedVariant = -1)
                binding.variant2Tv2.setBackgroundResource(R.drawable.variant_bcg)
                binding.variant2Tv2.setTextColor(Color.parseColor("#462B20"))
            } else {
                list[questionIndex] = list[questionIndex].copy(selectedVariant = 1)
                binding.variant2Tv2.setBackgroundResource(R.drawable.variant_selected_bcg)
                binding.variant2Tv2.setTextColor(Color.parseColor("#F4F0BB"))
            }
        }
        binding.variant3Tv2.setOnClickListener {
            if (list[questionIndex].selectedVariant != -1) {
                when (list[questionIndex].selectedVariant) {
                    0 -> {
                        binding.variant1Tv2.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant1Tv2.setTextColor(Color.parseColor("#462B20"))
                    }

                    1 -> {
                        binding.variant2Tv2.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant2Tv2.setTextColor(Color.parseColor("#462B20"))
                    }

                    3 -> {
                        binding.variant4Tv2.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant4Tv2.setTextColor(Color.parseColor("#462B20"))
                    }
                }
            }

            if (list[questionIndex].selectedVariant == 2) {
                list[questionIndex] = list[questionIndex].copy(selectedVariant = -1)
                binding.variant3Tv2.setBackgroundResource(R.drawable.variant_bcg)
                binding.variant3Tv2.setTextColor(Color.parseColor("#462B20"))
            } else {
                list[questionIndex] = list[questionIndex].copy(selectedVariant = 2)
                binding.variant3Tv2.setBackgroundResource(R.drawable.variant_selected_bcg)
                binding.variant3Tv2.setTextColor(Color.parseColor("#F4F0BB"))
            }
        }
        binding.variant4Tv2.setOnClickListener {
            if (list[questionIndex].selectedVariant != -1) {
                when (list[questionIndex].selectedVariant) {
                    0 -> {
                        binding.variant1Tv2.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant1Tv2.setTextColor(Color.parseColor("#462B20"))
                    }

                    1 -> {
                        binding.variant2Tv2.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant2Tv2.setTextColor(Color.parseColor("#462B20"))
                    }

                    2 -> {
                        binding.variant3Tv2.setBackgroundResource(R.drawable.variant_bcg)
                        binding.variant3Tv2.setTextColor(Color.parseColor("#462B20"))
                    }
                }
            }
            if (list[questionIndex].selectedVariant == 3) {
                list[questionIndex] = list[questionIndex].copy(selectedVariant = -1)
                binding.variant4Tv2.setBackgroundResource(R.drawable.variant_bcg)
                binding.variant4Tv2.setTextColor(Color.parseColor("#462B20"))
            } else {
                list[questionIndex] = list[questionIndex].copy(selectedVariant = 3)
                binding.variant4Tv2.setBackgroundResource(R.drawable.variant_selected_bcg)
                binding.variant4Tv2.setTextColor(Color.parseColor("#F4F0BB"))
            }
        }

    }

    fun loadData() {
        questionIndex = 0
        list.clear()
        category = catRepository.getCategoryByIndex(categoryPos)
        questionCount = category.questionCount

        if (categoryPos == 0) {
            list.addAll(repository.getMathQuestions(questionCount))
        } else if (categoryPos == 1) {
            list.addAll(repository.getEnglishQuestions(questionCount))
        } else if (categoryPos == 2) {
            list.addAll(repository.getScienceQuestions(questionCount))
        } else if (categoryPos == 3) {
            list.addAll(repository.getFootballQuestions(questionCount))
        } else if (categoryPos == 4) {
            list.addAll(repository.getMovieQuestions(questionCount))
        } else if (categoryPos == 5) {
            list.addAll(repository.getCapitalsQuestions(questionCount))
        } else if (categoryPos == 6) {
            list.addAll(repository.getHistoryQuestions(questionCount))
        } else if (categoryPos == 7) {
            list.addAll(repository.getGamesQuestions(questionCount))
        }
        loadQuestionByIndex(questionIndex)
    }

    fun loadQuestionByIndex(questionIndex: Int) {
        val question = list[questionIndex]
        //progress bar animation
        val animator = ValueAnimator.ofInt(
            binding.progressBar.progress,
            ((questionIndex + 1) * (100.0 / questionCount)).toInt()
        )
        animator.duration = 100 / questionCount * 30L
        animator.addUpdateListener { animation ->
            val animatedValue = animation.animatedValue as Int
            binding.progressBar.progress = animatedValue
        }

        animator.start()
        binding.outOfTv.text = "${questionIndex + 1}/$questionCount"

        binding.categoryIcon.setImageResource(category.img)
        binding.tvCategory.text = category.name

        if (questionIndex == 0) binding.prevBtn.visibility = View.GONE
        else binding.prevBtn.visibility = View.VISIBLE
        if (questionIndex == questionCount - 1) binding.nextBtn.text = "Finish"
        else binding.nextBtn.text = "Next"

        if (list[0].img == R.drawable.ic_launcher_background) {
            binding.questionContainer2.visibility = View.GONE
            binding.questionContainer1.visibility = View.VISIBLE

            binding.questionTv.text = question.question

            binding.variant1Tv.text = question.variant1
            binding.variant1Tv.setBackgroundResource(R.drawable.variant_bcg)
            binding.variant1Tv.setTextColor(Color.parseColor("#462B20"))

            binding.variant2Tv.text = question.variant2
            binding.variant2Tv.setBackgroundResource(R.drawable.variant_bcg)
            binding.variant2Tv.setTextColor(Color.parseColor("#462B20"))

            binding.variant3Tv.text = question.variant3
            binding.variant3Tv.setBackgroundResource(R.drawable.variant_bcg)
            binding.variant3Tv.setTextColor(Color.parseColor("#462B20"))

            binding.variant4Tv.text = question.variant4
            binding.variant4Tv.setBackgroundResource(R.drawable.variant_bcg)
            binding.variant4Tv.setTextColor(Color.parseColor("#462B20"))

            if (question.selectedVariant != -1) {
                if (question.selectedVariant == 0) {
                    binding.variant1Tv.setBackgroundResource(R.drawable.variant_selected_bcg)
                    binding.variant1Tv.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.selectedVariant == 1) {
                    binding.variant2Tv.setBackgroundResource(R.drawable.variant_selected_bcg)
                    binding.variant2Tv.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.selectedVariant == 2) {
                    binding.variant3Tv.setBackgroundResource(R.drawable.variant_selected_bcg)
                    binding.variant3Tv.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.selectedVariant == 3) {
                    binding.variant4Tv.setBackgroundResource(R.drawable.variant_selected_bcg)
                    binding.variant4Tv.setTextColor(Color.parseColor("#F4F0BB"))
                }
            }
        } else if (list[0].img != R.drawable.ic_launcher_background) {
            binding.questionContainer1.visibility = View.GONE
            binding.questionContainer2.visibility = View.VISIBLE

            binding.questionTv2.text = question.question
            binding.spaceImg2.setImageResource(question.img)

            binding.variant1Tv2.text = question.variant1
            binding.variant1Tv2.setBackgroundResource(R.drawable.variant_bcg)
            binding.variant1Tv2.setTextColor(Color.parseColor("#462B20"))

            binding.variant2Tv2.text = question.variant2
            binding.variant2Tv2.setBackgroundResource(R.drawable.variant_bcg)
            binding.variant2Tv2.setTextColor(Color.parseColor("#462B20"))

            binding.variant3Tv2.text = question.variant3
            binding.variant3Tv2.setBackgroundResource(R.drawable.variant_bcg)
            binding.variant3Tv2.setTextColor(Color.parseColor("#462B20"))

            binding.variant4Tv2.text = question.variant4
            binding.variant4Tv2.setBackgroundResource(R.drawable.variant_bcg)
            binding.variant4Tv2.setTextColor(Color.parseColor("#462B20"))

            if (question.selectedVariant != -1) {
                if (question.selectedVariant == 0) {
                    binding.variant1Tv2.setBackgroundResource(R.drawable.variant_selected_bcg)
                    binding.variant1Tv2.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.selectedVariant == 1) {
                    binding.variant2Tv2.setBackgroundResource(R.drawable.variant_selected_bcg)
                    binding.variant2Tv2.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.selectedVariant == 2) {
                    binding.variant3Tv2.setBackgroundResource(R.drawable.variant_selected_bcg)
                    binding.variant3Tv2.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.selectedVariant == 3) {
                    binding.variant4Tv2.setBackgroundResource(R.drawable.variant_selected_bcg)
                    binding.variant4Tv2.setTextColor(Color.parseColor("#F4F0BB"))
                }
            }
        }
    }

    fun loadQuestionAndAnswerForResultByIndex(questionIndex: Int) {
        val question = list[questionIndex]
        //progress bar animation
        val animator = ValueAnimator.ofInt(
            binding.progressBar.progress,
            ((questionIndex + 1) * (100.0 / questionCount)).toInt()
        )
        animator.duration = 100 / questionCount * 30L
        animator.addUpdateListener { animation ->
            val animatedValue = animation.animatedValue as Int
            binding.progressBar.progress = animatedValue
        }
        animator.start()
        binding.outOfTv.text = "${questionIndex + 1}/$questionCount"

        binding.categoryIcon.setImageResource(category.img)
        binding.tvCategory.text = category.name

        if (questionIndex == 0) binding.prevBtn.visibility = View.GONE
        else binding.prevBtn.visibility = View.VISIBLE
        if (questionIndex == questionCount - 1) binding.nextBtn.text = "Finish"
        else binding.nextBtn.text = "Next"

        if (list[0].img == R.drawable.ic_launcher_background) {
            binding.questionContainer2.visibility = View.GONE
            binding.questionContainer1.visibility = View.VISIBLE

            binding.questionTv.text = question.question

            binding.variant1Tv.text = question.variant1
            binding.variant1Tv.setBackgroundResource(R.drawable.variant_bcg)
            binding.variant1Tv.setTextColor(Color.parseColor("#462B20"))

            binding.variant2Tv.text = question.variant2
            binding.variant2Tv.setBackgroundResource(R.drawable.variant_bcg)
            binding.variant2Tv.setTextColor(Color.parseColor("#462B20"))

            binding.variant3Tv.text = question.variant3
            binding.variant3Tv.setBackgroundResource(R.drawable.variant_bcg)
            binding.variant3Tv.setTextColor(Color.parseColor("#462B20"))

            binding.variant4Tv.text = question.variant4
            binding.variant4Tv.setBackgroundResource(R.drawable.variant_bcg)
            binding.variant4Tv.setTextColor(Color.parseColor("#462B20"))
// t t f s t s f f t t
            if (question.selectedVariant == question.correctVariantIndex) {
                binding.skippedTv.visibility = View.GONE
                if (question.correctVariantIndex == 0) {
                    binding.variant1Tv.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant1Tv.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.correctVariantIndex == 1) {
                    binding.variant2Tv.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant2Tv.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.correctVariantIndex == 2) {
                    binding.variant3Tv.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant3Tv.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.correctVariantIndex == 3) {
                    binding.variant4Tv.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant4Tv.setTextColor(Color.parseColor("#F4F0BB"))
                }
            } else if (question.selectedVariant == -1) {
                binding.skippedTv.visibility = View.VISIBLE
                if (question.correctVariantIndex == 0) {
                    binding.variant1Tv.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant1Tv.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.correctVariantIndex == 1) {
                    binding.variant2Tv.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant2Tv.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.correctVariantIndex == 2) {
                    binding.variant3Tv.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant3Tv.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.correctVariantIndex == 3) {
                    binding.variant4Tv.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant4Tv.setTextColor(Color.parseColor("#F4F0BB"))
                }
            } else {
                binding.skippedTv.visibility = View.GONE
                if (question.selectedVariant == 0) {
                    binding.variant1Tv.setBackgroundResource(R.drawable.variant_wrong_bcg)
                    binding.variant1Tv.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.selectedVariant == 1) {
                    binding.variant2Tv.setBackgroundResource(R.drawable.variant_wrong_bcg)
                    binding.variant2Tv.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.selectedVariant == 2) {
                    binding.variant3Tv.setBackgroundResource(R.drawable.variant_wrong_bcg)
                    binding.variant3Tv.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.selectedVariant == 3) {
                    binding.variant4Tv.setBackgroundResource(R.drawable.variant_wrong_bcg)
                    binding.variant4Tv.setTextColor(Color.parseColor("#F4F0BB"))
                }

                if (question.correctVariantIndex == 0) {
                    binding.variant1Tv.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant1Tv.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.correctVariantIndex == 1) {
                    binding.variant2Tv.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant2Tv.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.correctVariantIndex == 2) {
                    binding.variant3Tv.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant3Tv.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.correctVariantIndex == 3) {
                    binding.variant4Tv.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant4Tv.setTextColor(Color.parseColor("#F4F0BB"))
                }
            }
        } else if (list[0].img != R.drawable.ic_launcher_background) {
            binding.questionContainer1.visibility = View.GONE
            binding.questionContainer2.visibility = View.VISIBLE

            binding.questionTv2.text = question.question
            binding.spaceImg2.setImageResource(question.img)

            binding.variant1Tv2.text = question.variant1
            binding.variant1Tv2.setBackgroundResource(R.drawable.variant_bcg)
            binding.variant1Tv2.setTextColor(Color.parseColor("#462B20"))

            binding.variant2Tv2.text = question.variant2
            binding.variant2Tv2.setBackgroundResource(R.drawable.variant_bcg)
            binding.variant2Tv2.setTextColor(Color.parseColor("#462B20"))

            binding.variant3Tv2.text = question.variant3
            binding.variant3Tv2.setBackgroundResource(R.drawable.variant_bcg)
            binding.variant3Tv2.setTextColor(Color.parseColor("#462B20"))

            binding.variant4Tv2.text = question.variant4
            binding.variant4Tv2.setBackgroundResource(R.drawable.variant_bcg)
            binding.variant4Tv2.setTextColor(Color.parseColor("#462B20"))

            if (question.selectedVariant == question.correctVariantIndex) {
                binding.skippedTv.visibility = View.GONE
                if (question.correctVariantIndex == 0) {
                    binding.variant1Tv2.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant1Tv2.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.correctVariantIndex == 1) {
                    binding.variant2Tv2.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant2Tv2.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.correctVariantIndex == 2) {
                    binding.variant3Tv2.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant3Tv2.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.correctVariantIndex == 3) {
                    binding.variant4Tv2.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant4Tv2.setTextColor(Color.parseColor("#F4F0BB"))
                }
            } else if (question.selectedVariant == -1) {
                binding.skippedTv.visibility = View.VISIBLE
                if (question.correctVariantIndex == 0) {
                    binding.variant1Tv2.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant1Tv2.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.correctVariantIndex == 1) {
                    binding.variant2Tv2.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant2Tv2.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.correctVariantIndex == 2) {
                    binding.variant3Tv2.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant3Tv2.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.correctVariantIndex == 3) {
                    binding.variant4Tv2.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant4Tv2.setTextColor(Color.parseColor("#F4F0BB"))
                }
            } else {
                binding.skippedTv.visibility = View.GONE
                if (question.selectedVariant == 0) {
                    binding.variant1Tv2.setBackgroundResource(R.drawable.variant_wrong_bcg)
                    binding.variant1Tv2.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.selectedVariant == 1) {
                    binding.variant2Tv2.setBackgroundResource(R.drawable.variant_wrong_bcg)
                    binding.variant2Tv2.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.selectedVariant == 2) {
                    binding.variant3Tv2.setBackgroundResource(R.drawable.variant_wrong_bcg)
                    binding.variant3Tv2.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.selectedVariant == 3) {
                    binding.variant4Tv2.setBackgroundResource(R.drawable.variant_wrong_bcg)
                    binding.variant4Tv2.setTextColor(Color.parseColor("#F4F0BB"))
                }

                if (question.correctVariantIndex == 0) {
                    binding.variant1Tv2.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant1Tv2.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.correctVariantIndex == 1) {
                    binding.variant2Tv2.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant2Tv2.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.correctVariantIndex == 2) {
                    binding.variant3Tv2.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant3Tv2.setTextColor(Color.parseColor("#F4F0BB"))
                } else if (question.correctVariantIndex == 3) {
                    binding.variant4Tv2.setBackgroundResource(R.drawable.variant_correct_bcg)
                    binding.variant4Tv2.setTextColor(Color.parseColor("#F4F0BB"))
                }
            }
        }
    }
}