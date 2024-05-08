package org.isk.koncept.plugin.block

interface SourceBlock<U> : Block<Unit, U> {
    fun updated()
}