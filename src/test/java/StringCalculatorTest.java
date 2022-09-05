import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringCalculatorTest {



    @Test
    void returns_0_with_empty_string() {
        assertEquals(0, new StringCalculator().add(""));
    }
}