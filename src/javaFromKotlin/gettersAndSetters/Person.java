package javaFromKotlin.gettersAndSetters;

public class Person {
    private String name;
    private boolean isEmployed;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for isEmployed (boolean)
    public boolean isEmployed() {
        return isEmployed;
    }

    // Setter for isEmployed
    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }
}
