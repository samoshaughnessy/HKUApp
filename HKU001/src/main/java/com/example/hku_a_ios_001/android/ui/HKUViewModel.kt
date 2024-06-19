package com.example.hku_a_ios_001.android.ui;

import androidx.lifecycle.ViewModel;
import com.example.hku_a_ios_001.android.HKUScreen
import com.example.hku_a_ios_001.android.data.OrderUiState;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.asStateFlow;
import kotlinx.coroutines.flow.update;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


class HKUViewModel : ViewModel() {

    /**
     * Cupcake state for this order
     */
    private val _uiState = MutableStateFlow(OrderUiState( currentPage = HKUScreen.Home, openHamburger = false))
    val uiState: StateFlow<OrderUiState> = _uiState.asStateFlow()

    fun setPage(page: HKUScreen){
        _uiState.update { currentState ->
            currentState.copy(
                currentPage = page
            )
        }
    }

    fun openHamburger(){
        _uiState.update{ currentState ->
            currentState.copy(
                openHamburger = true,
                currentPage = HKUScreen.Home
            )
        }
    }


    fun closeHamburger(){
        _uiState.update{ currentState ->
            currentState.copy(
                openHamburger = false,
                currentPage = currentState.currentPage
            )
        }
    }


}


