package com.meteixeira.jokenpo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.meteixeira.jokenpo.ui.fragmentgame.FragmentGameFragment

class fragment_game : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_game_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, FragmentGameFragment.newInstance())
                .commitNow()
        }
    }

}
