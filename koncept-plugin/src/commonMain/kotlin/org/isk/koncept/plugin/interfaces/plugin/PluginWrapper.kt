package org.isk.koncept.plugin.interfaces.plugin

interface PluginWrapper<in T,out U> {
    suspend fun digest(input: T): U
}