package com.sandlex.trykotlin.train

import java.util.*
import org.junit.Before;
import org.junit.*

/**
 *
 * author: Alexey Peskov
 */
class TrainCompositionTest {

    lateinit var trainComposition: TrainComposition

    @Before
    fun createTrainComposition() {
        trainComposition = TrainComposition()
    }

    @Test
    fun attachWagonFromRight(wagonId: Int) {
        trainComposition.attachWagonFromRight(7)
        trainComposition.attachWagonFromLeft(13)
        Assert.assertTrue(trainComposition.detachWagonFromRight() == 7)
        Assert.assertTrue(trainComposition.detachWagonFromLeft() == 13)
    }

}
