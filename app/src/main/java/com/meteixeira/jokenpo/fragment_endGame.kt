package com.meteixeira.jokenpo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.meteixeira.jokenpo.ui.fragmentendgame.FragmentEndGameFragment

class fragment_endGame : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_end_game_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, FragmentEndGameFragment.newInstance())
                .commitNow()
        }
    }

}
