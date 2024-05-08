package org.isk.koncept.core

import org.isk.koncept.plugin.block.Block
import org.isk.koncept.plugin.block.SourceBlock

private typealias PeskyBlock = Block<Any?, Any?>

class Kernel {

    private val blocks: MutableMap<Long, SourceBlock<Any>> = mutableMapOf()

    val idProvider = Utils().provideIncrementalIdProvider()

    fun addBlock(block: PeskyBlock, to: Long? = null): Long {
        if (block is SourceBlock) {
            val id = idProvider.getNextId();
            blocks[id] = block
        } else if (to != null) {
            (blocks[to]!! as PeskyBlock).compose(block)
        }
        return id
    }

    private infix fun PeskyBlock.compose(block: PeskyBlock): PeskyBlock =
        object : Block<Any?, Any?> {
            override suspend fun pushThrough(input: Any?): Any? {
                return block.pushThrough(this@compose.pushThrough(input))
            }
        }


}