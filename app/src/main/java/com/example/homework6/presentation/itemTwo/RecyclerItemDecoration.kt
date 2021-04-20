package com.example.homework6.presentation.itemTwo

import android.content.Context
import android.content.res.Resources
import android.graphics.Rect
import android.util.TypedValue
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class RecyclerItemDecoration(private val resources: Resources) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State

    ) {
        outRect.top = toDp(7f)
        outRect.right = toDp(8f)
        outRect.left = toDp(8f)
    }
    private fun toDp(dp: Float):Int = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp.toFloat(), resources.displayMetrics ).toInt()


}