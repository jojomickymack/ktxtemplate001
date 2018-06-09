package com.central.screens

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.central.Application
import com.badlogic.gdx.scenes.scene2d.Stage
import ktx.app.KtxScreen

class Game(val application: Application) : KtxScreen {
    private val stage = Stage()
    private val sr = ShapeRenderer()

    init {
        sr.setAutoShapeType(true)
    }

    override fun render(delta: Float) {
        stage.act()
        stage.draw()

        sr.begin()

        sr.color = Color.RED
        sr.circle(0f, 0f, 200f, 25)

        sr.color = Color.PINK
        sr.circle(0f, stage.height, 200f, 25)

        sr.color = Color.YELLOW
        sr.circle(stage.width, stage.height, 200f, 25)

        sr.color = Color.BLUE
        sr.circle(stage.width, 0f, 200f, 25)

        sr.color = Color.WHITE
        sr.circle(stage.width / 2, stage.height / 2, 200f, 25)

        sr.end()
    }
}
