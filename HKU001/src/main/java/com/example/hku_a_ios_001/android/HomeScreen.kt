package com.example.hku_a_ios_001.android


import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.core.graphics.red
//import com.example.hku_a_ios_001.android.data.DataSource
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.min
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex


//import com.example.hku_a_ios_001.android.data.DataSource.pageChoice
import com.example.hku_a_ios_001.android.ui.HKULogo
import com.example.hku_a_ios_001.android.ui.theme.md_theme_dark_background
import com.example.hku_a_ios_001.android.data.OrderUiState
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


//var currentPage = HKUScreen.Home // replace with data from OrderUIState



enum class HKUScreen(val string:String){ // can add size with int value to alter size of titles if required
    Home("有條件釋放咨詢庫"),
    a_a("什麼是有條件釋放？ ▼"),
    a_b("什麼是“條件”？ ▼"),
    b_a("什麼是中途宿舍? ▼"),
    b_b("進入中途宿舍需要哪些條件？ ▼"),
    b_c("中途宿舍額外限制 ▼"),
    b_d("如何申請？ ▼"),
    c_a("有條件釋放令 ▼"),
    c_b("您的有條件釋放令將會持續多久？ ▼"),
    d_a("如果有條件釋放令不合理？ ▼"),
    d_b("精神健康覆核審裁（MHRT) ▼"),
    e_a("提出覆核申請需要提交哪些資料？ ▼"),
    e_b("申請書需要包括哪些內容？ ▼"),
    f_a("可以向精神科醫生提出的問題 ▼"),
    f_b("醫生沒有正當理由卻拒絕調整相關限制... ▼"),
    g_a("有條件釋放者是否了解他們的情況"),
    h_a("重要聯絡人"),
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun    HKUAppBar(
    currentScreen : OrderUiState,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: HKUViewModel,
    toggleDropDown: ()->Unit={}
) {



    // edit to allow drop down menu
    CenterAlignedTopAppBar(
        title = {
            Text(
                currentScreen.currentPage.string, fontSize = 20.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold, modifier = if ((currentScreen.currentPage !== HKUScreen.Home)){Modifier.clickable { toggleDropDown() }} else {Modifier}
            )
                },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = md_theme_dark_background.copy(alpha = 0.4f)
        ),
        modifier = modifier,
        navigationIcon = {
            Icon(
                imageVector = Icons.Filled.Menu,
                contentDescription = "menu",
                modifier = Modifier.clickable(enabled = true){
                    if(!currentScreen.openHamburger){
                        viewModel.openHamburger()
                    } else {
                        viewModel.closeHamburger()
                    }
                }
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
    val uiState by viewModel.uiState.collectAsState()
    Scaffold(
            topBar = {
                HKUAppBar(
                    currentScreen = uiState,
                    canNavigateBack = false,
                    viewModel = viewModel,
                    navigateUp = { /* TODO: implement back navigation */ },
                    toggleDropDown = {viewModel.toggleDropDown()}
                )
            }
        )
        { innerPadding ->
            // fix the button clicks so that we can get to actual pages
            Box(
                modifier = Modifier
                .background(color = Color.Black)
                .fillMaxSize()
                .paint(
                    painterResource(id = com.example.hku_a_ios_001.android.R.drawable.jackimage),
                    contentScale = ContentScale.FillHeight
                )
                .verticalScroll(
                    rememberScrollState()
                )
            )
            {

                if (uiState.openHamburger) {
                    BurgerMenuDropDown(
                        viewModel=viewModel,
                        showOrHide = uiState.openHamburger,
                        modifier = Modifier.zIndex(1f),
                        navController = navController
                    )
                } else {
                    if(uiState.openDropDown){
                        ArrowDropDownMenu(
                            currentScreen = uiState,
                            viewModel = viewModel,
                        navController = navController,
                        showOrHide = uiState.openDropDown,
                        modifier = Modifier
                    )
                    }
                    NavHost(
                        navController = navController,
                        startDestination = HKUScreen.Home.name,
                        modifier = Modifier
                            .padding(innerPadding)

                    ) {
                        composable(route = HKUScreen.Home.name) {
                            HomeScreen(
                                viewModel = viewModel,
                                navController = navController,
                                // this on nextButtonClicked needs to be altered here as previously we are always passing one destination, in this case, we could go anywhere..
                                onNextButtonClicked = {
                                    navController.navigate(HKUScreen.Home.name)
                                    viewModel.setPage(HKUScreen.Home)

                                },
//                        pageChoice = pageChoice,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(dimensionResource(R.dimen.padding_medium))
                            )
                        }
                        composable(route = HKUScreen.a_a.name) {
                            A_aScreen(
                                onNextButtonClicked = {
                                    navController.navigate(HKUScreen.a_b.name)
                                    viewModel.setPage(HKUScreen.a_b)

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
//                            currentPage = HKUScreen.Home
                                    viewModel.setPage(HKUScreen.Home)

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
//                            currentPage = HKUScreen.b_b
                                    viewModel.setPage(HKUScreen.b_b)

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
//                            currentPage = HKUScreen.b_c
                                    viewModel.setPage(HKUScreen.b_c)

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
//                            currentPage = HKUScreen.b_d
                                    viewModel.setPage(HKUScreen.b_d)

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
//                            currentPage = HKUScreen.Home
                                    viewModel.setPage(HKUScreen.Home)

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
//                            currentPage = HKUScreen.c_b
                                    viewModel.setPage(HKUScreen.c_b)

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
//                            currentPage = HKUScreen.Home
                                    viewModel.setPage(HKUScreen.Home)

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
//                            currentPage = HKUScreen.d_b
                                    viewModel.setPage(HKUScreen.d_b)

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
//                            currentPage = HKUScreen.Home
                                    viewModel.setPage(HKUScreen.Home)

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
//                            currentPage = HKUScreen.e_b
                                    viewModel.setPage(HKUScreen.e_b)

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
//                            currentPage = HKUScreen.Home
                                    viewModel.setPage(HKUScreen.Home)

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
//                            currentPage = HKUScreen.f_b
                                    viewModel.setPage(HKUScreen.f_b)

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
//                            currentPage = HKUScreen.Home
                                    viewModel.setPage(HKUScreen.Home)

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
//                            currentPage = HKUScreen.Home
                                    viewModel.setPage(HKUScreen.Home)

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
//                            currentPage = HKUScreen.Home
                                    viewModel.setPage(HKUScreen.Home)

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

}

@Composable
fun SelectDropItem(
    viewModel: HKUViewModel,
    labelResourceId: String,
    itemImagePath: Int,
    buttonClick: () -> Unit = {},
    modifier: Modifier = Modifier,
){
    Box(
        modifier = Modifier
            .defaultMinSize(minWidth = 300.dp, minHeight = 10.dp)
            .border(1.dp, color = Color.Black)
            .clickable { buttonClick() }
        ) {
        Row (
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
        ){
            Image(
                painter = painterResource(itemImagePath),
                contentDescription = null,
                modifier = Modifier.scale(1f)
            )
            Text(labelResourceId, color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 14.sp, textAlign = TextAlign.Center)
        }
    }

}

val abList = listOf(Pair("什麼是有條件釋放？", HKUScreen.a_a.name), Pair("什麼是“條件”？", HKUScreen.a_b.name))
val bdList  = listOf(
        Pair("什麼是中途宿舍?", HKUScreen.b_a.name), Pair("進入中途宿舍需要\n哪些條件？", HKUScreen.b_b.name),
        Pair("中途宿舍額外限制", HKUScreen.b_c.name), Pair("如何申請？", HKUScreen.b_d.name)
)
val cbList = listOf(Pair("有條件釋放令", HKUScreen.c_a.name), Pair("您的有條件釋放令將\n會持續多久", HKUScreen.c_b.name))
val dbList = listOf(Pair("如果有條件釋放令不合理",HKUScreen.d_a.name), Pair("精神健康覆核審裁（MHRT)",HKUScreen.d_b.name))
val ebList = listOf(Pair("提出覆核申請需要\n提交哪些資料？", HKUScreen.e_a.name), Pair("申請書需要包括哪\n些內容？", HKUScreen.e_b.name))
val fbList = listOf(Pair("可以向精神科醫\n生提出的問題", HKUScreen.f_a.name), Pair("醫生沒有正當理由卻拒\n絕調整相關限制...",HKUScreen.f_b.name))



@Composable
fun InnerMenu (    
    list: List<Pair<String, String>>,
    viewModel: HKUViewModel,
    navController: NavHostController,
){
    list.forEach(){it ->
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .border(1.dp, color = Color.Black)
                .padding(20.dp)
                .clickable {
                    viewModel.toggleDropDown()
                    navController.navigate(it.second)
                }
        ){
            Text(it.first, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
        }
    }
    
}

@Composable
fun ArrowDropDownMenu (
    viewModel: HKUViewModel,
    navController: NavHostController,
    showOrHide: Boolean,
    modifier: Modifier,
    currentScreen: OrderUiState
) {
    Box(
        modifier =  if( (currentScreen.currentPage == HKUScreen.g_a) || (currentScreen.currentPage == HKUScreen.h_a)){
            Modifier
        } else {
            Modifier.padding(15.dp)
                .fillMaxSize()
                .offset(x = 0.dp, y = 85.dp)
                .background(color = md_theme_dark_background)
                .shadow(2.dp, shape = RectangleShape)
                .zIndex(1f)
                .defaultMinSize(minWidth = 200.dp, minHeight = 150.dp)
        }
        ,
    ) {
        Column(modifier = Modifier
            .padding(15.dp)
            .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            ) {
            if((currentScreen.currentPage == HKUScreen.a_a) || (currentScreen.currentPage == HKUScreen.a_b )){
                Column  (
                    Modifier.fillMaxSize()
                ){
                    InnerMenu(list = abList, viewModel= viewModel, navController= navController)
                }
            } else if ((currentScreen.currentPage == HKUScreen.b_a) || (currentScreen.currentPage == HKUScreen.b_b) || (currentScreen.currentPage == HKUScreen.b_c) || (currentScreen.currentPage == HKUScreen.b_d)){
                Column  (
                    Modifier.fillMaxSize()
                ){
                    InnerMenu(list = bdList, viewModel= viewModel, navController= navController)
                }
            } else if ((currentScreen.currentPage == HKUScreen.c_a) || (currentScreen.currentPage == HKUScreen.c_b)){
                Column  (
                    Modifier.fillMaxSize()
                ){
                    InnerMenu(list = cbList, viewModel= viewModel, navController= navController)
                }
            }else if ((currentScreen.currentPage == HKUScreen.d_a) || (currentScreen.currentPage == HKUScreen.d_b)){
                Column  (
                    Modifier.fillMaxSize()
                ){
                    InnerMenu(list = dbList, viewModel= viewModel, navController= navController)
                }
            }else if ((currentScreen.currentPage == HKUScreen.e_a) || (currentScreen.currentPage == HKUScreen.e_b)){
                Column  (
                    Modifier.fillMaxSize()
                ){
                    InnerMenu(list = ebList, viewModel= viewModel, navController= navController)
                }
            }else if ((currentScreen.currentPage == HKUScreen.f_a) || (currentScreen.currentPage == HKUScreen.f_b)){
                Column  (
                    Modifier.fillMaxSize()
                ){
                    InnerMenu(list = fbList, viewModel= viewModel, navController= navController)
                }
            }
//            else if (currentScreen.currentPage == HKUScreen.g_a) {
//                Column(
//                    Modifier.fillMaxSize()
//                ) {
//                    InnerMenu(list = gaList)
//                }
//            }else if (currentScreen.currentPage == HKUScreen.h_a) {
//                Column(
//                    Modifier.fillMaxSize()
//                ) {
//                    InnerMenu(list = haList)
//                }
//            }

//            items.forEach{ it ->
//                val (label, destination, screen) = it;
//                Text(label, color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 14.sp, textAlign = TextAlign.Center, modifier = Modifier.clickable {
//                    viewModel.setPage(destination)
//                    navController.navigate(screen)
//                    viewModel.toggleDropDown()
//
//                })
//
//            }

        }
    }
}



@Composable
fun BurgerMenuDropDown (
    viewModel: HKUViewModel,
    navController: NavHostController,
    showOrHide : Boolean,
    modifier: Modifier,
){
    if (showOrHide) {
        Box(
            modifier = Modifier.offset(x=0.dp, y=100.dp).fillMaxSize(),
        ) {
            Column(

                modifier = Modifier
                .padding(45.dp)
                .background(color = md_theme_dark_background.copy(alpha = 0.4f))
                .shadow(2.dp, shape = RectangleShape),

            ) {

                SelectDropItem( labelResourceId = "有條件釋放",
                    itemImagePath = R.drawable.a_door, viewModel = viewModel,
                    buttonClick = {
                        navController.navigate(HKUScreen.a_a.name)
                        viewModel.setPage(HKUScreen.a_a)
                        viewModel.closeHamburger()
                    }
                )

                SelectDropItem(
                    labelResourceId = "中途宿舍",
                    itemImagePath = R.drawable.b_home, viewModel = viewModel,
                    buttonClick = {
                        navController.navigate(HKUScreen.b_a.name)
                        viewModel.setPage(HKUScreen.b_a)
                        viewModel.closeHamburger()
                    }
                )

                SelectDropItem(
                    labelResourceId = "有條件釋放令",
                    itemImagePath = R.drawable.c_clipboard, viewModel = viewModel,
                    buttonClick = {  navController.navigate(HKUScreen.c_a.name)
                        viewModel.setPage(HKUScreen.c_a)
                        viewModel.closeHamburger()
                    }
                )
                SelectDropItem(
                    labelResourceId = "如果有條件釋放令不合理？",
                    itemImagePath = R.drawable.d_scales, viewModel = viewModel,
                    buttonClick = {
                        navController.navigate(HKUScreen.d_a.name)
                        viewModel.setPage(HKUScreen.d_a)
                        viewModel.closeHamburger()
                    }
                )
                SelectDropItem(
                    labelResourceId = "復核申請需要哪些資料？",
                    itemImagePath = R.drawable.e_documents, viewModel = viewModel,
                    buttonClick = {
                        navController.navigate(HKUScreen.e_a.name)
                        viewModel.setPage(HKUScreen.e_a)
                        viewModel.closeHamburger()
                    }
                )
                SelectDropItem(
                    labelResourceId = "可以向你的醫生提出的問題",
                    itemImagePath = R.drawable.f_doc, viewModel = viewModel,
                    buttonClick = {
                        navController.navigate(HKUScreen.f_a.name)
                        viewModel.setPage(HKUScreen.f_a)
                        viewModel.closeHamburger()
                    }
                )
                SelectDropItem(
                    labelResourceId = "有條件釋放令統計",
                    itemImagePath = R.drawable.f_doc,viewModel = viewModel, // fix image
                    buttonClick = {
                        navController.navigate(HKUScreen.g_a.name)
                        viewModel.setPage(HKUScreen.g_a)
                        viewModel.closeHamburger()
                    }
                )
                SelectDropItem(
                    labelResourceId = "重要聯絡人",
                    itemImagePath = R.drawable.h_contact,viewModel = viewModel,
                    buttonClick = {
                        navController.navigate(HKUScreen.h_a.name)
                        viewModel.setPage(HKUScreen.h_a)
                        viewModel.closeHamburger()
                    }
                )
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


