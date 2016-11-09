package com.sandlex.trykotlin

/**
 *
 * author: Alexey Peskov
 */
class BinarySearchTree {

    class Node(var value: Int, var left: Node?, var right: Node?)

    fun contains(root: Node?, value: Int): Boolean {
        if (root == null) {
            return false
        }
        if (root.value == value) {
            return true
        } else if (value < root.value) {
            return contains(root.left, value)
        }

        return contains(root.right, value)
    }
}