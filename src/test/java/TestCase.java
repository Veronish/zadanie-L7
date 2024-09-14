import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.Main.Factorial;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestCase {
    @Test
    @DisplayName("Факториал 5")
    void test1() {
        assumeTrue(Factorial(5) == 120);
    }

    @Test
    @DisplayName("Факториал 4")
    void test2() {
        assertEquals(Factorial(4), 24);
    }

    @Test
    @DisplayName("Факториал 0")
    void test3() {
        assumeTrue(Factorial(0) == 1);
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void test4(int a) {
        assertEquals(Factorial(a), 120, () -> "Факториал не = 5");
    }


}
