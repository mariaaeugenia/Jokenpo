package com.meteixeira.jokenpo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.meteixeira.jokenpo.ui.GameMainActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        newGameButton.setOnClickListener {
            showPlayerFragment()
        }

    }

    private fun showPlayerFragment() {
        val nextScreen = Intent(this, GameMainActivity::class.java)
        startActivity(nextScreen)
    }

}
