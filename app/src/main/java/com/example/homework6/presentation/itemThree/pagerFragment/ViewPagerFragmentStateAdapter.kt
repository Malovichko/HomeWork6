package com.example.homework6.presentation.itemThree.pagerFragment


import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.homework6.R

class ViewPagerFragmentStateAdapter(activity: Fragment) : FragmentStateAdapter(activity) {

    private val images = intArrayOf(
        R.drawable.img_1,
        R.drawable.img_2,
        R.drawable.img_3
    )

    override fun createFragment(position: Int): Fragment = PagerFragment().apply {
        arguments = bundleOf(
            "images" to images[position],
            "position" to position
        )
    }

    override fun getItemCount(): Int = images.size
}