package org.isk.koncept.plugin.interfaces.plugin


infix fun <X, T, Y> PluginWrapper<X, T>.then(
    other: PluginWrapper<T, Y>
): PluginWrapper<X, Y> {
    val combinedWrapper = object : PluginWrapper<X, Y> {

        override suspend fun digest(input: X): Y {
            return other.digest(this@then.digest(input))
        }

    }
    return combinedWrapper
}

