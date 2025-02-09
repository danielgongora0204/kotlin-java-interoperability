package kotlinFromJava.methodOverload

class MethodOverload {
    @JvmOverloads
    fun greet(message: String = "Hello") {
        println(message)
    }
}