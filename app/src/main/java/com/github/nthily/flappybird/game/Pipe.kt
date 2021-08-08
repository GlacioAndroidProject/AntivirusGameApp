package com.github.nthily.flappybird.game

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


class Pipe(
    pipeDownHeight: Dp,
    pipeUpHeight: Dp
){
    val pipeDownWidth by mutableStateOf(pipeDownHeight)
    val pipeUpWidth by mutableStateOf(pipeUpHeight)
    var pipeDownX by mutableStateOf(pipeDownWidth.value)
    var pipeDownY by mutableStateOf(0f)
    var pipeDownHeight by mutableStateOf(pipeDownHeight)

    var pipeUpX by mutableStateOf(pipeUpWidth.value)
    var pipeUpY by mutableStateOf(0f)
    var pipeUpHeight by mutableStateOf(pipeUpHeight)

   //val width by mutableStateOf(60.dp)

    var isCounted by mutableStateOf(false)
}