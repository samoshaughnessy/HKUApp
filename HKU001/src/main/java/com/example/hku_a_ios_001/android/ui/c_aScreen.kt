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
fun C_aScreen(
    onNextButtonClicked: () -> Unit = {},
    modifier: Modifier
){
        Column(
            modifier = Modifier
                .padding(25.dp)
                .background(color = md_theme_dark_background.copy(alpha = 0.4f))
                .shadow(2.dp, shape = RectangleShape)
                .padding(10.dp),
                verticalArrangement = Arrangement.SpaceBetween,
            ) {

            Text(
                "有條件釋放令召回\n\n",
                lineHeight = 50.sp, fontSize = 40.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,   modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )
            Text(
                "再次入院後，有條件釋放令還有效嗎？ \n", fontWeight = FontWeight.Bold, fontSize = 20.sp
            )

            Text("-如果您被強制重新送進醫院，原有的有條件釋放令將不再有效。當您被釋放時，院長可能會發佈新的有條件釋放令；\n \n" +
                "-如果您非正式地重新入院（對於非正式的界定，每個醫院的要求不同，建議您向所在醫院詢問清楚）或自願入院，或入住醫院的非精神科病房，有條件釋放令仍然有效；", fontSize = 20.sp
            )

            NextButton(nextButton = onNextButtonClicked)
            HKULogo()
        }
}


@Preview
@Composable
fun C_aScreenPreview() {
    HKUTheme {
        C_aScreen(
            modifier = Modifier.fillMaxHeight()
        )
    }
}
