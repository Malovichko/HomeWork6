package com.example.homework6.presentation.itemThree

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.homework6.R
import com.example.homework6.presentation.itemThree.pagerFragment.ViewPagerFragmentStateAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_hide_banner.*

class NavigationHideButton : Fragment(R.layout.fragment_hide_banner) {
    private lateinit var hideBannerFragment: Button
    private lateinit var pagerIndicator: TabLayout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews(view)
        initListener()
    }

    private fun initViews(view: View) {
        hideBannerFragment = view.findViewById(R.id.button_hide_banner)
        pager.adapter = ViewPagerFragmentStateAdapter(this)
        pagerIndicator = view.findViewById(R.id.tabLayoutIndicator)
        TabLayoutMediator(pagerIndicator, pager) { tab, position ->
        }.attach()
    }

    private fun initListener() {
        hideBannerFragment.setOnClickListener {
            closeScreen()
        }
    }

    private fun closeScreen() {
        val manager: FragmentManager? = fragmentManager
        manager!!.beginTransaction()
            .remove(this)
            .commit()
    }
}