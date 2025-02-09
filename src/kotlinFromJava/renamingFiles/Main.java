package kotlinFromJava.renamingFiles;

/**
 * A good practice is to use the similar annotation @file:JvmName when having top-level
 * functions or properties to provide a nice name. This is because having a file named
 * "MyClass.kt" would result in a class called "MyClassKt.
 */
public class Main {
    public static void main(String[] args) {
        // Calling top-level functions from Kotlin
        UtilityFunctions.sayHello(); // Calls sayHello()
        int result = UtilityFunctions.add(5, 3); // Calls add(int, int)
        System.out.println("Result: " + result);
    }
}
