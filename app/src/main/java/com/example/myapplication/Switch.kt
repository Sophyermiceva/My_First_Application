package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Switch() {
    // State to hold the checked state of the Switch
    val switchState = remember { mutableStateOf(false) }

    // Background color based on the switch state
    val textColor = if (switchState.value) Color.Blue else Color.Red

    Column(

        horizontalAlignment = Alignment.CenterHorizontally,
        //      verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            fontSize = 30.sp,
            color = textColor,
            text = "Hello"
        )
        Spacer(modifier = Modifier.height(16.dp))
        androidx.compose.material3.Switch(
            checked = switchState.value,
            onCheckedChange = { isChecked ->
                switchState.value = isChecked
            },
            modifier = Modifier.padding(16.dp)
        )
    }
}
