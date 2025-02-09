# Kotlin-Java Interoperability

This is a small public project containing all the examples given in the Kotlin-Java interoperability presentation.

## Based on

- [Java-Kotlin Interop](https://kotlinlang.org/docs/java-interop.html)
- [Interop](https://developer.android.com/kotlin/interop)
- [Jvm-Static](https://www.baeldung.com/kotlin/jvmstatic-annotation)

## Intro

Almost all Java code can be used without any problem. In the following example, we use the ArrayList<T> class from java.util and iterate over it.

### Kotlin:
![carbon (2)](https://github.com/user-attachments/assets/1d1436b6-9c20-4587-aa09-a375e19076b2)

## Getters and Setters

Methods that follow the convention for getters and setters are represented as properties in Kotlin; these are called synthetic properties. Boolean access methods (where the getter's name starts with 'is' and the setter's name starts with 'set') are represented as properties that have the same name as the getter method.

### Java:
![carbon (3)](https://github.com/user-attachments/assets/1dfde22a-2e87-4064-812c-255fa1a73d4d)

### Kotlin: 
![carbon (4)](https://github.com/user-attachments/assets/e753edb5-e16e-4a28-b1c9-bf4fb424a930)
