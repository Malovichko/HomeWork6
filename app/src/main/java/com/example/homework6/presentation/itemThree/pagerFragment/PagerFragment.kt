package com.example.homework6.presentation.itemThree.pagerFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.homework6.R
import kotlinx.android.synthetic.main.fragment_view_pager.*

class PagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.let {
            container.setImageResource(it.getInt("images"))
            tvTitle.text = "Картинка ${it.getInt("position") + 1}"
        }
    }
}