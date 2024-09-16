import jdk.jfr.Description;
import org.testng.annotations.Test;

import static org.example.Main.Factorial;
import static org.testng.Assert.assertEquals;

public class TestCases {


    @Test()
    @Description("Первый тест")
    void test1() {
        assertEquals(Factorial(1), 1);
        assertEquals(Factorial(2), 2);
        assertEquals(Factorial(3), 6);
        assertEquals(Factorial(4), 24);
        assertEquals(Factorial(5), 120);

    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    void test2() {
        System.out.println(Factorial(-2));
    }

    @Test(expectedExceptions = OutOfMemoryError.class)
    void test3() {
        System.out.println(Factorial(22));
    }

    @Test
    void test4() {
        assertEquals(Factorial(0), 1);
    }

    @Test
    void test5() {
        assertEquals(Factorial(20), 2432902008176640000L);
    }


}
