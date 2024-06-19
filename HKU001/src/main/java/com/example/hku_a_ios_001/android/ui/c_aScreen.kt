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
fun C_aScreen(
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
                "有條件釋放令\n",
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
