package javaFromKotlin.intro

import java.util.*

/**
 * Almost all Java code can be used without any problem. In the following example, we use the
 * ArrayList<T> class from java.util and iterate over it.
 */
fun main() {

    val source = listOf(1, 2, 3, 4)

    demo(source)

    println("Finished")
}

fun demo(source: List<Int>) {
    val list = ArrayList<Int>()
    // 'for'-loops work for Java collections:
    for (item in source) {
        list.add(item)
    }
    // Operator conventions work as well:
    for (i in 0..source.size - 1) {
        list[i] = source[i] // get and set are called
    }
}