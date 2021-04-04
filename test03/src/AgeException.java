public class AgeException extends Exception {
    public AgeException() {
        super("Invalid age");
    }

    public AgeException(String error) {
        super(error);
    }
}
