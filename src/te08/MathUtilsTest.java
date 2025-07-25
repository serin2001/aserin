// BeforeAll importieren
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
	// Any instance variables (like mathUtils) that you want to initialize in @BeforeAll method must also be static
    private static MathUtils mathUtils;

    @BeforeAll
    public static void setup() {	// should be static because it is annotated with @BeforeAll
        mathUtils = new MathUtils();
    }

    @Test	// Added @Test annotations to all test methods to ensure they are recognized as test cases
    public void testAdd() {
        int expected = 5;
        int result = mathUtils.add(2, 3);
        // Changed assertEquals(expected == result) to assertEquals(expected, result) to correctly compare the expected and actual values
        assertEquals(expected, result);
    }

    @Test
    public void testDivideByZero() {
    	// Wrapped the method call in a lambda expression to correctly assert that an exception is thrown
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(10, 0));
    }

    @Test
    public void testMultiply() {
        int result = mathUtils.multiply(3, 4);
        assertEquals(12, result);
    }

    @Test
    public void testNull() {
    	// Changed assertNull(mathUtils) to assertNotNull(mathUtils) to check that mathUtils is initialized properly
        assertNotNull(mathUtils);
    }
}