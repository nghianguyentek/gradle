import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest {

    private final Calculator testedObject = new Calculator();

    @Nested
    class AddTest {

        @Test
        @DisplayName("success")
        void addOK() {
            int a = 10, b = 20, sum = a + b;
            assertEquals(sum, testedObject.add(a, b));
        }

    }

}