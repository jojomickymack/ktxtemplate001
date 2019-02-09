package com.central

import com.badlogic.gdx.Screen
import com.central.screens.Game
import ktx.app.KtxGame

class App : KtxGame<Screen>() {

    override fun create() {
        val game = Game(this)

        addScreen(game)
        setScreen<Game>()
    }
}
