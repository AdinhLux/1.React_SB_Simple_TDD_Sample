public class Calculator {
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public double divide(int firstNumber, int divisor) {
        if (divisor == 0)
            throw new ArithmeticException("Can not divide by 0");
        return (double) firstNumber / divisor;
    }
}
