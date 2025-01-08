package lesson9.exc;

public class BetTooBigExc extends RuntimeException {

    private String errorMessage;

    public BetTooBigExc(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
