package org.isk.koncept.plugin.example

import org.isk.koncept.plugin.interfaces.plugin.Plugin


class MarkDownPlugin() : Plugin<String, String> {
    override val name: String = "MarkDownPlugin"
    override val version: String = "0.0.1"
    override val description: String = "Transforming Given Markdown into HTML"

    override suspend fun String.produce(): String {
        return ""
    }
}

