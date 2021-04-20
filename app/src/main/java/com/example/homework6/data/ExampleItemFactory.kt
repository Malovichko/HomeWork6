package com.example.homework6.data

import com.example.homework6.R

class ExampleItemFactory {
        companion object {
            fun getItemTwoList(): ArrayList<TwoItemItem> =
                arrayListOf(
                    TwoItemWater("Холодная вода", 54656553, R.drawable.ic_serial_number, R.drawable.ic_water_cold, "Необходимо подать показания до 25.03.18", "Новые показания"),
                    TwoItemWater("Горячая вода", 54656553, R.drawable.ic_serial_number, R.drawable.ic_water_hot, "Необходимо подать показания до 25.03.18", "Новые показания"),
                    TwoItemPower("Электроэнергия", 54656553, R.drawable.ic_serial_number, R.drawable.ic_electro_copy, "День", "Ночь", "Пик", "Показания сданы 16.02.18 и будут учтены при следующем расчете 25.02.18")
                )
        }
}