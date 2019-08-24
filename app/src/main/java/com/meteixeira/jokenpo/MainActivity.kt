package com.meteixeira.jokenpo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.meteixeira.jokenpo.ui.fragmentplayer.FragmentPlayerFragment
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
        val ft = supportFragmentManager?.beginTransaction()
        ft?.replace(R.id.fragmentplayer, FragmentPlayerFragment())
        ft?.addToBackStack(null)
        ft?.commit()
    }

}
