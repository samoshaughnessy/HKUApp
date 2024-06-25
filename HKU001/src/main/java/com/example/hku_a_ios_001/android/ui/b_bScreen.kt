package com.example.hku_a_ios_001.android.ui

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.hku_a_ios_001.android.HKUScreen
import com.example.hku_a_ios_001.android.ui.theme.HKUTheme
import com.example.hku_a_ios_001.android.ui.theme.md_theme_dark_background

@Composable
fun B_bScreen(
    onNextButtonClicked: () -> Unit = {},
    modifier: Modifier,
    viewModel: HKUViewModel,
    navController: NavController
){
    val requiredContext = LocalContext.current
    Column(
            modifier = Modifier
                .padding(25.dp)
                .background(color = md_theme_dark_background.copy(alpha = 0.4f))
                .shadow(2.dp, shape = RectangleShape)
                .padding(20.dp),
                verticalArrangement = Arrangement.SpaceBetween,
            ) {

            Text(
                "香港中途宿舍位置",
                lineHeight = 50.sp, fontSize =35.sp, fontWeight = FontWeight.Bold,textAlign = TextAlign.Center,   modifier = Modifier.align(alignment = Alignment.CenterHorizontally))


            Text(
                "\n顯徑宿舍\n",
                lineHeight = 30.sp, fontSize =20.sp, fontWeight = FontWeight.Bold,textAlign = TextAlign.Start)

            val bulletPoint1 = listOf("新界沙田顯徑邨顯祐樓B 翼地下及 2 樓", "+852 2695 7805", "+852 2691 2507", "hkh@mhahk.org.hk"
            )
            HalfwayHomeList(listItems = bulletPoint1, context = requiredContext)

        Text(
            "\n艾齡樓\n",
            lineHeight = 30.sp, fontSize =20.sp, fontWeight = FontWeight.Bold,textAlign = TextAlign.Start)

        val bulletPoint2 = listOf("九龍黃大仙黃大仙下邨龍吉樓地下及2樓", "+852 2320 2511", "+852 2327 8596", "ireneh@mhahk.org.hk"
        )
        HalfwayHomeList(listItems = bulletPoint2, context = requiredContext)

        Text(
            "\n李鄭屋宿舍\n",
            lineHeight = 30.sp, fontSize =20.sp, fontWeight = FontWeight.Bold,textAlign = TextAlign.Start)

        val bulletPoint3 = listOf("九龍深水埗李鄭屋邨李孝慈樓 B 翼地下及 2 樓", "+852 2725 9232", "+852 2720 7974", "lcuh@mhahk.org.hk"
        )
        HalfwayHomeList(listItems = bulletPoint3, context = requiredContext)

        Text(
            "\n敦睦軒 (特建中途宿舍)\n",
            lineHeight = 30.sp, fontSize =20.sp, fontWeight = FontWeight.Bold,textAlign = TextAlign.Start)

        val bulletPoint4 = listOf("九龍觀塘功樂道 2 號 5 樓", "+852 2172 6036", "+852 2172 6219", "jcbhwh1@mhahk.org.hk"
        )
        HalfwayHomeList(listItems = bulletPoint4, context = requiredContext)

        Text(
            "\n廣福宿舍\n",
            lineHeight = 30.sp, fontSize =20.sp, fontWeight = FontWeight.Bold,textAlign = TextAlign.Start)

        val bulletPoint5 = listOf("新界大埔廣福邨廣崇樓 B 翼地下及 2 樓", "+852 2651 8948", "+852 2656 9211", "kfh@mhahk.org.hk"
        )
        HalfwayHomeList(listItems = bulletPoint5, context = requiredContext)

        Text(
            "\n欣怡軒 (特建中途宿舍\n",
            lineHeight = 30.sp, fontSize =20.sp, fontWeight = FontWeight.Bold,textAlign = TextAlign.Start)

        val bulletPoint6 = listOf("九龍觀塘功樂道 2 號 6 樓", "+852 2172 7970", "+852 2340 5955", "jcbhwh2@mhahk.org.hk"
        )
        HalfwayHomeList(listItems = bulletPoint6, context = requiredContext)

        BackButton(viewModel = viewModel, navController = navController, destination = HKUScreen.B_a )
            NextButton(nextButton = onNextButtonClicked)
            HKULogo()
        }
}

@Composable
fun HalfwayHomeList(listItems: List<String>, context: Context){

    val ( address, numberOne, numberTwo, email) = listItems
    Row {
        Text( text = "\u2022 \t\t 地址:", fontSize = 20.sp)
        Text( text = address, fontSize = 20.sp)
    }
    Row {
        Text( text = "\u2022 \t\t 電話:", fontSize = 20.sp)
        Text( text = numberOne, fontSize = 20.sp, modifier = Modifier.clickable {
            openDialPad(context = context, phoneNum = numberOne)
        } )
    }
    Row {
        Text( text = "\u2022 \t\t 傳真:", fontSize = 20.sp)
        Text( text = numberTwo, fontSize = 20.sp, modifier = Modifier.clickable {
            openDialPad(context = context, phoneNum = numberTwo)
        } )
    }
    Row {
        Text( text = "\u2022 \t\t 電郵:", fontSize = 20.sp)
        Text( text = email, fontSize = 20.sp, modifier = Modifier.clickable {
            openEmail(context = context, email = "hkh@mhahk.org.hk")
        })

    }



}

@Preview
@Composable
fun B_bScreenPreview() {
    HKUTheme {
        B_bScreen(
            modifier = Modifier.fillMaxHeight(),
            viewModel = HKUViewModel(),
            navController = rememberNavController(),
        )
    }
}