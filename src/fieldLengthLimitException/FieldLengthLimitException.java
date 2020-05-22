package fieldLengthLimitException;

public class FieldLengthLimitException extends Exception {

    public String toString() {
        return "ERROR !!! Length of (sur)name must be not more then 7 symbols !!!";
    }
}
