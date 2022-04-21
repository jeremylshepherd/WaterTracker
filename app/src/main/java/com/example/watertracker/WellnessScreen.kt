package com.example.watertracker

import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
    Column(modifier = modifier)
    {
        WaterCounter(modifier)
        WellnessTasksList(
            list = wellnessViewModel.tasks, 
            onCheckedTask = {task, checked -> wellnessViewModel.changeTaskChecked(task, checked)},
            onCloseTask = { task -> wellnessViewModel.remove(task) })
    }
}