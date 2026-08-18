package com.Infinovus.imhungry.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.Infinovus.imhungry.ui.theme.ImHungryTheme

@Composable
fun MealName(mealName: String, modifier: Modifier = Modifier, fontSize: TextUnit = 30.sp) {
    Text(
        text = mealName,
        modifier = modifier,
        fontSize = fontSize,
        textAlign = TextAlign.Center,
    )
}

@Preview(showBackground = true)
@Composable
fun MealNamePreview() {
    ImHungryTheme {
        MealName("叉燒飯")
    }
}