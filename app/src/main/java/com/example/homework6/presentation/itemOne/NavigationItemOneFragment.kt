package com.example.homework6.presentation.itemOne

import android.os.Bundle
import android.os.Message
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.homework6.R

class NavigationItemOneFragment : Fragment(R.layout.fragment_menu_bar) {

    private lateinit var searchOnToolbar: ImageView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews(view)
        initListener()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_toolbar, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_item_one -> {
                setMessage("Нажали на первый элемент")
                true
            }
            R.id.menu_item_two -> {
                setMessage("Нажали на второй элемент")
                true
            }
            R.id.menu_item_three -> {
                setMessage("Нажали на третий элемент")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun setMessage(message: String) {
        val duration = Toast.LENGTH_LONG
        val toast = Toast.makeText(view!!.context, message, duration)
        toast.show()
    }

    private fun initViews(view: View) {
        searchOnToolbar = view.findViewById(R.id.search_on_toolbar)
    }

    private fun initListener() {
        searchOnToolbar.setOnClickListener{
            setMessage("Нажали на лупу")
        }
    }
}