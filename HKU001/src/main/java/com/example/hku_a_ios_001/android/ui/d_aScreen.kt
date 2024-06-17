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
import com.example.hku_a_ios_001.R
import com.example.hku_a_ios_001.android.ui.theme.HKUTheme
import com.example.hku_a_ios_001.android.ui.theme.md_theme_dark_background
import com.example.hku_a_ios_001.android.ui.theme.md_theme_light_background

@Composable
fun D_aScreen(
    onSelectionChanged: (String) -> Unit = {},
    onCancelButtonClicked: () -> Unit = {},
    onNextButtonClicked: () -> Unit = {},
    modifier: Modifier = Modifier
){
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)
                .background(color = md_theme_dark_background.copy(alpha = 0.4f))
                .shadow(2.dp, shape = RectangleShape)
                .padding(20.dp)
        ) {
            Text(
                "如果有條件\n" +
                        "釋放令不合理 \n",
                lineHeight = 50.sp, fontSize = 35.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,   modifier = Modifier.align(alignment = Alignment.CenterHorizontally))
            Text(
                "向精神健康覆核審裁處申請覆核您的有條件釋放令\n", fontWeight = FontWeight.Bold, fontSize = 20.sp
            )
            Text(
                "-您每年只能對您的有條件釋放令提出覆核申請一次 \n \n" +
                "-您必須親自向精神健康覆核審裁處提出覆核申請，因為醫務人員不會將處於有條件釋放令下的服務對象轉介至精神健康覆核審裁處； \n \n" +
                "-即使院長認為不需要再對服務對象進行隔離治療，院長也沒有辦法直接釋放服務對象；\n \n" +
                "-解除或取消：只有精神健康覆核審裁處有權力；醫務人員和院長沒有權力直接解除或者取消有條件釋放令，但是實踐中醫生可以解除您需要遵守的全部條件，從而達到同樣效果", fontSize = 20.sp
            )
            Row(
            ) {
                Button(
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp)
                        .absoluteOffset(x = 230.dp, y = 0.dp),
                    enabled = true,
                    onClick = onNextButtonClicked
                ) {
                    Text(">",color = Color.White, fontSize = 30.sp, fontWeight = FontWeight.Bold)
                }

            }
            HKULogo()
            }
}

@Preview
@Composable
fun D_aScreenPreview() {
    HKUTheme {
        D_aScreen(
            modifier = Modifier.fillMaxHeight()
        )
    }
}
