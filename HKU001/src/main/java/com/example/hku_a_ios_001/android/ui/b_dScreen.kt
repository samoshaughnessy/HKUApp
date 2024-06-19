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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hku_a_ios_001.R
import com.example.hku_a_ios_001.android.ui.theme.HKUTheme
import com.example.hku_a_ios_001.android.ui.theme.md_theme_dark_background
import com.example.hku_a_ios_001.android.ui.theme.md_theme_light_background

@Composable
fun B_dScreen(
    onNextButtonClicked: () -> Unit = {},
    modifier: Modifier = Modifier
){
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(15.dp)
                .background(color = md_theme_dark_background.copy(alpha = 0.4f))
                .shadow(2.dp, shape = RectangleShape)
                .padding(20.dp)
//        horizontalAlignment = Alignment.CenterHorizontally,
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
        )
    }
}

