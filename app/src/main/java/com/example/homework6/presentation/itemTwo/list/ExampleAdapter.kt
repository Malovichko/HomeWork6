package com.example.homework6.presentation.itemTwo.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework6.R
import com.example.homework6.data.Meter
import com.example.homework6.data.PowerMeter
import com.example.homework6.data.WaterMeter

class ExampleAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var itemList = arrayListOf<Meter>()

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
            is WaterMeter -> (holder as ExampleWaterViewHolder).bind(currentItem)
            is PowerMeter -> (holder as ExamplePowerViewHolder).bind(currentItem)
        }
    }

    override fun getItemCount(): Int = itemList.size

    fun setUpStaffList(list: ArrayList<Meter>) {
        itemList = list
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return when (itemList[position]) {
            is WaterMeter -> WATER_ITEM
            is PowerMeter -> POWER_ITEM
        }
    }

    companion object {
        private const val WATER_ITEM = 0
        private const val POWER_ITEM = 1
    }
}