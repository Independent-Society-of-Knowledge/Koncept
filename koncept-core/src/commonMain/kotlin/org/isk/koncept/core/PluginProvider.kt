package org.isk.koncept.core

import org.isk.koncept.plugin.block.KPlugin

expect class PluginProvider {
    fun provideLocalPlugins(): List<KPlugin>
    fun providePluginByName(): KPlugin?
}