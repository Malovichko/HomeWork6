package com.example.homework6.presentation.itemTwo.list

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.homework6.R
import com.example.homework6.data.TwoItemPower
import com.example.homework6.data.TwoItemWater

class ExamplePowerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)  {

    private lateinit var textTitlePowerItem: TextView
    private lateinit var textScanNumberPowerItem: TextView
    private lateinit var iconMainPowerItem: ImageView
    private lateinit var iconScanPowerItem: ImageView
    private lateinit var textBottomHint: TextView
    private lateinit var textDay:TextView
    private lateinit var textNight: TextView
    private lateinit var textPeak:TextView

    fun bind(item: TwoItemPower) {
        textTitlePowerItem = itemView.findViewById(R.id.two_item_power_title)
        textScanNumberPowerItem = itemView.findViewById(R.id.power_item_scan_number)
        iconScanPowerItem = itemView.findViewById(R.id.power_item_scan_view)
        iconMainPowerItem = itemView.findViewById(R.id.power_item_main_ic)
        textBottomHint = itemView.findViewById(R.id.text_bottom_hint_power_item)
        textDay = itemView.findViewById(R.id.text_view_day)
        textNight  = itemView.findViewById(R.id.text_view_night)
        textPeak = itemView.findViewById(R.id.text_view_peak)
        iconScanPowerItem.setImageDrawable(ContextCompat.getDrawable(itemView.context, item.scanIcon))
        iconMainPowerItem.setImageDrawable(ContextCompat.getDrawable(itemView.context, item.icon))
        textTitlePowerItem.text =item.title
        textScanNumberPowerItem.text = item.numberScan.toString()
        textBottomHint.text = item.bottomHint
        textDay.text = item.textDay
        textNight.text = item.textNight
        textPeak.text = item.textPeak
    }


}