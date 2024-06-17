package com.example.hku_a_ios_001.android

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.core.graphics.red
import com.example.hku_a_ios_001.android.data.DataSource
import com.example.hku_a_ios_001.android.ui.A_aScreen
import com.example.hku_a_ios_001.android.ui.A_bScreen
import com.example.hku_a_ios_001.android.ui.B_aScreen
import com.example.hku_a_ios_001.android.ui.B_bScreen
import com.example.hku_a_ios_001.android.ui.B_cScreen
import com.example.hku_a_ios_001.android.ui.B_dScreen
import com.example.hku_a_ios_001.android.ui.C_aScreen
import com.example.hku_a_ios_001.android.ui.C_bScreen
import com.example.hku_a_ios_001.android.ui.D_aScreen
import com.example.hku_a_ios_001.android.ui.D_bScreen
import com.example.hku_a_ios_001.android.ui.E_aScreen
import com.example.hku_a_ios_001.android.ui.E_bScreen
import com.example.hku_a_ios_001.android.ui.F_aScreen
import com.example.hku_a_ios_001.android.ui.F_bScreen
import com.example.hku_a_ios_001.android.ui.G_aScreen
import com.example.hku_a_ios_001.android.ui.H_aScreen

import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.style.TextAlign


import com.example.hku_a_ios_001.android.data.DataSource.pageChoice
import com.example.hku_a_ios_001.android.ui.HKULogo
import com.example.hku_a_ios_001.android.ui.theme.md_theme_dark_background

enum class HKUScreen(){
    Home,
    a_a,
    a_b,
    b_a,
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
    g_a,
    h_a,
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun    HKUAppBar(
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    // edit to allow drop down menu
    CenterAlignedTopAppBar(
        title = { Text(stringResource(id = R.string.app_name), textAlign = TextAlign.Center) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = md_theme_dark_background.copy(alpha = 0.4f)
        ),
        modifier = modifier,
        navigationIcon = {
            Icon(
                imageVector = Icons.Filled.Menu,
                contentDescription = "menu",
                Modifier.clickable {  }
            )
        }
    )

}

// See if we can extract the image into this part of the application
@Composable
fun HKUApp(
    viewModel: HKUViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
        Scaffold(
//            modifier = Modifier.background(Color.Transparent), // fix image
//            modifier = Modifier.verticalScroll(rememberScrollState()),
            topBar = {
                HKUAppBar(
                    canNavigateBack = false,
                    navigateUp = { /* TODO: implement back navigation */ }
                )
            }
        )
        { innerPadding ->
            val uiState by viewModel.uiState.collectAsState()
            // fix the button clicks so that we can get to actual pages
            Box(modifier = Modifier
                .background(color = Color.Black)
                .fillMaxSize()
                .paint(
                    painterResource(id = com.example.hku_a_ios_001.android.R.drawable.jackimage),
                    contentScale = ContentScale.FillHeight
                ).verticalScroll(rememberScrollState()
                )
            )
                {
            NavHost(
                navController = navController,
                startDestination = HKUScreen.Home.name,
                modifier = Modifier
                    .padding(innerPadding)

            ) {
                composable(route = HKUScreen.Home.name) {
                    HomeScreen(
                        navController = navController,
                        // this on nextButtonClicked needs to be altered here as previously we are always passing one destination, in this case, we could go anywhere..
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
                            navController.navigate(HKUScreen.a_b.name)
                        },

                        modifier = Modifier
                            .fillMaxSize()
                            .padding(dimensionResource(R.dimen.padding_medium))
                    )
                }
                composable(route = HKUScreen.a_b.name) {
                    A_bScreen(
                        onNextButtonClicked = {
                            navController.navigate(HKUScreen.Home.name)
                        },
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(dimensionResource(R.dimen.padding_medium))
                    )

                }

                composable(route = HKUScreen.b_a.name) {
                    B_aScreen(
                        onNextButtonClicked = {
                            navController.navigate(HKUScreen.b_b.name)
                        },
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(dimensionResource(R.dimen.padding_medium))
                    )
                }
                composable(route = HKUScreen.b_b.name) {
                    B_bScreen(
                        onNextButtonClicked = {
                            navController.navigate(HKUScreen.b_c.name)
                        },
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(dimensionResource(R.dimen.padding_medium))

                    )
                }

                composable(route = HKUScreen.b_c.name) {
                    B_cScreen(
                        onNextButtonClicked = {
                            navController.navigate(HKUScreen.b_d.name)
                        },
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(dimensionResource(R.dimen.padding_medium))

                    )
                }

                composable(route = HKUScreen.b_d.name) {
                    B_dScreen(
                        onNextButtonClicked = {
                            navController.navigate(HKUScreen.Home.name)
                        },
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(dimensionResource(R.dimen.padding_medium))

                    )
                }

                composable(route = HKUScreen.c_a.name) {
                    C_aScreen(
                        onNextButtonClicked = {
                            navController.navigate(HKUScreen.c_b.name)
                        },
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(dimensionResource(R.dimen.padding_medium))

                    )
                }

                composable(route = HKUScreen.c_b.name) {
                    C_bScreen(
                        onNextButtonClicked = {
                            navController.navigate(HKUScreen.Home.name)
                        },
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(dimensionResource(R.dimen.padding_medium))

                    )
                }

                composable(route = HKUScreen.d_a.name) {
                    D_aScreen(
                        onNextButtonClicked = {
                            navController.navigate(HKUScreen.d_b.name)
                        },
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(dimensionResource(R.dimen.padding_medium))

                    )
                }

                composable(route = HKUScreen.d_b.name) {
                    D_bScreen(
                        onNextButtonClicked = {
                            navController.navigate(HKUScreen.Home.name)
                        },
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(dimensionResource(R.dimen.padding_medium))

                    )
                }

                composable(route = HKUScreen.e_a.name) {
                    E_aScreen(
                        onNextButtonClicked = {
                            navController.navigate(HKUScreen.e_b.name)
                        },
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(dimensionResource(R.dimen.padding_medium))

                    )
                }

                composable(route = HKUScreen.e_b.name) {
                    E_bScreen(
                        onNextButtonClicked = {
                            navController.navigate(HKUScreen.Home.name)
                        },
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(dimensionResource(R.dimen.padding_medium))

                    )
                }

                composable(route = HKUScreen.f_a.name) {
                    F_aScreen(
                        onNextButtonClicked = {
                            navController.navigate(HKUScreen.f_b.name)
                        },
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(dimensionResource(R.dimen.padding_medium))

                    )
                }

                composable(route = HKUScreen.f_b.name) {
                    F_bScreen(
                        onNextButtonClicked = {
                            navController.navigate(HKUScreen.Home.name)
                        },
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(dimensionResource(R.dimen.padding_medium))

                    )
                }

                composable(route = HKUScreen.g_a.name) {
                    G_aScreen(
                        onNextButtonClicked = {
                            navController.navigate(HKUScreen.Home.name)
                        },
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(dimensionResource(R.dimen.padding_medium))

                    )
                }

                composable(route = HKUScreen.h_a.name) {
                    H_aScreen(
                        onNextButtonClicked = {
                            navController.navigate(HKUScreen.Home.name)
                        },
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(dimensionResource(R.dimen.padding_medium))

                    )
                }
            }
        }
        }

}

// can remove before launch
//private fun cancelOrderAndNavigateToStart(
//    viewModel: HKUViewModel,
//    navController: NavHostController
//) {
//    viewModel.resetOrder()
//    navController.popBackStack(HKUScreen.Home.name, inclusive = false)
//}
//


