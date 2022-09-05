import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StringCalculatorTest {


    @Test
    void returns_0_with_empty_string() {

        assertEquals(0, new StringCalculator().add(""));
    }

    @Test
    void returns_number_with_one_number() {

        assertEquals(1, new StringCalculator().add("1"));
    }

    @Test
    void returns_sum_with_two_numbers() {
        assertEquals(2, new StringCalculator().add("1,1"));
    }
    @Test
    void returns_15_with_10_and_5() {
        assertEquals(15, new StringCalculator().add("10,5"));
    }

    @Test
    void returns_sum_with_arbitrary_number_size() {
        assertEquals(6, new StringCalculator().add("1,2,3"));
    }




}