package com.example.homework6.presentation.itemTwo.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework6.R
import com.example.homework6.data.TwoItemItem
import com.example.homework6.data.TwoItemPower
import com.example.homework6.data.TwoItemWater

class ExampleAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var itemList = arrayListOf<TwoItemItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        val view = LayoutInflater.from(parent.context)
//            .inflate(R.layout.item_example_on_fragment_two, parent, false)
//        return ExampleWaterViewHolder(view)

        return when (viewType) {
            WATER_ITEM -> {
                val view =
                    LayoutInflater.from(parent.context).inflate(
                        R.layout.water_item_example_fragment_two,
                        parent,
                        false
                    )
                ExampleWaterViewHolder(view)
            }
            POWER_ITEM -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.power_item_example_fragment_two, parent, false)
                ExamplePowerViewHolder(view)
            }
            else -> throw ClassCastException()
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (val currentItem = itemList[position]) {
            is TwoItemWater -> (holder as ExampleWaterViewHolder).bind(currentItem)
            is TwoItemPower -> (holder as ExamplePowerViewHolder).bind(currentItem)
        }
    }

    override fun getItemCount(): Int = itemList.size

    fun setUpStaffList(list: ArrayList<TwoItemItem>) {
        itemList = list
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return when (itemList[position]) {
            is TwoItemWater -> WATER_ITEM
            is TwoItemPower -> POWER_ITEM
        }
    }

    companion object {
        private const val WATER_ITEM = 0
        private const val POWER_ITEM = 1
    }
}