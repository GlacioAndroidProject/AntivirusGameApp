package com.github.nthily.flappybird

import android.content.res.Resources
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import com.github.nthily.flappybird.game.Game
import com.github.nthily.flappybird.game.GameState

@ExperimentalAnimationApi
@Composable

fun OverAlert(game: Game){



    if(game.gameState == GameState.Over){
        /*
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Surface(
                modifier = Modifier.size(150.dp),
                elevation = 10.dp
            ) {
                Text("Game Over")
            }
        }

         */

        AlertDialog(
            onDismissRequest = {

            },
            title = {
                Text(
                    text = "Game Over",
                    fontWeight = FontWeight.W700,
                    style = MaterialTheme.typography.h6
                )
            },
            text = {
                Text(
                    text = "You have been infected with a virus. \nYou have avoided the virus: ${game.score}",
                    style = MaterialTheme.typography.body1
                )
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        game.restartGame()
                    },
                ) {
                    var playAgainString = "Play again"//Resources.getSystem().getString(R.string.play_again_confirm)
                    Text(
                        playAgainString,
                        fontWeight = FontWeight.W700,
                        style = MaterialTheme.typography.button
                    )
                }
            },
        )

    }
}