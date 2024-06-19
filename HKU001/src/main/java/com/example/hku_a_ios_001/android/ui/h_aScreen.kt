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

@Composable
fun H_aScreen(
    onSelectionChanged: (String) -> Unit = {},
    onCancelButtonClicked: () -> Unit = {},
    onNextButtonClicked: () -> Unit = {},
    modifier: Modifier = Modifier
){
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(15.dp)
                .background(color = md_theme_dark_background.copy(alpha = 0.4f))
                .shadow(2.dp, shape = RectangleShape)
                .padding(10.dp)
        ) {

            Text(
                "重要聯絡人", lineHeight = 50.sp, fontSize = 35.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,   modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )
            Text(
                "\n如果認為施加的條件不合理，您可以聯絡律師或專業人士確認條件是否不合理:\n", fontSize = 20.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,   modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(com.example.hku_a_ios_001.android.R.drawable.logo2),
                    modifier = Modifier
                        .background(color = Color.Transparent)
                        .scale(2f),
                    contentDescription = null,
                )
            }

            Text(
                "\n法律援助署 \n" +
                        "ladinfo@lad.gov.hk \n" +
                        "+ 852 2537 7677 \n" +
                        "香港金鐘道66號政府合署\n", fontSize = 20.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,   modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
              painter = painterResource(com.example.hku_a_ios_001.android.R.drawable.concord_mutual_aid), // replace image....?
                    modifier = Modifier
                        .background(color = Color.Transparent)
                        .scale(1f),
                    contentDescription = null,
                )
            }

            Text(
                "\n康和互助社聯會\n" +
                        "concord.maca@gmail.com \n" +
                        "+852 3586 0567 / 6826 0720\n" +
                        "石硤尾南山邨南逸樓地下3-10號\n" +
                        "www.concord.org.hk \n", fontSize = 20.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,   modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(com.example.hku_a_ios_001.android.R.drawable.hk_dignity), // replace image....?
                    modifier = Modifier
                        .background(color = Color.Transparent)
                        .scale(1f),
                    contentDescription = null,
                )
            }
            Text(
                "\n香港守護尊嚴中心\n" +
                        "info@dignityinstitute.com \n" +
                        "+852 9728 5969\n" +
                        "P.O. Box 28557\n" +
                        "香港告士打道郵政局\n" +
                        "www.dignityinstitute.com \n", fontSize = 20.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,   modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(com.example.hku_a_ios_001.android.R.drawable.hong_kong_flag), // replace image....?
                    modifier = Modifier
                        .background(color = Color.Transparent)
                        .scale(1f),
                    contentDescription = null,
                )
            }
            Text(
                "\n精神健康覆核審裁處\n" +
                        "香港添馬添美道2號政府總部東翼19樓\n" +
                        "+852 2594 5636\n" +
                        "https://www.healthbureau.gov.hk/cn/committees/mhrt.htm\n", fontSize = 20.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,   modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )

            HomeButton(nextButton = onNextButtonClicked)
            HKULogo()
        }
}

@Preview
@Composable
fun H_aScreenPreview() {
    HKUTheme {
        H_aScreen(
            modifier = Modifier.fillMaxHeight()
        )
    }
}




