package com.example.myapplication

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home Screen")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("secondScreen") }) {
            Text(text = "Go to Second Screen")
        }
        Button(onClick = { navController.navigate("thirdScreen") }) {
            Text(text = "Go to Third Screen")
        }
    }
}