package com.example.homework6.presentation.itemOne

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.homework6.R

class NavigationItemOneFragment : Fragment(R.layout.fragment_menu_bar) {

    private lateinit var searchOnToolbar: ImageView
    private lateinit var toolbar: Toolbar

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews(view)
        initListeners()
    }

    private fun showToast(message: String) {
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(view!!.context, message, duration)
        toast.show()
    }

    private fun initViews(view: View) {
        toolbar = view.findViewById(R.id.toolbar)
    }

    private fun initListeners() {
        toolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.menu_item_one -> {
                    showToast(getString(R.string.toast_menu_item_one))
                    true
                }
                R.id.menu_item_two -> {
                    showToast(getString(R.string.toast_menu_item_two))
                    true
                }
                R.id.menu_item_three -> {
                    showToast(getString(R.string.toast_menu_item_three))
                    true
                }
                R.id.menu_item_search -> {
                    showToast(getString(R.string.toast_menu_search))
                    true
                }
                else -> super.onOptionsItemSelected(it)
            }
        }
    }
}