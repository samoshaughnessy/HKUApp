package com.example.hku_a_ios_001.android.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hku_a_ios_001.android.ui.theme.HKUTheme
import com.example.hku_a_ios_001.android.ui.theme.md_theme_dark_background

@Composable
fun B_dScreen(
    onNextButtonClicked: () -> Unit = {},
    modifier: Modifier
){
        Column(
            modifier = Modifier
                .padding(25.dp)
                .background(color = md_theme_dark_background.copy(alpha = 0.4f))
                .shadow(2.dp, shape = RectangleShape)
                .padding(20.dp),
                verticalArrangement = Arrangement.SpaceBetween,
//              horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            Text(
                "如何申請？",
                lineHeight = 50.sp, fontSize = 35.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,   modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )
            Text(
                "• 申請需由精神科醫生及社工提出，經社會福利署 \n"  +"「康復服務中央轉介系統」轉介香港心理衛生會。 \n \n" +
                "• 接獲申請後，香港心理衛生會安排您進行評估及安排入宿適應群體生活。 \n \n" +
                "• 若您在適應期內能接受及配合宿舍群體生活，便獲接納正式入住。 \n", fontSize = 20.sp)

            Text(
                "如何退出中途宿舍服務？\n", fontWeight = FontWeight.Bold, fontSize = 20.sp
            )


            Text(
                "• 若您未能接受及配合宿舍群體生活，可提出退\n" +
                        "出服務。 \n\n" +
                "• 若宿舍服務未能配合您需要，宿舍會與您協議終止服務；並會通知及建議主診醫生及醫務社工作出跟進安排。 \n\n"
            +
                "• 若您已完成其復元計劃，精神狀況穩定及具有足 \n"
            +
                "夠生活技能，則可協議訂定遷出計劃，遷離宿舍開\n" +
                        "展獨立生活", fontSize = 20.sp
            )
            HomeButton(nextButton = onNextButtonClicked)
            HKULogo()
        }
}

@Preview
@Composable
fun B_dScreenPreview() {
    HKUTheme {
        B_dScreen(
            modifier = Modifier.fillMaxHeight()
        )
    }
}

