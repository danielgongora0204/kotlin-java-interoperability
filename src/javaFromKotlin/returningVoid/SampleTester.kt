package javaFromKotlin.returningVoid

/**
 * If a method in Java returns "void," once called by Kotlin, it will return "Unit."
 * If that return value is used in Kotlin, it will be assigned the value "Unit" by default,
 * because the compiler will know by default that the function returns "void."
 */
fun main() {
    val sample = Sample()

    // Calling Java methods that return void
    sample.printMessage("Hello from Java!") // Calls printMessage and returns Unit
    val result1: Unit = sample.printMessage("This is another message") // Assigning Unit explicitly

    sample.doNothing() // Calls doNothing and returns Unit
    val result2: Unit = sample.doNothing() // Assigning Unit explicitly

    // Printing the Unit values
    println(result1) // Output: kotlin.Unit
    println(result2) // Output: kotlin.Unit
}