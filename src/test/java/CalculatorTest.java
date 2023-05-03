import org.firstAndSecond.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();

        calculator.setmFirstNumber(1);
        calculator.setmSecondNumber(1);
        assertEquals(2, calculator.sum());

        calculator.setmFirstNumber(1.6);
        calculator.setmSecondNumber(1.4);
        assertEquals(3, calculator.sum());

        calculator.setmFirstNumber(10);
        calculator.setmSecondNumber(-10);
        assertEquals(0, calculator.sum());

        calculator.setmFirstNumber(-100);
        calculator.setmSecondNumber(110);
        assertEquals(10, calculator.sum());

        calculator.setmFirstNumber(0);
        calculator.setmSecondNumber(0);
        assertEquals(0, calculator.sum());

        calculator.setmFirstNumber(-5);
        calculator.setmSecondNumber(0);
        assertEquals(-5, calculator.sum());

        calculator.setmFirstNumber(0);
        calculator.setmSecondNumber(50.3);
        assertEquals(50.3, calculator.sum());
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();

        calculator.setmFirstNumber(1);
        calculator.setmSecondNumber(1);
        assertEquals(0, calculator.subtract());

        calculator.setmFirstNumber(1.6);
        calculator.setmSecondNumber(1.4);
        assertEquals(0.2, calculator.subtract());

        calculator.setmFirstNumber(10);
        calculator.setmSecondNumber(-10);
        assertEquals(20, calculator.subtract());

        calculator.setmFirstNumber(-100);
        calculator.setmSecondNumber(110);
        assertEquals(-210, calculator.subtract());

        calculator.setmFirstNumber(0);
        calculator.setmSecondNumber(0);
        assertEquals(0, calculator.subtract());

        calculator.setmFirstNumber(-5);
        calculator.setmSecondNumber(0);
        assertEquals(-5, calculator.subtract());

        calculator.setmFirstNumber(0);
        calculator.setmSecondNumber(50.3);
        assertEquals(-50.3, calculator.subtract());
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();

        calculator.setmFirstNumber(1);
        calculator.setmSecondNumber(1);
        assertEquals(1, calculator.multiply());

        calculator.setmFirstNumber(1.6);
        calculator.setmSecondNumber(1.4);
        assertEquals(2.24, calculator.multiply());

        calculator.setmFirstNumber(10);
        calculator.setmSecondNumber(-10);
        assertEquals(-100, calculator.multiply());

        calculator.setmFirstNumber(-100);
        calculator.setmSecondNumber(110);
        assertEquals(-11000, calculator.multiply());

        calculator.setmFirstNumber(0);
        calculator.setmSecondNumber(0);
        assertEquals(0, calculator.multiply());

        calculator.setmFirstNumber(-5);
        calculator.setmSecondNumber(0);
        assertEquals(0, calculator.multiply());

        calculator.setmFirstNumber(0);
        calculator.setmSecondNumber(50.3);
        assertEquals(0, calculator.multiply());
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();

        calculator.setmFirstNumber(1);
        calculator.setmSecondNumber(1);
        assertEquals(1, calculator.divide());

        calculator.setmFirstNumber(1.6);
        calculator.setmSecondNumber(1.4);
        assertEquals(1.142857142857143, calculator.divide());

        calculator.setmFirstNumber(10);
        calculator.setmSecondNumber(-10);
        assertEquals(-1, calculator.divide());

        calculator.setmFirstNumber(-100);
        calculator.setmSecondNumber(110);
        assertEquals(-0.9090909090909091, calculator.divide());

        calculator.setmFirstNumber(0);
        calculator.setmSecondNumber(50.3);
        assertEquals(0, calculator.divide());
    }

    @Test
    public void testDivisionByZeroThrowsException() {
        Calculator calculator = new Calculator();

        calculator.setmFirstNumber(0);
        calculator.setmSecondNumber(0);
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide());

        calculator.setmFirstNumber(5);
        calculator.setmSecondNumber(0);

        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide());
    }
}
