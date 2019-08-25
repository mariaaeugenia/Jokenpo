package com.meteixeira.jokenpo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.meteixeira.jokenpo.R
import com.meteixeira.jokenpo.ui.fragments.PlayerFragment

class GameMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_main)
        showPlayerFragment()
    }

    private fun showPlayerFragment() {
        val ft = supportFragmentManager.beginTransaction()
        if (supportFragmentManager.findFragmentByTag("PlayerFragment") == null) {
            ft.add(R.id.containerGame, PlayerFragment(), "PlayerFragment")
            ft.commit()
        }
    }
}
