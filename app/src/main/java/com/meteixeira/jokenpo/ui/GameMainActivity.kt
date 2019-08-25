package com.meteixeira.jokenpo.ui

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.meteixeira.jokenpo.R
import com.meteixeira.jokenpo.ui.fragments.GameFragment
import com.meteixeira.jokenpo.ui.fragments.PlayerFragment

class GameMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_main)
        showPlayerFragment()
        registerBroadcastReceiver()
    }

    private fun showPlayerFragment() {
        val ft = supportFragmentManager.beginTransaction()
        if (supportFragmentManager.findFragmentByTag("PlayerFragment") == null) {
            ft.add(R.id.containerGame, PlayerFragment(), "PlayerFragment")
            ft.commit()
        }
    }

    private fun registerBroadcastReceiver() {
        val intentGame = IntentFilter("GAME_EVENT")
        intentGame.addAction("GAME_EVENT")
        LocalBroadcastManager.getInstance(this).registerReceiver(mMessageReceiver, intentGame)
    }

    public override fun onDestroy() {
        super.onDestroy()
        LocalBroadcastManager.getInstance(this).unregisterReceiver(mMessageReceiver)
    }

    private val mMessageReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            if (intent.hasExtra("player_name")) {
                //gameViewModel.eventName = intent.getStringExtra("player_name")
                showGameFragment()

            }
        }
    }

    private fun showGameFragment() {
        nextFragment(GameFragment())
    }

    private fun nextFragment(fragment: Fragment) {
        val ft = supportFragmentManager?.beginTransaction()
        ft?.replace(R.id.containerGame, fragment)
        ft?.addToBackStack(null)
        ft?.commit()
    }
}
