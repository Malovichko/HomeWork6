package com.example.homework6.presentation.itemThree

import android.R.attr.fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.homework6.R
import com.example.homework6.presentation.FragmentScreenFactory
import com.example.homework6.presentation.itemThree.pagerFragment.ViewPagerFragmentStateAdapter
import kotlinx.android.synthetic.main.fragment_hide_banner.*
import kotlinx.android.synthetic.main.fragment_item_three.*


class NavigationItemThreeFragment : Fragment(R.layout.fragment_item_three) {

    private lateinit var fragmentContainer: FrameLayout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews(view)
        openScreen(FragmentScreenFactory.Screen.NAVIGATION_SHOW_BANNER_SCREEN)
    }


    private fun initViews(view: View) {
        fragmentContainer = view.findViewById(R.id.layout_fragment_container_item_three)
    }


    private fun openScreen(screen: FragmentScreenFactory.Screen) {
        val manager: FragmentManager? = fragmentManager
        manager!!.beginTransaction()
            .replace(
                R.id.layout_fragment_container_item_three,
                FragmentScreenFactory.getScreenInstance(screen)
            )
            .commit()
    }
}