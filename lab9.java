package daddy;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String msg) { super(msg); }
}

public class CustomExceptionDemo {
    static double divide(int num, int den) throws DivisionByZeroException {
        if (den == 0) throw new DivisionByZeroException("Cannot divide by zero!");
        return (double) num / den;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Result: " + divide(10, 0));
        } catch (DivisionByZeroException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
