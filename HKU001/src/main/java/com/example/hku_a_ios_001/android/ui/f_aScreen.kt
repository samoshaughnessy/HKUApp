package com.example.hku_a_ios_001.android.ui

import android.media.Image
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
fun F_aScreen(
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
                    .offset(x = -155.dp, y = 250.dp)
                    .scale(0.7f)
            )
        }

        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(15.dp)
                .background(color = md_theme_dark_background.copy(alpha = 0.4f))
                .shadow(2.dp, shape = RectangleShape)
                .padding(10.dp)
        ) {

            Text(
                "可以向精神科醫生\n" +
                        "提出的問題",
                lineHeight = 50.sp, fontSize = 35.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,   modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )


            Text(
                "\n為什麼我必須被施加有條件釋放令？\n \n" +
                "我要怎麼做才能使條件放寬？\n \n" +
                "藥物令我感到不適，你能調整我的藥物嗎？ \n \n " +
                "我的心理健康狀況診斷結果是什麼？ \n \n " +
                "距離我上次診斷已經很久了，我  \n" + "覺得自己好轉了，  你可以再次診  斷我嗎 \n", fontSize = 20.sp
            )
            NextButton(nextButton = onNextButtonClicked)

            HKULogo()
        }
}

@Preview
@Composable
fun F_aScreenPreview() {
    HKUTheme {
        F_aScreen(
            modifier = Modifier.fillMaxHeight()
        )
    }
}


