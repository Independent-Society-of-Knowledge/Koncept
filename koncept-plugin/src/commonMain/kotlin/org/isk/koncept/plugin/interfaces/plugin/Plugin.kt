package org.isk.koncept.plugin.interfaces.plugin


interface Plugin<T,U> {
    val name: String
    val version: String
    val description: String

    suspend fun T.produce(): U
}




