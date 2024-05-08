package org.isk.koncept.core

import org.isk.koncept.plugin.KPlugin

expect class PluginProvider {
    fun provideLocalPlugins(): List<KPlugin>
    fun providePluginByName(): KPlugin?
}