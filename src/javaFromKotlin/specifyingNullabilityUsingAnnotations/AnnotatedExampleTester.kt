package javaFromKotlin.specifyingNullabilityUsingAnnotations

/**
 * Java types that have nullability annotations are not represented as platform types,
 * but rather as actual Kotlin types that either accept nulls or do not. The compiler
 * supports various types of nullability annotations. Specifying nullability through
 * annotations is indeed considered a best practice.
 *
 */
fun main() {
    val example = AnnotatedExample()

    // Accessing the nullable field (annotated with @Nullable)
    val nullableField: String? = example.nullableField
    if (nullableField != null) {
        println("Nullable field is not null: $nullableField")
    } else {
        println("Nullable field is null")
    }

    // Accessing the non-nullable field (annotated with @NotNull)
    val nonNullableField: String = example.nonNullableField
    println("Non-nullable field: $nonNullableField")

    // Setting values
    example.nullableField = null // Allowed, since it is nullable
    example.nonNullableField = "New Value" // Must be non-null
}