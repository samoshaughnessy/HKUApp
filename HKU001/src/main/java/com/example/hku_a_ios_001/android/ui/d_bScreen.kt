package com.example.hku_a_ios_001.android.ui

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.OverscrollEffect
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
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
import androidx.compose.foundation.overscroll
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
fun D_bScreen(
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
                .padding(20.dp)
//        horizontalAlignment = Alignment.CenterHorizontally,
        ) {


            Text(
                "精神健康\n" + "覆核審裁（MHRT) \n",
                lineHeight = 50.sp, fontSize = 33.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,   modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )
            Text(
                "精神健康覆核審裁處（MHRT）負責處理有條件釋放令下的覆核，並決定申請人是否適合被解除有條件釋放令。MHRT由一名具有適當法律經驗的主席、一名醫生、一名社工和一名具備行政或臨床心理學經驗或知識或其他資格或經驗的人組成。 \n \n" +
                "覆核申請時，您可以獲得如下幫助：\n", fontSize = 20.sp
            )

            val bulletItems = listOf("條件釋放令下的服務對象轉介至精神健康覆核審裁處申請表格往往可以在醫院填寫。在醫院填表時，可以獲得醫務社工的協助", "一般來說，當您提出覆核申請時，申訴專員不應該詢問您多餘的問題", "詢問機當局及提出覆核申請的過程，建議您盡量採用書面形式，如是口頭形式，建議盡量錄音，保留溝通過程中的證據，以防醫院施加不合理的條件", "可由您或您的親屬提出申請；申請法律援助以支付法律代表的費用；", "您有權在法律代表或其他授權代表的陪同下出席覆核申請聆訊；"  )

            BulletList(listItems = bulletItems)

            Text(
                "聯絡精神健康\n" +
                        "覆核審裁處",
                lineHeight = 50.sp, fontSize = 35.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,   modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
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
                "精神健康覆核審裁處 \n" +
                        "香港添馬添美道2號政府總部東翼19樓 \n" + "+852 2594 5636 \n" +  "https://www.healthbureau.gov.\nhk/cn/\ncommittees/mhrt.htm"
                ,
                lineHeight = 50.sp, fontSize = 30.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,   modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )

            Row(
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier.fillMaxSize(),
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

                    val colorMatrix = floatArrayOf(
                        -1f, 0f, 0f, 0f, 255f,
                        0f, -1f, 0f, 0f, 255f,
                        0f, 0f, -1f, 0f, 255f,
                        0f, 0f, 0f, 1f, 0f
                    )

                    Image(
                        painter = painterResource(com.example.hku_a_ios_001.android.R.drawable.b_home), modifier = Modifier
                            .background(color = Color.Black)
                            .scale(10f),
                        colorFilter = ColorFilter.colorMatrix(ColorMatrix(colorMatrix)),
                        contentDescription = null,
                    )
                }

            }
            HKULogo()
        }
}

@Preview
@Composable
fun D_bScreenPreview() {
    HKUTheme {
        D_bScreen(

            )
    }
}
