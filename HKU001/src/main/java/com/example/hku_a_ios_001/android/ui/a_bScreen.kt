package com.example.hku_a_ios_001.android.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
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
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.hku_a_ios_001.R
import com.example.hku_a_ios_001.android.ui.theme.HKUTheme

@Composable
fun A_bScreen(
    onSelectionChanged: (String) -> Unit = {},
    onCancelButtonClicked: () -> Unit = {},
    onNextButtonClicked: () -> Unit = {},
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("a_b Screen")
            Text("什麼是有條\n" +
                    "\n" +
                    "件釋放？")
            Text("相比於無條件釋放，有條件釋放令要求您出院後遵守一些特定的條件，如果您未遵守這些條件，而院長認為基於您的健康或安全，或為保護他人著想而有需要有可能將您重新召回精神病院。\n" +
                    "\n")
            Text("相關條例：\n" +
                    "\n")
            Text("《精神健康條例》（第136章）\n" +
                    "\n" +
                    "第42B條") // Bold
            Text("若病人獲准出院或將對社會構成風險，院長可發出有條件釋放令並施加條件，以限制相關病人出院後的自由。在該法例下，有條件釋放需符合兩個條件：\n" +
                    "\n" +
                    "1）院長覺得該名病人有刑事暴力的病例，或有使用刑事暴力的傾向；但\n" +
                    "\n" +
                    "2）院長認為，在釋放令所指明條件的規限下，可安全地將該病人釋放。\n" +
                    "\n" +
                    "若獲有條件釋放的病人沒有遵守基於第42B條第3款所規限的任何條件，該名病人或將被重新召回醫院。")
        }
    }
}

@Preview
@Composable
fun A_bScreenPreview() {
    HKUTheme {
        A_bScreen(
            modifier = Modifier.fillMaxHeight()
        )
    }
}