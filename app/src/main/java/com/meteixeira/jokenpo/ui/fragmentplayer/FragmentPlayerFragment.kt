package com.meteixeira.jokenpo.ui.fragmentplayer

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.meteixeira.jokenpo.R

class FragmentPlayerFragment : Fragment() {

    companion object {
        fun newInstance() = FragmentPlayerFragment()
    }

    private lateinit var viewModel: FragmentPlayerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_player_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FragmentPlayerViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
