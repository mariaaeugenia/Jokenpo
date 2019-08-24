package com.meteixeira.jokenpo.ui.fragmentendgame

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.meteixeira.jokenpo.R

class FragmentEndGameFragment : Fragment() {

    companion object {
        fun newInstance() = FragmentEndGameFragment()
    }

    private lateinit var viewModel: FragmentEndGameViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_end_game_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FragmentEndGameViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
