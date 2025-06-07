package ex52;

public class InvalidShippingInfoException extends RuntimeException {
    public InvalidShippingInfoException(String message) {
        super(message);
    }
}