import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = "FizzBuzz";

    // Test the "starts with f" case first - this should pass.
    @Test
    void Fizz_when_input_starts_with_f() {
        assertEquals(FIZZ, fizzBuzz.fizzBuzzString("fizz"));
    }

    // Test the "ends with b" case - this should also pass.
    @Test
    void Buzz_when_input_starts_with_b() {
        assertEquals(BUZZ, fizzBuzz.fizzBuzzString("b"));
    }

    // Test the "starts with f and ends with b" case - this will not pass.
    @Test
    void FizzBuzz_when_input_starts_with_f_and_ends_with_b() {
        assertEquals(FIZZ_BUZZ, fizzBuzz.fizzBuzzString("fb"));
    }

    // Add a test for when str is null - this will not pass.
    @Test
    void null_when_input_is_null() {
        assertNull(fizzBuzz.fizzBuzzString(null));
    }
}
