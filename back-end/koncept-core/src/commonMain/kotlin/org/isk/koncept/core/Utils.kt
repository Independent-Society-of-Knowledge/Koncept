package org.isk.koncept.core


interface IncrementalIdProvider {
    fun getNextId(): Long
}

expect class Utils() {
    fun provideIncrementalIdProvider(): IncrementalIdProvider
}