package javaFromKotlin.strictNullSecurity

/**
 * Any reference in Java can be null, which makes Kotlin's requirement for "strict null
 * safety" impractical for objects coming from Java.
 *
 * Java declaration types are treated in Kotlin in a specific way and are called
 * platform types.
 */
fun main() {
    // Creating an instance of the Java class
    val javaExample = StrictNullExample(null)

    // Accessing the nullable property from Java class
    // Since the type is a platform type, Kotlin relaxes the null-checks
    val message: String? = javaExample.message

    // Using the property in a safe manner
    if (message != null) {
        println("Message: $message")
    } else {
        println("Message is null")
    }

    // Using the safe call operator to avoid NPE
    println("Message length: ${message?.length}")

    // Forcing a null-check (can cause NPE)
    try {
        println("Message length (unsafe): ${javaExample.message.length}")
    } catch (e: NullPointerException) {
        println("Caught NullPointerException")
    }
}