package kotlinFromJava.exposingPropertiesFromCompanions

import java.math.BigInteger

class WithNoAnnotation {
    companion object {
        const val INTEGER_ONE = 1
        val BIG_INTEGER_ONE = BigInteger.ONE
    }
}

class WithJvmStaticAnnotation {
    companion object {
        const val INTEGER_ONE = 1
        @JvmStatic val BIG_INTEGER_ONE = BigInteger.ONE
    }
}

class WithJvmFieldAnnotation {
    companion object {
        const val INTEGER_ONE = 1
        @JvmField val BIG_INTEGER_ONE = BigInteger.ONE
    }
}