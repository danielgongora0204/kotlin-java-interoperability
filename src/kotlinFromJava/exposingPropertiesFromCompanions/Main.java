package kotlinFromJava.exposingPropertiesFromCompanions;

/**
 * Additionally, this annotation is used to expose public "non-constant" properties that
 * are effectively constant in a "companion object" as static fields.
 * <p>
 * Without the annotation, these properties are only available as instance "getters" with
 * strange names in the static companion field. On the other hand, using @JvmStatic instead
 * of @JvmField moves the oddly named "getters" to static methods in the class, which
 * should also be avoided.
 */
public class Main {
    public static void main(String[] args) {
        // region With No Annotation

        // Calling true constant
        System.out.println(WithNoAnnotation.INTEGER_ONE);
        // Calling effective constant in companion object
        System.out.println(WithNoAnnotation.Companion.getBIG_INTEGER_ONE());

        //endregion

        // region With @JvmStatic Annotation

        // Calling true constant
        System.out.println(WithJvmStaticAnnotation.INTEGER_ONE);
        // Calling getter static method
        System.out.println(WithJvmStaticAnnotation.getBIG_INTEGER_ONE());

        // endregion

        // region with @JvmField Annotation

        // Calling true constant
        System.out.println(WithJvmFieldAnnotation.INTEGER_ONE);
        // Calling true constant
        System.out.println(WithJvmFieldAnnotation.BIG_INTEGER_ONE);

        //endregion
    }
}
