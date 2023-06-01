import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lukaswais.Calculator;

public class CalculatorTest {
    @Test
    void testAdd() {
        double result = Calculator.add(2.5, 3.7);
        Assertions.assertEquals(6.2, result, 0.0001);
    }

    @Test
    void testSubtract() {
        Assertions.assertEquals(5, Calculator.subtract(10, 5));
    }

    @Test
    void testMultiply() {
        Assertions.assertEquals(50, Calculator.multiply(10, 5));
//        Assertions.fail("Test not implemented");
    }

    @Test
    void testDivide() {
        Assertions.assertEquals(10, Calculator.divide(50, 5));
    }

    /**
     * checks if the correct exception is thrown.
     */
    @Test
    void testDivideByZeroException() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(10, 0);
        });

    }

    /**
     * checks if the correct error message is thrown
     */
    @Test
    void testDivideByZeroExceptionMessage() {
        ArithmeticException exception =  Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(10, 0);
        });
        Assertions.assertTrue(exception.getMessage().equals("Cannot divide by zero"));
    }
}