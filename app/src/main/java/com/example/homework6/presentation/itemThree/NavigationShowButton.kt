package com.example.homework6.presentation.itemThree

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.homework6.R
import com.example.homework6.presentation.FragmentScreenFactory
import com.example.homework6.presentation.itemThree.pagerFragment.ViewPagerFragmentStateAdapter
import kotlinx.android.synthetic.main.fragment_hide_banner.*


class NavigationShowButton : Fragment(R.layout.fragment_show_banner) {
    private lateinit var showBannerFragment: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews(view)
        initListener()
    }

    private fun initViews(view: View) {
        showBannerFragment = view.findViewById(R.id.button_show_banner)
    }

    private fun initListener() {
        showBannerFragment.setOnClickListener {
            openScreen(FragmentScreenFactory.Screen.NAVIGATION_HIDE_BANNER_SCREEN)
        }
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