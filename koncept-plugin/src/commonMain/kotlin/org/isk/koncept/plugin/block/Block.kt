package org.isk.koncept.plugin.block

interface Block<T, U> {
    suspend fun pushThrough(input: T): U
}

typealias HTML = String
typealias Kernel<T,U> = T.() -> U

interface plugin<T, U> {
    val kernel: Kernel<T, U>
    val inputWrapper: X.() -> T
    val outputWrapper: U.() ->
}