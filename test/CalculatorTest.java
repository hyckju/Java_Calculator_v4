import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @org.junit.jupiter.api.Test
    void testAdd() {
        Calculator calc = new Calculator();
        calc.setNumbers(10, 20);
        assertEquals(30, calc.add());
    }

    @Test
    void testSubtract() {
        Calculator calc = new Calculator();
        calc.setNumbers(20, 10);
        assertEquals(10, calc.subtract());
    }

    @Test
    void testMultiply() {
        Calculator calc = new Calculator();
        calc.setNumbers(2, 1);
        assertEquals(2, calc.multiply());
    }

    @Test
    void testDivide() {
        Calculator calc = new Calculator();
        calc.setNumbers(4, 2);
        assertEquals(2, calc.divide());
    }
}