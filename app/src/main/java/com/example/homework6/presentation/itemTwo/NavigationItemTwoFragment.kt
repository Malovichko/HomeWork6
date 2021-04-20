package com.example.homework6.presentation.itemTwo

import android.os.Bundle
import android.transition.TransitionInflater
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.homework6.R
import com.example.homework6.data.ExampleItemFactory
import com.example.homework6.presentation.itemTwo.list.ExampleAdapter

class NavigationItemTwoFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var rootView: View


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        rootView = inflater.inflate(R.layout.fragment_item_two, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews(view)
        initListeners()
    }

    private fun initViews(view: View) {
        val decorator = RecyclerItemDecoration(resources)
        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)
        recyclerView.addItemDecoration(decorator)
        val adapter = ExampleAdapter()
        adapter.setUpStaffList(ExampleItemFactory.getItemTwoList())
        recyclerView.adapter = adapter
    }

    private fun initListeners() {

    }
}