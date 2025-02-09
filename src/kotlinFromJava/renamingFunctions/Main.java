package kotlinFromJava.renamingFunctions;

/**
 * When using Kotlin, you can rename the function name when consumed from Java using
 * the @JvmName annotation. This is necessary due to the idiomatic differences between
 * both languages.
 *
 */
public class Main {
    public static void main(String[] args) {
       RenamingFunctionsKt.renamedFunction();
    }
}
