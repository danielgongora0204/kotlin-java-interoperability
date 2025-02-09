package kotlinFromJava.methodOverload;

/**
 * When having functions with parameters with default values, it is likely that we will need
 * to generate method overloads to cover the different use cases from Java. For this,
 * we can use the @JvmOverloads annotation, which will generate the overload methods.
 */
public class Main {
    public static void main(String[] args) {
        MethodOverload example = new MethodOverload();
        example.greet();
        example.greet("Hi there");
    }
}
