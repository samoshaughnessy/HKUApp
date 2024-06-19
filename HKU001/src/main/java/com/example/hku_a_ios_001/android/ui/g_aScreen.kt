package com.example.hku_a_ios_001.android.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
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
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.component1
import androidx.core.graphics.component2
import com.example.hku_a_ios_001.R
import com.example.hku_a_ios_001.android.ui.theme.HKUTheme
import com.example.hku_a_ios_001.android.ui.theme.md_theme_dark_background
import com.example.hku_a_ios_001.android.ui.theme.md_theme_light_background
import org.w3c.dom.Text

@Composable
fun RowScope.TableCell(
    text: String,
    weight: Float,
    backgroundColor: Color,
    textAlignment: TextAlign,
    textColour: Color,
) {
    Box(
        modifier = Modifier
            .weight(weight)
            .background(color = backgroundColor)
            .fillMaxSize()
            .height(IntrinsicSize.Min)
            .border(1.dp, color = Color.White),// fix
    ){
        Text(
            text = text,
            Modifier
                .padding(8.dp)
                .fillMaxSize()
                .wrapContentHeight(), textAlign = textAlignment, color = textColour
        )
    }
}

@Composable
fun TableScreen() {
    val tableData = arrayOf( arrayOf("您理解您身處的有條件釋放制度嗎？", "36.2%" ,"63.8%"),
        arrayOf("您理解有條件釋放令的監管條件嗎？", "70.2%" ,"29.8%"),
        arrayOf("您知道如何終止您的有條件釋放令嗎？", "25.5%" ,"74.5%"),
        arrayOf("您是否知道您有權向精神健康覆核審裁處（MHRT）提出覆核申請以解除您的有條件釋放令？", "27.7%" ,"72.3%"),
        arrayOf("首次申請無條件釋放成功率", "2.3%" ,"97.7%"),
        arrayOf("您是否知道您所擁有的權利？", "9.3%" ,"91.7%"),
           )

    // Each cell of a column must have the same weight.
    val column1Weight = .2f // 30%
    val column2Weight = .6f // 70%
    Column(
        modifier = Modifier.background(color = Color.Gray)
    ) {
        // Here is the header
            Row(
                Modifier
                    .border(1.dp, color = Color.White)
                    .height(IntrinsicSize.Min)) {
                TableCell(text = "問題", weight = column2Weight, backgroundColor = Color(0XFF3D85C6), textAlignment = TextAlign.Center, textColour = Color(0XFFFFFFFF))
                TableCell(text = "YES", weight = column1Weight,backgroundColor = Color(0XFF3D85C6),  textAlignment = TextAlign.Center, textColour = Color(0XFFFFFFFF))
                TableCell(text = "NO", weight = column1Weight, backgroundColor = Color(0XFF3D85C6), textAlignment = TextAlign.Center, textColour = Color(0XFFFFFFFF))
            }
        }
    tableData.forEachIndexed { index, it ->
            val (text, yes, no) = it
            val backgroundColor = if (index % 2 == 0) Color(0XFF9FC5E8) else Color(0XFFEEEEEE)

            Row( modifier = Modifier
                .border(1.dp, color = Color.White)
                .height(IntrinsicSize.Min)
                ,) {
                TableCell(text = text, weight = column2Weight, backgroundColor = backgroundColor, textAlignment = TextAlign.Left, textColour = Color.Black)
                TableCell(text = yes, weight = column1Weight, backgroundColor = backgroundColor, textAlignment = TextAlign.Center, textColour = Color.Black)
                TableCell(text = no, weight = column1Weight, backgroundColor = backgroundColor, textAlignment = TextAlign.Center, textColour = Color.Black)
            }
        }
}



@Composable
fun G_aScreen(
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
                .padding(10.dp),
            ) {
            Text(
                "有條件釋放者\n" +
                        "是否了解\n" +
                        "他們的情況\n",
                lineHeight = 50.sp, fontSize = 35.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,   modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )

            TableScreen() // causing issues if in app the page wont load

            Text( buildAnnotatedString {
                append("\n來源: ")
                withStyle(style = SpanStyle(fontStyle = FontStyle.Italic)){
                    append("Cheung D. (2022). Control in the community: A qualitative analysis of the experience of persons on conditional discharge in Hong Kong. International journal of law and psychiatry, 82\"")
                }
            }, fontSize = 20.sp, fontWeight = FontWeight.Bold)
            HomeButton(nextButton = onNextButtonClicked)
            HKULogo()
        }
}

@Preview
@Composable
fun G_aScreenPreview() {
    HKUTheme {
        G_aScreen(
            modifier = Modifier.fillMaxHeight()
        )
    }
}




