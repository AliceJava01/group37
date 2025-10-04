package homework.lesson13.task1;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException() {

    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
