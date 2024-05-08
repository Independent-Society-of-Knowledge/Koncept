package org.isk.koncept.core

actual class Utils {
    actual fun provideIncrementalIdProvider(): IncrementalIdProvider =
        object : IncrementalIdProvider {
            var id = 1L
            override fun getNextId(): Long =
                id++

        }
}