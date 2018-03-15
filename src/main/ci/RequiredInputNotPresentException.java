package ci;

public class RequiredInputNotPresentException extends Exception {

    public RequiredInputNotPresentException(String message) {
        super(message);
    }
}
