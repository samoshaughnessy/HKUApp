package com.example.hku_a_ios_001.android.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.hku_a_ios_001.android.HKUScreen
import com.example.hku_a_ios_001.android.ui.theme.HKUTheme
import com.example.hku_a_ios_001.android.ui.theme.md_theme_dark_background
@Composable
fun A_bScreen(
    onNextButtonClicked: () -> Unit = {},
    modifier: Modifier,
    viewModel: HKUViewModel,
    navController: NavController
){
    val context = LocalContext.current

    val displayMetrics = context.resources.displayMetrics

    //Width And Height Of Screen
    val width = displayMetrics.widthPixels
    val height = displayMetrics.heightPixels

    //Device Density
    val density = displayMetrics.density
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(25.dp)
            .background(color = md_theme_dark_background.copy(alpha = 0.4f))
            .shadow(2.dp, shape = RectangleShape)
            .padding(20.dp)


    ) {
        Text(
            "病人在有條件下獲釋放出院的命令摹本\n",
            lineHeight = 50.sp, fontSize = 35.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,   modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        )
        
        Image(painter = painterResource(com.example.hku_a_ios_001.android.R.drawable.order_for_conditional_discharge), contentDescription = "Order form sample",Modifier.fillMaxSize() )

        BackButton(destination = HKUScreen.A_a, viewModel = viewModel, navController = navController)
        NextButton(nextButton = onNextButtonClicked)
        HKULogo()
        }

}




@Preview
@Composable
fun A_bScreenPreview() {
    HKUTheme {
        A_bScreen(
            viewModel = HKUViewModel(),
            navController = rememberNavController(),
            modifier = Modifier.fillMaxHeight()
        )
    }
}