import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName( "suma dos metodos")
    void add() {
        assertTrue(6>Calculator.add(2,2));
    }

    @Test
    void multiply() {
        assertAll(
                ()->assertEquals(4,Calculator.multiply(2,2)),
                ()->assertEquals(18,Calculator.multiply(9,2)),
                ()->assertEquals(9,Calculator.multiply(3,3))
        );


    }
}