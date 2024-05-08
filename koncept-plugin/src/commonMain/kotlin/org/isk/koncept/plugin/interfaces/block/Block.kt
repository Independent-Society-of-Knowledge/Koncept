package org.isk.koncept.plugin.interfaces.block

import org.isk.koncept.plugin.interfaces.plugin.Plugin
import org.isk.koncept.plugin.interfaces.plugin.PluginWrapper

interface Block<T, U> {
    val inputWrapper: PluginWrapper<Any, T>
    val plugin: Plugin<T,U>
    val outputWrapper: PluginWrapper<U, Any>
}