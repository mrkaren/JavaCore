package core.lesson16;

public class MyException extends Exception {

    private String errorCode;

    public MyException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "errorCode='" + errorCode + '\'' +
                '}';
    }
}
