package by.olehno.array.exception;

public class ReaderException extends Exception {
    public ReaderException() {
    }

    public ReaderException(String message, Throwable cause) {
        super(message, cause);

    }

    public ReaderException(String message) {
        super(message);
    }

    public ReaderException(Throwable cause) {
        super(cause);
    }
}
