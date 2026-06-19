package uz.mobiler.gita.quizapplaunch

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.mobiler.gita.quizapplaunch.adaper.CategoryAdapter
import uz.mobiler.gita.quizapplaunch.databinding.ActivityMainBinding
import uz.mobiler.gita.quizapplaunch.models.CategoryData
import uz.mobiler.gita.quizapplaunch.repository.CategoryRepository

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var adapter: CategoryAdapter
    private val list = mutableListOf<CategoryData>()
    private lateinit var sharedPreferences: SharedPreferences
    private val categoryRepository = CategoryRepository()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        sharedPreferences = getSharedPreferences("MyData", MODE_PRIVATE)

        if (sharedPreferences.getString("userName", "") == "") {
            BorderlessDialog(object : DialogResultListener {
                override fun onResult(result: String) {
                    binding.tvNameHi.text = "Hello, $result!"
                }
            }).show(supportFragmentManager, "BorderlessDialogTag")
        }

        list.addAll(categoryRepository.getAllCategories())
        adapter = CategoryAdapter(list, { categoryData, position ->
            val intent = Intent(this@MainActivity, QuizActivity::class.java)
            intent.putExtra("pos", position)
            intent.putExtra("category", categoryData.name)
            startActivity(intent)
        })

        binding.rv.adapter = adapter

        binding.pointsTv.text = sharedPreferences.getString("coins", "0")
        binding.tvNameHi.text = "Hello, ${sharedPreferences.getString("userName", "")}!"
    }
}