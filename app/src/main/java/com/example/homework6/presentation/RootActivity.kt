package com.example.homework6.presentation

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.homework6.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class RootActivity : AppCompatActivity() {

    private lateinit var fragmentContainer: FrameLayout
    private lateinit var bottomBar: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.root_activity)

        initViews()
        initListener()
        openScreen(FragmentScreenFactory.Screen.NAVIGATION_ITEM_ONE_SCREEN)

    }

    private fun initViews(){
        fragmentContainer = findViewById(R.id.layout_fragment_container)
        bottomBar = findViewById(R.id.bottom_navigation)
    }

    private fun initListener() {
        bottomBar.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.item_one -> openScreen(FragmentScreenFactory.Screen.NAVIGATION_ITEM_ONE_SCREEN)
                R.id.item_two -> openScreen(FragmentScreenFactory.Screen.NAVIGATION_ITEM_TWO_SCREEN)
                R.id.item_three -> openScreen(FragmentScreenFactory.Screen.NAVIGATION_ITEM_THREE_SCREEN)
                else -> return@setOnNavigationItemSelectedListener false
            }
            true
        }
    }

    private fun openScreen(screen: FragmentScreenFactory.Screen) {
        supportFragmentManager.beginTransaction()
            .replace(
                R.id.layout_fragment_container,
                FragmentScreenFactory.getScreenInstance(screen)
            )
            .commit()
    }
}