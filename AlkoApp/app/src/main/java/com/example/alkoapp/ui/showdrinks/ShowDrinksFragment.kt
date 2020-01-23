package com.example.alkoapp.ui.showdrinks

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.alkoapp.R

class ShowDrinksFragment : Fragment() {

    companion object {
        fun newInstance() = ShowDrinksFragment()
    }

    private lateinit var viewModel: ShowDrinksViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.show_drinks_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ShowDrinksViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
