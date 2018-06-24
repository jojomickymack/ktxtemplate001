package com.central.screens

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.central.Application
import com.badlogic.gdx.scenes.scene2d.Stage
import ktx.app.KtxScreen

class Game(val application: Application) : KtxScreen {
    private val stage = Stage()
    private val sr = ShapeRenderer()
    private var rotation = 0.0f

    init {

    }

    override fun render(delta: Float) {
        stage.act()
        stage.draw()

        rotation += 1f

        sr.begin(ShapeType.Line)
        sr.translate(stage.width / 2, stage.height / 2, 0f)
        sr.rotate(0f, 0f, 1f, rotation)
        sr.color = Color.WHITE
        sr.rect(0f - 75, 0f - 75, 150f, 150f)
        sr.end()

        sr.begin(ShapeType.Filled)
        sr.identity()
        sr.color = Color.RED
        sr.circle(0f, 0f, 200f, 25)

        sr.color = Color.PINK
        sr.circle(0f, stage.height, 200f, 25)

        sr.color = Color.YELLOW
        sr.circle(stage.width, stage.height, 200f, 25)

        sr.color = Color.BLUE
        sr.circle(stage.width, 0f, 200f, 25)
        sr.end()
    }
}
