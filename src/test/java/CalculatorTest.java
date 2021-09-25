import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = null;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    /*
     * Unit Tests practice :
     *
     * We create first a method to test tha actual behaviour of our Application : in the 'add()' method in Calculator we don't implement any code, just return 0
     *
     * Refactoring the three laws of TDD :
     *
     * - You are not allowed to write any production code unless it is to make a failing unit test pass.
     * - You are not allowed to write any more of a unit test than is sufficient to fail; and compilation failures are failures.
     * - You are not allowed to write any more production code than is sufficient to pass the one failing unit test.
     */
    @Test
    void shouldReturnSumOfTwoNumber2And5As7() {
        int sum = calculator.add(2, 5);
        Assertions.assertEquals(7, sum);
    }

    @Test
    void shouldReturn2When10DividedBy5() {
        double value = calculator.divide(10, 5);
        Assertions.assertEquals(2, value);
    }

    @Test
    void shouldReturnArithmeticExceptionWhenDividedBy0() {
        ArithmeticException arithmeticException = Assertions
                .assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));

        Assertions.assertEquals("Can not divide by 0", arithmeticException.getMessage());
    }
}
