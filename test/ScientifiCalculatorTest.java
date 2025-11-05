import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScientifiCalculatorTest {
    ScientifiCalculator sci;

    @BeforeEach
    void setUp() {
        sci = new ScientifiCalculator();
        sci.setNumbers(4, 2);
    }

    @Test
    void testPower() {
        assertEquals(16, sci.power());
    }
}