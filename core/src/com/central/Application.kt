package com.central

import com.badlogic.gdx.Screen
import com.central.screens.Game
import ktx.app.KtxGame
import ktx.async.enableKtxCoroutines

class Application : KtxGame<Screen>() {

    override fun create() {
        enableKtxCoroutines(asynchronousExecutorConcurrencyLevel = 1)

        val game = Game(this)

        addScreen(game)
        setScreen<Game>()
    }
}
