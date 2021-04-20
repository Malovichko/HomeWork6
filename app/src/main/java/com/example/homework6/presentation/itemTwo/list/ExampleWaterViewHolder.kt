package com.example.homework6.presentation.itemTwo.list

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.homework6.R
import com.example.homework6.data.TwoItemWater

class ExampleWaterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private lateinit var textTitle: TextView
    private lateinit var textSubtitle: TextView
    private lateinit var iconImageView: ImageView
    private lateinit var iconScanNumber: ImageView
    private lateinit var textBottomHint: TextView
    private lateinit var textNewReadings: TextView

    fun bind(item: TwoItemWater) {
        textTitle = itemView.findViewById(R.id.two_item_water_title)
        textSubtitle = itemView.findViewById(R.id.water_item_scan_number)
        iconScanNumber = itemView.findViewById(R.id.water_item_scan_view)
        iconImageView = itemView.findViewById(R.id.water_item_main_ic)
        textBottomHint = itemView.findViewById(R.id.text_red_alert)
        textNewReadings = itemView.findViewById(R.id.text_new_readings)
        iconScanNumber.setImageDrawable(ContextCompat.getDrawable(itemView.context, item.scanIcon))
        iconImageView.setImageDrawable(ContextCompat.getDrawable(itemView.context, item.icon))
        textTitle.text =item.title
        textSubtitle.text = item.numberScan.toString()
        textBottomHint.text = item.bottomHint
        textNewReadings.text = item.textNewReadings
    }

}