package com.sandlex.trykotlin

class Rectangle(var side: Int) : Comparable<Rectangle> {

    fun getSquare(): Int = side * side

    override fun compareTo(other: Rectangle): Int {
        return this.getSquare().compareTo(other.getSquare())
    }

    override fun equals(other: Any?): Boolean{
        if (this === other) return true
        if (other?.javaClass != javaClass) return false

        other as Rectangle

        if (side != other.side) return false

        return true
    }

    override fun hashCode(): Int{
        return side
    }

}

class Node<T>(var value: T, var left: Node<T>?, var right: Node<T>?)

fun <T : Comparable<T>> bstContains(root: Node<T>?, value: T): Boolean {
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