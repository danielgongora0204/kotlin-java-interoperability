package kotlinFromJava.staticMethodGeneration;

/**
 * @JvmStatic is used to indicate that a method within a companion object, an object
 * declaration, or a named object should be generated as a static method in the Java
 * bytecode. This makes it easier to call these methods from Java, as they appear as
 * normal static methods.
 * <p>
 * When using the @JvmStatic annotation, the Kotlin compiler generates additional static
 * methods in the companion object or object declaration, making them accessible in a
 * static context from Java, instead of being compiled as instance methods.
 */
public class Main {
    public static void main(String[] args) {
        //region Without Annotation
        WithoutAnnotation.Companion.sayHello();
        //endregion

        //region With Annotation
        WithAnnotation.sayHello();
        //endregion
    }
}
