package com.example.hku_a_ios_001.android

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource


import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.lifecycle.viewmodel.compose.viewModel

import com.example.hku_a_ios_001.android.ui.HKUViewModel

import com.example.hku_a_ios_001.android.ui.HomeScreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.platform.LocalContext
import com.example.hku_a_ios_001.android.data.DataSource
import com.example.hku_a_ios_001.android.ui.A_aScreen
import com.example.hku_a_ios_001.android.ui.A_bScreen
import com.example.hku_a_ios_001.android.ui.B_aScreen



import com.example.hku_a_ios_001.android.data.DataSource.pageChoice

enum class HKUScreen(){
    Home,
    a_a ,
    a_b,
    b_a,
//    b_a (title = Res.string.b_aTitle),
    b_b,
    b_c,
    b_d,
    c_a,
    c_b,
    d_a,
    d_b,
    e_a,
    e_b,
    f_a,
    f_b,
    f_c,
    g_a,
    h_a,
    h_b
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun    HKUAppBar(
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(stringResource(id = R.string.app_name)) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.back_button)
                    )
                }
            }
        }
    )
}

@Composable
fun HKUApp(
    viewModel: HKUViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    Scaffold (
        topBar = {
            HKUAppBar(
                canNavigateBack = false,
                navigateUp = { /* TODO: implement back navigation */ }
            )
        }
    )
    { innerPadding ->
                val uiState by viewModel.uiState.collectAsState()
                NavHost(
                    navController = navController,
                    startDestination = HKUScreen.Home.name,
                    modifier = Modifier.padding(innerPadding)
                ) {
                    composable(route = HKUScreen.Home.name) {
                        HomeScreen(
                            onNextButtonClicked = {
                            navController.navigate(HKUScreen.Home.name)
                        },
                            pageChoice = pageChoice,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(dimensionResource(R.dimen.padding_medium))
                        )
                    }
                    composable(route = HKUScreen.a_a.name) {
                        A_aScreen(
                            onNextButtonClicked = {
                                navController.navigate(HKUScreen.a_a.name)},

                            modifier = Modifier
                                .fillMaxSize()
                                .padding(dimensionResource(R.dimen.padding_medium))
                        )
                    }
                    composable(route = HKUScreen.a_b.name) {
                        A_bScreen(
                            onNextButtonClicked = {
                                navController.navigate(HKUScreen.a_b.name)},
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(dimensionResource(R.dimen.padding_medium))
                        )

                    }

                    composable(route = HKUScreen.b_a.name) {
                        B_aScreen(
                            onNextButtonClicked = {
                                navController.navigate(HKUScreen.b_a.name)},
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(dimensionResource(R.dimen.padding_medium))
                        )
                    }
                }
            }
}


private fun cancelOrderAndNavigateToStart(
    viewModel: HKUViewModel,
    navController: NavHostController
) {
    viewModel.resetOrder()
    navController.popBackStack(HKUScreen.Home.name, inclusive = false)
}



