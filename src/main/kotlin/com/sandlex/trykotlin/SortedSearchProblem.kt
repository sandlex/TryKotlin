package com.sandlex.trykotlin

/**
 * Implements a binary search algorithm (like in Arrays.binarySearch) for specific problem
 *
 * author: Alexey Peskov
 */
fun countNumbers(sortedArray: IntArray, lessThan: Int): Int {
    var first = 0
    var last = sortedArray.size - 1

    while (first <= last) {
        val middle = (last + first) / 2

        if (sortedArray[middle] == lessThan) {
            return middle
        } else if (sortedArray[middle] < lessThan) {
            first = middle + 1
        } else {
            last = middle - 1
        }
    }

    return first
}