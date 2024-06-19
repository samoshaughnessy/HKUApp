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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
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
import androidx.compose.ui.zIndex
import com.example.hku_a_ios_001.R
import com.example.hku_a_ios_001.android.ui.theme.HKUTheme
import com.example.hku_a_ios_001.android.ui.theme.md_theme_dark_background
import com.example.hku_a_ios_001.android.ui.theme.md_theme_light_background

@Composable
fun F_bScreen(
    onNextButtonClicked: () -> Unit = {},
    modifier: Modifier = Modifier
){
        Box(
            modifier = Modifier.zIndex(1f)
        ) {
            Image(
                painter = painterResource(com.example.hku_a_ios_001.android.R.drawable.doctor),
                contentDescription = "background_image",
                modifier = Modifier
                    .offset(x = -150.dp, y = 280.dp)
                    .scale(0.7f)
            )
        }
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(15.dp)
                .background(color = md_theme_dark_background.copy(alpha = 0.4f))
                .shadow(2.dp, shape = RectangleShape)
                .padding(20.dp)
        ) {

            Text(
                "醫生沒有正\n" +
                        "當理由卻拒絕\n" +
                        "調整相關限制...",
                lineHeight = 50.sp, fontSize = 35.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,   modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )

            Text(
                "\n如果醫生沒有正當理由卻拒絕調整您的相關限制，您可以聯絡所在醫院的病人聯絡主任辦公室。爲了保證您的訴求得到合適的處理，您可以考慮書面記錄過程。 我要怎麼做才能使條件放寬？\n" +
                "\n" +
                        "您的記錄最後可以以表格形式呈現，盡可能詳細地記錄您在何時、何地向誰提出過怎樣的訴求，獲得了怎樣的回覆。一份合理且詳細的書面記錄可以幫助您 跟進相關事項的進度，同 時在您           \n" +
                        "           需要維護自身權 利時作爲\n" +
                        "           證據支持 \n"
            )

            HomeButton(nextButton = onNextButtonClicked)
            HKULogo()
        }
}

@Preview
@Composable
fun F_bScreenPreview() {
    HKUTheme {
        F_bScreen(
            modifier = Modifier.fillMaxHeight()
        )
    }
}


