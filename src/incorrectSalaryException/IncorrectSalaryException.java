package incorrectSalaryException;

public class IncorrectSalaryException  extends Exception {
    public String toString() {
        return "ERROR !!! Salary must be positive number !!!";
    }
}
