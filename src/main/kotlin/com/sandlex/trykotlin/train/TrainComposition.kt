package com.sandlex.trykotlin.train

import java.util.LinkedList

/**
 *
 * author: Alexey Peskov
 */
class TrainComposition {

    val train = LinkedList<Int>()

    fun attachWagonFromLeft(wagonId: Int) {
        train.offerFirst(wagonId)
    }

    fun attachWagonFromRight(wagonId: Int) {
        train.offerLast(wagonId)
    }

    fun detachWagonFromLeft(): Int = train.pollFirst()


    fun detachWagonFromRight(): Int = train.pollLast()

}