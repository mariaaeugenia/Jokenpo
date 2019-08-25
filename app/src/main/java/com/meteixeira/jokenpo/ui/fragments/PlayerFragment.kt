package com.meteixeira.jokenpo.ui.fragments

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.localbroadcastmanager.content.LocalBroadcastManager

import com.meteixeira.jokenpo.R
import kotlinx.android.synthetic.main.fragment_player.*


class PlayerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_player, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        startGameButton.setOnClickListener {
            nextScreen()
        }
    }

    private fun nextScreen() {
        sendEventName()
        val ft = activity?.supportFragmentManager?.beginTransaction()
        ft?.replace(R.id.containerGame, GameFragment())
        ft?.addToBackStack(null)
        ft?.commit()

    }

    private fun sendEventName() {
        val intent = Intent("GAME_EVENT")
        intent.putExtra("player_name", playerEditText.text.toString())
        LocalBroadcastManager.getInstance(requireContext()).sendBroadcast(intent)
    }

}
