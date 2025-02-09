package javaFromKotlin.reservedWordsInKotlin

/**
 * Some of Kotlin's keywords are valid identifiers in Java: in, object, is, and others.
 * If a Java library uses a Kotlin keyword for a method, you can still call the method
 * by escaping it with the backtick character (`). As a note, it is considered a best
 * practice not to use any of Kotlin's strict keywords as method or field names.
 */
fun main() {
    val example = KeywordExample()

    // Calling Java methods with Kotlin keywords using backticks
    example.`in`() // Calls in() method
    example.`object`() // Calls object() method
    example.`is`() // Calls is() method
}