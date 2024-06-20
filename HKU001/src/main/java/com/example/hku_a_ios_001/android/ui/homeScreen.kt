package com.example.hku_a_ios_001.android.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hku_a_ios_001.android.HKUScreen
import com.example.hku_a_ios_001.android.R
//import com.example.hku_a_ios_001.android.data.DataSource
//import com.example.hku_a_ios_001.android.data.DataSource.pageChoice
//import com.example.hku_a_ios_001.android.data.DataSource.quantityOptions
import com.example.hku_a_ios_001.android.ui.theme.HKUTheme
import androidx.navigation.compose.rememberNavController


@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HKUViewModel,
    onNextButtonClicked: (String) -> Unit,
    modifier: Modifier = Modifier
) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            Row(
            ){
                SelectPageButton(
                    labelResourceId = "有條件釋放",
                    itemImagePath = R.drawable.a_door,
                    onClick = {
                        navController.navigate(HKUScreen.a_a.name)
                        viewModel.setPage(HKUScreen.a_a)

                    }
                )
                SelectPageButton(
                    labelResourceId = "中途宿舍",
                    itemImagePath = R.drawable.b_home,
                    onClick = {
                        navController.navigate(HKUScreen.b_a.name)
                        viewModel.setPage(HKUScreen.b_a)

                    }
                )
            }
            Row(){
                SelectPageButton(
                    labelResourceId = "有條件釋放令",
                    itemImagePath = R.drawable.c_clipboard,
                    onClick = {
                        navController.navigate(HKUScreen.c_a.name)
                        viewModel.setPage(HKUScreen.c_a)

                    }
                )
                SelectPageButton(
                    labelResourceId = "如果有條件釋放令\n" +
                            "不合理？",
                    itemImagePath = R.drawable.d_scales,
                    onClick = {
                        navController.navigate(HKUScreen.d_a.name)
                        viewModel.setPage(HKUScreen.d_a)

                    }
                )
            }
            Row(){
                SelectPageButton(
                    labelResourceId = "復核申請需要\n" +
                            "哪些資料？",
                    itemImagePath = R.drawable.e_documents,
                    onClick = {
                        navController.navigate(HKUScreen.e_a.name)
                        viewModel.setPage(HKUScreen.e_a)

                    }
                )
                SelectPageButton(
                    labelResourceId = "可以向你的醫生\n" +
                            "提出的問題",
                    itemImagePath = R.drawable.f_doc,
                    onClick = {
                        navController.navigate(HKUScreen.f_a.name)
                        viewModel.setPage(HKUScreen.f_a)

                    }
                )
            }
            Row(){
                SelectPageButton(
                    labelResourceId = "有條件釋放令統計",
                    itemImagePath = R.drawable.graph, /// change image
                    onClick = {
                        navController.navigate(HKUScreen.g_a.name)
                        viewModel.setPage(HKUScreen.g_a)

                    }
                )
                SelectPageButton(
                    labelResourceId = "重要聯絡人",
                    itemImagePath = R.drawable.h_contact,
                    onClick = {
                        navController.navigate(HKUScreen.h_a.name)
                        viewModel.setPage(HKUScreen.h_a)

                    }
                )
            }
            HKULogo()
        }
}

@Composable
fun HomeButton(
    nextButton: () -> Unit
){
    Row(
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier.fillMaxSize(),
    ) {
        OutlinedButton(
            border = BorderStroke(4.dp, Color.Black),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .size(width = 60.dp, height = 60.dp)
                .absoluteOffset(x = 250.dp, y = 0.dp),
            enabled = true,
            onClick = nextButton
        ) {
            Icon(
                imageVector = Icons.Filled.Home,
                contentDescription = "Home",
                modifier = Modifier.scale(4f),
                tint= Color.Black

            )
        }

    }
}

@Composable
fun NextButton(
    nextButton: () -> Unit,
){
    Row(

        verticalAlignment = Alignment.Bottom,
        modifier = Modifier.fillMaxSize(),
    ) {
        OutlinedButton(
            border = BorderStroke(4.dp, Color.Black),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .height(60.dp)
                .width(60.dp)
                .absoluteOffset(x = 250.dp, y = 0.dp),
            enabled = true,
            onClick = nextButton
        ) {
            Icon(
                imageVector = Icons.Filled.KeyboardArrowRight,
                contentDescription = "Next",
                modifier = Modifier.scale(4f),
                tint= Color.Black //  need to fix the col
            )
        }

    }
}

@Composable
fun HKULogo (){
    Row(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Start,
    ) {
        Image(
            painter = painterResource(R.drawable.hku_logo),
            contentDescription = "HKU Logo",
            modifier = Modifier
                .scale(3.5f)
                .offset(x = 20.dp, y = 0.dp)
        )
    }
}


@Composable
fun SelectPageButton(
//    @StringRes labelResourceId: String,
    labelResourceId: String,
    itemImagePath: Int,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,

) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = Color.Gray.copy(alpha = 0.6F)),
        shape = RectangleShape,
        modifier = Modifier
            .height(170.dp)
            .width(170.dp)
//            .defaultMinSize(minWidth = 150.dp, minHeight = 150.dp)
            .padding(5.dp)

    ) {
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Image(
                painter = painterResource(itemImagePath),
                contentDescription = null,
                modifier = Modifier.scale(2.5f)
            )
            Text(labelResourceId, color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 14.sp, textAlign = TextAlign.Center, modifier = Modifier.align(alignment = Alignment.CenterHorizontally))
        }
    }
}



@Preview
@Composable
fun HomeScreenPreview() {
    HKUTheme {
//        HomeButton {}
//        NextButton {}
        HomeScreen(
//            pageChoice = DataSource.pageChoice,
            onNextButtonClicked= {},
            navController = rememberNavController(),
            viewModel = HKUViewModel(),
            modifier = Modifier
                .fillMaxSize()
                .padding(dimensionResource(R.dimen.padding_medium))
        )
//        BurgerMenuDropDown(showOrHide = false, modifier = Modifier, onNextButtonClicked ={} )

    }
}