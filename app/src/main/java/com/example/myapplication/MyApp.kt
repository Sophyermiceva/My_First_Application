package com.example.myapplication

/*@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Home", fontSize = 26.sp, color = Purple40)
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background), //png
            contentDescription = "My Image"
        )
        CustomRadioButton()
        SwitchWithBackgroundColor()
    }

}


*/
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController)
        }
        composable("secondScreen") {
            SecondScreen(navController)
        }
        composable("thirdScreen") {
            ThirdScreen(navController)
        }
    }
}

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

@Composable
fun SecondScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Second Screen")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("home") }) {
            Text(text = "Go to Home Screen")
        }
        Spacer(modifier = Modifier.height(16.dp))
        CustomRadioButton()
    }
}
@Composable
fun ThirdScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Third Screen")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("home") }) {
            Text(text = "Go to Home Screen")
        }
        Switch()
    }
}

@Composable
fun CustomRadioButton() {
    val radioOptions = listOf("Sun", "Apple", "Flower")
    var selectedOptionIndex: Int by remember { mutableStateOf(0) }
    if (selectedOptionIndex==0)
        Image(
            painter = painterResource(id = R.drawable.sun),
            contentDescription = "Sun"
        )
    if (selectedOptionIndex==1)
        Image(
            painter = painterResource(id = R.drawable.apple),
            contentDescription = "Apple"
        )
    if (selectedOptionIndex==2)
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
            text = "Hello")
        Spacer(modifier = Modifier.height(16.dp))
        Switch(
            checked = switchState.value,
            onCheckedChange = { isChecked ->
                switchState.value = isChecked
            },
            modifier = Modifier.padding(16.dp)
        )
    }
}



