import org.junit.jupiter.api.BeforeEach; //test
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {
    ScientifiCalculator scientificCalc;
    @BeforeEach
    void setUp() {
        scientificCalc = new ScientifiCalculator();
        scientificCalc.setNumbers(10, 3);
    }
    @Test
    void log() {
        assertEquals(13 , scientificCalc.add());
    }
}