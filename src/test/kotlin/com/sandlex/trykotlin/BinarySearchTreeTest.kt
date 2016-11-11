package com.sandlex.trykotlin

import org.junit.Assert
import org.junit.Test

/**
 * Binary search tree (BST) is a binary tree where the value of each node is larger or equal to the values in all
 * the nodes in that node's left subtree and is smaller than the values in all the nodes in that node's right subtree.
 *
 * Write a function that checks if a given binary search tree contains a given value.
 */
class BinarySearchTreeTest {

    @Test
    fun testBstContainsWithCustomObjects() {
        val rect1 = Node(Rectangle(1), null, null)
        val rect3 = Node(Rectangle(3), null, null)
        val rect2 = Node(Rectangle(2), rect1, rect3)

        Assert.assertTrue(bstContains(rect2, Rectangle(3)))
        Assert.assertTrue(bstContains(rect2, Rectangle(1)))
        Assert.assertTrue(bstContains(rect1, Rectangle(1)))
        Assert.assertFalse(bstContains(rect2, Rectangle(7)))
    }

    @Test
    fun testBstContainsWithIntShort() {
        val n1 = Node(1, null, null)
        val n3 = Node(3, null, null)
        val n2 = Node(2, n1, n3)

        Assert.assertTrue(bstContains(n2, 3))
        Assert.assertTrue(bstContains(n2, 1))
        Assert.assertTrue(bstContains(n1, 1))
        Assert.assertFalse(bstContains(n2, 7))
    }

    @Test
    fun testBstContainsWithIntLong() {
        val n2 = Node(2, null, null)
        val n6 = Node(6, null, null)
        val n8 = Node(8, null, null)
        val n10 = Node(10, null, null)
        val n12 = Node(12, null, null)
        val n14 = Node(14, null, null)
        val n20 = Node(20, null, null)
        val n4 = Node(4, n2, n6)
        val n7 = Node(7, n4, n8)
        val n11 = Node(11, n10, n12)
        val n9 = Node(9, n7, n11)
        val n16 = Node(16, n14, n20)
        val n13 = Node(13, n9, n16)

        Assert.assertTrue(bstContains(n13, 11))
        Assert.assertTrue(bstContains(n9, 12))
        Assert.assertFalse(bstContains(n7, 9))
    }
}