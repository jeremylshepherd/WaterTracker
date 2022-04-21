package com.example.watertracker

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Counter(count: Int, onIncrement: () -> Unit, onClear: () -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        Text("Your count is $count.")
        Row(
            modifier = modifier.fillMaxWidth()
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Button(onClick = onIncrement, Modifier.padding(top = 8.dp)) {
                Text("Add one")
            }
            Button(onClick = { onClear }, Modifier.padding(top = 8.dp)) {
                Text("Clear count")
            }
        }

    }
}