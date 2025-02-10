# Kotlin-Java Interoperability

This is a small public project containing all the examples given in the Kotlin-Java interoperability presentation.

## Based on

- [Java-Kotlin Interop](https://kotlinlang.org/docs/java-interop.html)
- [Interop](https://developer.android.com/kotlin/interop)
- [Jvm-Static](https://www.baeldung.com/kotlin/jvmstatic-annotation)

## Little information on the JVM

Java Virtual Machine: It is a virtual machine designed to run applications, created with the "write once, run anywhere" mentality. 

Running on the JVM involves the following steps:

1. Compilation to Java Byte Code (AOT): First, the Java or Kotlin compiler (javac, kotlinc) compiles the code into an intermediate form known as Java Bytecode. This bytecode is a set of platform-independent instructions that can be executed by the JVM.

2. Class Loader: The JVM uses a class loader to load the compiled bytecode (.class files) into memory. The class loader is responsible for finding and loading these classes into the JVM.

3. Bytecode Verification: Before execution, the JVM verifies the bytecode to ensure it is valid and does not violate Java's security constraints. This step helps prevent malicious code from causing harm.

4. Just-In-Time Compilation (JIT): The JVM includes a Just-In-Time (JIT) compiler that converts bytecode into native machine code specific to the underlying hardware. This machine code is then executed directly by the CPU. The JIT compiler optimizes the code during runtime, improving performance. JIT means the code is being compiled at the same time the program is running.

5. Execution: The JVM executes the native machine code, running your Java program. The JVM also includes a garbage collector, which automatically manages memory by reclaiming memory used by objects that are no longer needed.

# Calling Java from Kotlin

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

## Methods that return "Void"

If a method in Java returns "void," once called by Kotlin, it will return "Unit." If that return value is used in Kotlin, it will be assigned the value "Unit" by default, because the compiler will know by default that the function returns "void."

### Java: 
![carbon (6)](https://github.com/user-attachments/assets/8257e88e-f287-49f5-9954-c1de6f5cf856)

### Kotlin:
![carbon (7)](https://github.com/user-attachments/assets/d72c6300-58fd-4835-b28f-2bba29bb9a93)

## Identifiers in Java that are keywords in Kotlin

Some of Kotlin's keywords are valid identifiers in Java: in, object, is, and others. If a Java library uses a Kotlin keyword for a method, you can still call the method by escaping it with the backtick character (`). As a note, it is considered a best practice not to use any of Kotlin's strict keywords as method or field names.

### Java:
![carbon (8)](https://github.com/user-attachments/assets/f7311988-784d-4335-892a-50de3fca1196)

### Kotlin:
![carbon (9)](https://github.com/user-attachments/assets/74d44e66-bf34-4896-9288-f8e4fd41b50d)

## Strict Null Safety

Any reference in Java can be null, which makes Kotlin's requirement for "strict null safety" impractical for objects coming from Java.

Java declaration types are treated in Kotlin in a specific way and are called platform types.

### What are "Platform Types"?

Platform types are types that the Kotlin compiler infers from Java code and may have an unknown or unspecified nullability. Essentially, platform types can be treated as nullable or non-nullable in Kotlin.

Null checks are relaxed for these types, so the safety guarantees for them are the same as in Java.

### Java:
![carbon (10)](https://github.com/user-attachments/assets/17c6a03a-4b4e-4319-876c-3d08b38d9b37)

### Kotlin: 
![carbon (11)](https://github.com/user-attachments/assets/bf90d234-8f23-4e59-8ff6-c0a4cb123f29)

## Specifying nullability using annotations

Java types that have nullability annotations are not represented as platform types, but rather as actual Kotlin types that either accept nulls or not. The compiler supports various types of nullability annotations. Specifying nullability through annotations is indeed considered a best practice.

### Java:
![carbon (12)](https://github.com/user-attachments/assets/51aa151c-2b80-4cbb-8a24-bd5ff3862ae3)

### Kotlin:
![carbon (13)](https://github.com/user-attachments/assets/5a8f79b7-beb1-4ed7-8b56-c13154711f10)

# Calling Kotlin from Java

## Renaming Functions

When using Kotlin, you can rename the function name when consumed from Java using the @JvmName annotation. This is necessary due to the idiomatic differences between both languages.

### Kotlin:
![carbon (14)](https://github.com/user-attachments/assets/34402879-de63-4439-8298-de3b191b3dce)

### Java:
![carbon (15)](https://github.com/user-attachments/assets/506b0ef7-3f15-4f1e-a07d-29d14772a08a)

A good practice is to use the similar annotation @file:JvmName when having top-level functions or properties to provide a nice name. This is because having a file named "MyClass.kt" would result in a class called "MyClassKt"

### Kotlin
![carbon (16)](https://github.com/user-attachments/assets/f348984b-57fd-4a8b-b067-585f9c7e8ab1)

### Java: 
![carbon (17)](https://github.com/user-attachments/assets/76de890e-4abb-4ff8-aea8-e791bda869da)

## Overloading Methods with Default Values

When having functions with parameters with default values, it is likely that we will need to generate method overloads to cover the different use cases from Java. For this, we can use the @JvmOverloads annotation, which will generate the overload methods.

### Kotlin: 
![carbon (18)](https://github.com/user-attachments/assets/14f8dc72-006e-48fe-aa52-ee9d8f48bed9)

### Java:
![carbon (19)](https://github.com/user-attachments/assets/cfcbac01-f696-4a4b-971a-004ff41be659)

## Exposing properties as fields of a class

To expose a property as a field and avoid the generation of "getter/setter" methods, we can implement the @JvmField annotation.

### Kotlin:
![carbon (20)](https://github.com/user-attachments/assets/60dd7747-7c1f-4e2c-9e21-723d7851eb87)

### Java:
![carbon (21)](https://github.com/user-attachments/assets/c024b715-0240-4e7e-a88d-8e962eeb0cd0)

Additionally, this annotation is used to expose public "non-constant" properties that are effectively constant in a "companion object" as static fields.

Without the annotation, these properties are only available as instance "getters" with strange names in the static companion field. On the other hand, using @JvmStatic instead of @JvmField moves the oddly named "getters" to static methods in the class, which should also be avoided.

### With no annotation

### Kotlin:
![carbon (22)](https://github.com/user-attachments/assets/03704a2a-a9b2-452c-adb3-3cbe6bb292f3)

### Java: 
![carbon (24)](https://github.com/user-attachments/assets/480fe4ad-95da-4d37-b367-79bd7a4babbc)

### With @JvmStatic annotation

### Kotlin:
![carbon (23)](https://github.com/user-attachments/assets/24598bde-fbfc-4b09-9d15-208b29baccc4)

### Java:
![carbon (25)](https://github.com/user-attachments/assets/efebc695-e422-4d63-9d29-895619191690)

### With @JvmField annotation

### Kotlin:
![carbon (26)](https://github.com/user-attachments/assets/8b826b35-9608-47f5-9c66-0bf9e0d37242)

### Java:
![carbon (27)](https://github.com/user-attachments/assets/1347a7f2-b917-41ad-8983-8c9bebb98679)

## What is the @JvmStatic Annotation?

@JvmStatic is used to indicate that a method within a companion object, an object declaration, or a named object should be generated as a static method in the Java bytecode. This makes it easier to call these methods from Java, as they appear as normal static methods.

When using the @JvmStatic annotation, the Kotlin compiler generates additional static methods in the companion object or object declaration, making them accessible in a static context from Java, instead of being compiled as instance methods.

### Without

### Kotlin:
![carbon (28)](https://github.com/user-attachments/assets/56e80450-1760-4b87-b437-ec80282f1da2)

### Java:
![carbon (30)](https://github.com/user-attachments/assets/03f90666-0ef9-4528-ad17-922648e39402)

### With

### Kotlin:
![carbon (29)](https://github.com/user-attachments/assets/6d54d965-065c-4cf9-935b-28ba87f04e4f)

### Java:
![carbon (31)](https://github.com/user-attachments/assets/5083581c-f3cd-4c92-9925-5e71a6acd577)

