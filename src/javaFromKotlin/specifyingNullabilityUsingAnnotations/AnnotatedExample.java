package javaFromKotlin.specifyingNullabilityUsingAnnotations;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AnnotatedExample {

    @Nullable
    private String nullableField;

    @NotNull
    private String nonNullableField = "Default";

    // Getter for nullableField
    @Nullable
    public String getNullableField() {
        return nullableField;
    }

    // Setter for nullableField
    public void setNullableField(@Nullable String nullableField) {
        this.nullableField = nullableField;
    }

    // Getter for nonNullableField
    @NotNull
    public String getNonNullableField() {
        return nonNullableField;
    }

    // Setter for nonNullableField
    public void setNonNullableField(@NotNull String nonNullableField) {
        this.nonNullableField = nonNullableField;
    }
}

