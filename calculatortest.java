import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10.0, calculator.add(5, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(5.0, calculator.subtract(10, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(25.0, calculator.multiply(5, 5));
    }

    @Test
    void testDivide() {
        assertEquals(5.0, calculator.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}