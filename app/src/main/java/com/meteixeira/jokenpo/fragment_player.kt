package com.meteixeira.jokenpo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.meteixeira.jokenpo.ui.fragmentplayer.FragmentPlayerFragment

class fragment_player : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_player_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, FragmentPlayerFragment.newInstance())
                .commitNow()
        }
    }

}
