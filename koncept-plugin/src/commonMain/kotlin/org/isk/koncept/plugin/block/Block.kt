package org.isk.koncept.plugin.block

interface Block<T, U> {
    suspend fun pushThrough(input: T): U
}