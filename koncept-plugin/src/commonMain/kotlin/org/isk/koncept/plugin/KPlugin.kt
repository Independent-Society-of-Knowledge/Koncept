package org.isk.koncept.plugin

import org.isk.koncept.plugin.block.Block
import kotlin.reflect.KClass

interface KPlugin {
    fun initialize()
    fun <T : Block<*, *>> canHandle(block: KClass<T>): Boolean
    fun shutdown()
}