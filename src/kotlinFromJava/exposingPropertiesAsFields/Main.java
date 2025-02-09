package kotlinFromJava.exposingPropertiesAsFields;

/**
 * To expose a property as a field and avoid the generation of "getter/setter"
 * methods, we can implement the @JvmField annotation.
 */
public class Main {
    public static void main(String[] args) {
        ExposingPropertiesAsFields example = new ExposingPropertiesAsFields();
        System.out.println(example.myField);
    }
}
