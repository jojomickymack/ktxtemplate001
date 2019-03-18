package com.central.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color.*
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType.*
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.central.App
import ktx.app.KtxScreen
import ktx.graphics.*


class Game(val application: App) : KtxScreen {
    private val sr = ShapeRenderer()
    private var rotation = 0.0f
    private val width = Gdx.graphics.width.toFloat()
    private val height = Gdx.graphics.height.toFloat()

    init {

    }

    override fun render(delta: Float) {
        rotation += 1f

        with(sr) {
            use(Line) {
                translate(width / 2, height / 2, 0f)
                rotate(0f, 0f, 1f, rotation)
                color = WHITE
                rect(0f - 75, 0f - 75, 150f, 150f)
            }

            use(Filled) {
                identity()
                color = RED
                circle(0f, 0f, 200f, 25)

                color = PINK
                circle(0f, height, 200f, 25)

                color = YELLOW
                circle(width, height, 200f, 25)

                color = BLUE
                circle(width, 0f, 200f, 25)
            }
        }
    }

    override fun dispose() {
        sr.dispose()
        println("all disposable memory freed")
        super.dispose()
    }
}
