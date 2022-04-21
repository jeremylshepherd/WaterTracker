package com.example.watertracker

import android.util.Log
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.watertracker.dto.WellnessTask
import java.util.*

@Composable
fun WellnessTasksList(
    list: List<WellnessTask>,
    onCheckedTask: (WellnessTask, Boolean) -> Unit,
    onCloseTask: (WellnessTask) -> Unit,
    modifier: Modifier = Modifier,
) {
    val uuids = getUUIDs(size = list.size)
    LazyColumn(
        modifier = modifier
    ) {
        itemsIndexed(
            items = list,
           key = {index, task ->
                "${task.label}_${uuids[index]}"}
        ) { _, task ->
            WellnessTaskItem(
                taskName = task.label,
                checked = task.checked,
                onCheckedChange = { checked -> onCheckedTask(task, checked) },
                onClose = { onCloseTask(task) }
            )
        }
    }
}

private fun getUUIDs(size: Int) = List(size) { UUID.randomUUID().toString() }

