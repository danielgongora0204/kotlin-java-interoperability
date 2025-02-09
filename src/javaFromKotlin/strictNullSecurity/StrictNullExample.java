package javaFromKotlin.strictNullSecurity;

public class StrictNullExample {
    private String message;

    // Constructor
    public StrictNullExample(String message) {
        this.message = message;
    }

    //Getter that can return null
    public String getMessage() {
        return message;
    }

    //Setter
    public void setMesssage(String message) {
        this.message = message;
    }
}
