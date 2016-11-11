package com.sandlex.trykotlin

import org.junit.Before;
import org.junit.*

/**
 * A TrainComposition is built by attaching and detaching wagons from the left and the right sides.
 *
 * For example, if we start by attaching wagon 7 from the left followed by attaching wagon 13, again from the left,
 * we get a composition of two wagons (13 and 7 from left to right). Now the first wagon that can be detached from
 * the right is 7 and the first that can be detached from the left is 13.
 *
 * Implement a TrainComposition that models this problem.
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
