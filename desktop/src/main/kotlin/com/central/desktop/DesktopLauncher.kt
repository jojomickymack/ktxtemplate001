package com.central.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.central.Application

object DesktopLauncher {
    @JvmStatic
    fun main(arg: Array<String>) {
        LwjglApplication(Application(), LwjglApplicationConfiguration())
    }
}
