package com.example.layout.ui.slideshow

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProvider.NewInstanceFactory
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.layout.R

class SlideshowFragment : Fragment() {
    private var mViewModel: SlideshowViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = ViewModelProvider(this, NewInstanceFactory()).get(
            SlideshowViewModel::class.java
        )
        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_slideshow, container, false)
    }

    companion object {
        fun newInstance(): SlideshowFragment {
            return SlideshowFragment()
        }
    }
}