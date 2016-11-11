package com.sandlex.trykotlin

class Node(var value: Int, var left: Node?, var right: Node?)

fun bstContains(root: Node?, value: Int): Boolean {
    if (root == null) {
        return false
    }
    if (root.value == value) {
        return true
    } else if (value < root.value) {
        return bstContains(root.left, value)
    }

    return bstContains(root.right, value)
}