package com.central.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.central.Application
import ktx.app.KtxScreen

class Game(val application: Application) : KtxScreen {
    private val sr = ShapeRenderer()
    private var rotation = 0.0f
    private val width = Gdx.graphics.width.toFloat()
    private val height = Gdx.graphics.height.toFloat()

    init {

    }

    override fun render(delta: Float) {
        rotation += 1f

        with(sr) {
            begin(ShapeType.Line)
            translate(width / 2, height / 2, 0f)
            rotate(0f, 0f, 1f, rotation)
            color = Color.WHITE
            rect(0f - 75, 0f - 75, 150f, 150f)
            end()

            begin(ShapeType.Filled)
            identity()
            color = Color.RED
            circle(0f, 0f, 200f, 25)

            color = Color.PINK
            circle(0f, height, 200f, 25)

            color = Color.YELLOW
            circle(width, height, 200f, 25)

            color = Color.BLUE
            circle(width, 0f, 200f, 25)
            end()
        }
    }
}
