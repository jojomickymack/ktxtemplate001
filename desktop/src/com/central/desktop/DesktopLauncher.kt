@file:JvmName("DesktopLauncher")

package com.central.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.central.Application

fun main(arg: Array<String>) {
    val config = LwjglApplicationConfiguration()
    LwjglApplication(Application(), config)
}
