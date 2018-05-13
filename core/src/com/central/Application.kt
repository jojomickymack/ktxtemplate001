package com.central

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import com.badlogic.gdx.utils.viewport.ScreenViewport
import com.central.view.Game
import ktx.app.KtxGame
import ktx.assets.toInternalFile
import ktx.async.enableKtxCoroutines
import ktx.scene2d.Scene2DSkin
import ktx.style.*

class Application : KtxGame<Screen>() {

    override fun create() {
        enableKtxCoroutines(asynchronousExecutorConcurrencyLevel = 1)

        val textureAtlas = TextureAtlas("skin.atlas")
        val spriteBatch = SpriteBatch()
        val screenViewport = ScreenViewport()
        val stage = Stage(screenViewport, spriteBatch)
        val skin = createSkin(textureAtlas)
        Scene2DSkin.defaultSkin = skin
        val game = Game(stage, this)

        playMusic()
        addScreen(game)
        setScreen<Game>()
    }

    private fun playMusic() {
        Gdx.audio.newMusic("theme.ogg".toInternalFile()).apply {
            volume = 0.3f
            setOnCompletionListener { play() }
        }.play()
    }

    fun createSkin(atlas: TextureAtlas): Skin = skin(atlas) { skin ->
        add(defaultStyle, BitmapFont())
        add("decorative", FreeTypeFontGenerator("decorative.ttf".toInternalFile())
                .generateFont(FreeTypeFontParameter().apply {
                    borderWidth = 2f
                    borderColor = Color.GRAY
                    size = 50
                }))
        label {
            font = skin[defaultStyle]
        }
        label("decorative") {
            font = skin["decorative"]
        }
        textButton("decorative") {
            font = skin["decorative"]
            overFontColor = Color.GRAY
            downFontColor = Color.DARK_GRAY
        }
        window {
            titleFont = skin[defaultStyle]
        }
    }
}
