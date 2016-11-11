package com.sandlex.trykotlin

import org.junit.Assert
import org.junit.Test

/**
 * Implement function countNumbers that accepts a sorted array of integers and counts the number of array elements
 * that are less than the parameter lessThan.
 */
class SortedSearchTest {
    @Test
    fun testCountNumbers() {
        Assert.assertEquals(2, countNumbers(intArrayOf(1, 3, 5, 7), 4))
        Assert.assertEquals(4, countNumbers(intArrayOf(1, 3, 5, 7), 8))
        Assert.assertEquals(0, countNumbers(intArrayOf(1, 3, 5, 7), 0))
    }
}