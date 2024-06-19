package com.example.hku_a_ios_001.android.data

import com.example.hku_a_ios_001.android.HKUScreen

/**
 * Data class that represents the current UI state in terms of [quantity], [flavor],
 * [dateOptions], selected pickup [date] and [price] -- now including [currentPage]
 */
data class OrderUiState(
    /** Selected cupcake quantity (1, 6, 12) */
    val quantity: Int = 0,
    /** Flavor of the cupcakes in the order (such as "Chocolate", "Vanilla", etc..) */
    val flavor: String = "",
    /** Selected date for pickup (such as "Jan 1") */
    val date: String = "",
    /** Total price for the order */
    val price: String = "",
    /** Available pickup dates for the order*/
    val pickupOptions: List<String> = listOf(),

    /** Selected Page */
//    Todo turn page into into
    val page : Int = 0,

    // make page titles from here?

    val currentPage : HKUScreen
)



// can delete?