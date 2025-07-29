package hk.hku.cdapp.android.android.data

import hk.hku.cdapp.android.android.HKUScreen

/**
 * Data class that represents [currentPage]
 */
data class OrderUiState(
    val currentPage : HKUScreen,
    val openHamburger : Boolean,
    val openDropDown: Boolean
)



// can delete?