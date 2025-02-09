package javaFromKotlin.gettersAndSetters

/**
 * Methods that follow the convention for getters and setters are represented as properties
 * in Kotlin; these are called synthetic properties. Boolean access methods (where the
 * getter's name starts with 'is' and the setter's name starts with 'set') are represented
 * as properties that have the same name as the getter method.
 */
fun main() {
    val person = Person()

    // Using synthetic properties to call Java getter and setter methods
    person.name = "John Doe" // calls setName("John Doe")
    println(person.name) // calls getName()

    person.isEmployed = true // calls setEmployed(true)
    println(person.isEmployed) // calls isEmployed()
}