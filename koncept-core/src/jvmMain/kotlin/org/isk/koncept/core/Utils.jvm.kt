package org.isk.koncept.core

import java.util.concurrent.atomic.AtomicLong

actual class Utils {
    actual fun provideIncrementalIdProvider(): IncrementalIdProvider =
        object : IncrementalIdProvider {
            val atomicLong: AtomicLong = AtomicLong(1)
            override fun getNextId(): Long = atomicLong.getAndIncrement()

        }
}