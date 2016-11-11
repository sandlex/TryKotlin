package com.sandlex.trykotlin

import java.util.LinkedList

class TrainComposition {

    val wagons = LinkedList<Int>()

    fun attachWagonFromLeft(wagonId: Int) {
        wagons.offerFirst(wagonId)
    }

    fun attachWagonFromRight(wagonId: Int) {
        wagons.offerLast(wagonId)
    }

    fun detachWagonFromLeft(): Int = wagons.pollFirst()


    fun detachWagonFromRight(): Int = wagons.pollLast()

}