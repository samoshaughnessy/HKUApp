package com.example.hku_a_ios_001.android.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import com.example.hku_a_ios_001.R
import com.example.hku_a_ios_001.android.ui.theme.HKUTheme
import com.example.hku_a_ios_001.android.ui.theme.md_theme_dark_background
import com.example.hku_a_ios_001.android.ui.theme.md_theme_light_background

@Composable
fun B_aScreen(
    onNextButtonClicked: () -> Unit = {},
    modifier: Modifier = Modifier
){
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(15.dp)
            .background(color = md_theme_dark_background.copy(alpha = 0.4f))
            .shadow(2.dp, shape = RectangleShape)
            .padding(10.dp),

    ) {

        Text(
            "什麼是中途宿舍?\n",
            lineHeight = 50.sp, fontSize =35.sp, fontWeight = FontWeight.Bold,textAlign = TextAlign.Center,   modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            "-為有條件釋放者提供的指定住所，提供膳食服務\n" +
                    "-提供個人輔導及小組/社區活動\n" +
                    "-週末及節假日可以請假\n" +
                    "-經登記，家人和朋友可以來訪\n" +
                    "-居住期限根據個人需要和進度，由院長決定", fontSize = 20.sp
        )


            Image(
                painter = painterResource(com.example.hku_a_ios_001.android.R.drawable.house), // fix image alignment
                contentDescription = "background_image",
                modifier = Modifier.offset(x=165.dp, y=0.dp)
            )

        Spacer(modifier = Modifier.height(20.dp))

        NextButton(nextButton = onNextButtonClicked)
        HKULogo()
    }
}

@Preview
@Composable
fun B_aScreenPreview() {
    HKUTheme {
        B_aScreen(
            modifier = Modifier.fillMaxHeight()
        )
    }
}