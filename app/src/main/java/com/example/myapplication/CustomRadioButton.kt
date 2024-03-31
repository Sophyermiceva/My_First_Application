package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CustomRadioButton() {
    val radioOptions = listOf("Sun", "Apple", "Flower")
    var selectedOptionIndex: Int by remember { mutableStateOf(0) }
    if (selectedOptionIndex == 0)
        Image(
            painter = painterResource(id = R.drawable.sun),
            contentDescription = "Sun"
        )
    if (selectedOptionIndex == 1)
        Image(
            painter = painterResource(id = R.drawable.apple),
            contentDescription = "Apple"
        )
    if (selectedOptionIndex == 2)
        Image(
            painter = painterResource(id = R.drawable.flower),
            contentDescription = "Flower"
        )

    Column {
        radioOptions.forEachIndexed { index, text ->
            Row(
                verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(16.dp)
            ) {
                RadioButton(selected = selectedOptionIndex == index, onClick = { selectedOptionIndex = index })
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = text)
            }
        }

    }

}
