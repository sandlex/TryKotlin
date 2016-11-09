package com.sandlex.trykotlin

import com.sandlex.trykotlin.BinarySearchTree.Node
import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 *
 * author: Alexey Peskov
 */
class BinarySearchTreeTest {

    lateinit var binarySearchTree: BinarySearchTree

    @Before
    fun createBinarySearchTree() {
        binarySearchTree = BinarySearchTree()
    }

    @Test
    fun testSearchShort() {
        val n1 = Node(1, null, null)
        val n3 = Node(3, null, null)
        val n2 = Node(2, n1, n3)

        Assert.assertTrue(binarySearchTree.contains(n2, 3))
        Assert.assertTrue(binarySearchTree.contains(n2, 1))
        Assert.assertTrue(binarySearchTree.contains(n1, 1))
        Assert.assertFalse(binarySearchTree.contains(n2, 7))
    }

    @Test
    fun testSearchLong() {
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

        Assert.assertTrue(binarySearchTree.contains(n13, 11))
        Assert.assertTrue(binarySearchTree.contains(n9, 12))
        Assert.assertFalse(binarySearchTree.contains(n7, 9))
    }
}