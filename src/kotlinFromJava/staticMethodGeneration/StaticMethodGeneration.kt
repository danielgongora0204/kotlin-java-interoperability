package kotlinFromJava.staticMethodGeneration

class WithoutAnnotation {
    companion object {
        fun sayHello() {
            println("Hello from Kotlin")
        }
    }
}

class WithAnnotation {
    companion object {
        @JvmStatic
        fun sayHello() {
            println("Hello from Kotlin")
        }
    }
}