package com.example.homework6.presentation

import androidx.fragment.app.Fragment
import com.example.homework6.presentation.itemOne.NavigationItemOneFragment
import com.example.homework6.presentation.itemThree.NavigationHideButton
import com.example.homework6.presentation.itemThree.NavigationItemThreeFragment
import com.example.homework6.presentation.itemThree.NavigationShowButton
import com.example.homework6.presentation.itemTwo.NavigationItemTwoFragment

class FragmentScreenFactory {
    companion object {

        fun getScreenInstance(screen: Screen): Fragment = when (screen) {
            Screen.NAVIGATION_ITEM_ONE_SCREEN -> NavigationItemOneFragment()
            Screen.NAVIGATION_ITEM_TWO_SCREEN -> NavigationItemTwoFragment()
            Screen.NAVIGATION_ITEM_THREE_SCREEN -> NavigationItemThreeFragment()
            Screen.NAVIGATION_SHOW_BANNER_SCREEN -> NavigationShowButton()
            Screen.NAVIGATION_HIDE_BANNER_SCREEN -> NavigationHideButton()

        }
    }

    enum class Screen {
        NAVIGATION_ITEM_ONE_SCREEN,
        NAVIGATION_ITEM_TWO_SCREEN,
        NAVIGATION_ITEM_THREE_SCREEN,
        NAVIGATION_SHOW_BANNER_SCREEN,
        NAVIGATION_HIDE_BANNER_SCREEN
    }
}