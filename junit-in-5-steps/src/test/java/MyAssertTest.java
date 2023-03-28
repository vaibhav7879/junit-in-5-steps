import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;  // this is add for assert() functions
import java.util.Arrays;
import java.util.List;

public class MyAssertTest {

    List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

    @Test
    void testAsserts() {
        boolean test = todos.contains("AWS");//Result
        boolean test2 = todos.contains("GCP");//Result

        assertEquals(true, test , "what has gone wrong");

        assertTrue(test, "what has gone wrong");
        assertFalse(test2);

        //assertNull,assertNotNull
        assertArrayEquals(new int[] {2,1}, new int[] {2, 1} , "what has gone wrong");

        assertEquals(3, todos.size());
    }

}