package com.sandlex.trykotlin

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
    fun testComposition() {
        trainComposition.attachWagonFromRight(1)
        trainComposition.attachWagonFromRight(7)
        trainComposition.attachWagonFromLeft(13)
        trainComposition.attachWagonFromLeft(6)
        trainComposition.attachWagonFromRight(3)
        trainComposition.attachWagonFromLeft(4)
        Assert.assertEquals(3, trainComposition.detachWagonFromRight())
        Assert.assertEquals(4, trainComposition.detachWagonFromLeft())
        Assert.assertEquals(7, trainComposition.detachWagonFromRight())
        Assert.assertEquals(6, trainComposition.detachWagonFromLeft())
        Assert.assertEquals(13, trainComposition.detachWagonFromLeft())
        Assert.assertEquals(1, trainComposition.detachWagonFromRight())
    }

}
