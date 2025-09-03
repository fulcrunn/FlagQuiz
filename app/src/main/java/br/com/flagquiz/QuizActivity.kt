package br.com.flagquiz

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class QuizActivity : AppCompatActivity() {

    data class Flag(val drawbleId: Int, val countryName: String)

    private val flags = listOf(
        Flag(R.drawable.flag_catar, "CATAR"),
        Flag(R.drawable.flag_canada, "CANADA"),
        Flag(R.drawable.flag_china, "CHINA"),
        Flag(R.drawable.flag_egito, "EGITO"),
        Flag(R.drawable.flag_belgica, "BELGICA"),
        Flag(R.drawable.flag_brasil, "BRASIL"),
        Flag(R.drawable.flag_india, "INDIA"),
        Flag(R.drawable.flag_colombia, "COLOMBIA"),
        Flag(R.drawable.flag_nepal, "NEPAL"),
        Flag(R.drawable.flag_paraguai, "PARAGUAI"),
    )

    private lateinit var shuffledFlags: List<Flag>
    private var currentIndx = 0
    private var points = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}