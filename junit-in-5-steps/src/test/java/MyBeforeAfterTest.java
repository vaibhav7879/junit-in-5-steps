import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Below the junit does not maintain a order
 * test1 may run at last , so do not depend on its order
 *
 */

public class MyBeforeAfterTest {
    @BeforeAll // it will run first , before any test case will run
    static void beforeAll() {  // function must be static
        System.out.println("beforeAll");
    }

    @BeforeEach // runs before every @Test
    void beforeEach() {
        System.out.println("BeforeEach");
    }

    @Test
    void test1() {
        System.out.println("test1");
    }

    @Test
    void test2() {
        System.out.println("test2");
    }

    @Test
    void test3() {
        System.out.println("test3");
    }

    @AfterEach // runs after every @Test
    void afterEach() {
        System.out.println("AfterEach");
    }

    @AfterAll // it will run Last , after all test cases have run
    static void afterAll() { // function must be static
        System.out.println("afterAll");
    }
}