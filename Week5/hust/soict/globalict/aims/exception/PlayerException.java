package soict.globalict.aims.exception;

public class PlayerException extends Exception {
    public PlayerException() {
        super();
    }
    public PlayerException(String s) {
        super();
        System.err.println(s);
    }
}
