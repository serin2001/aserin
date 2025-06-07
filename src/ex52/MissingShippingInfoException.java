package ex52;

public class MissingShippingInfoException extends RuntimeException {
    public MissingShippingInfoException(String message) {
        super(message);
    }
}
