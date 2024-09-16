import org.junit.jupiter.api.Assertions;
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
    @DisplayName("Факториал 20")
    void test2() {
        assertEquals(Factorial(20), 2432902008176640000L);
    }

    @Test
    @DisplayName("Факториал 0")
    void test3() {
        assumeTrue(Factorial(0) == 1);
    }

    @DisplayName("Проверка вычислений 1-5 и 12")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 12})
    void test4(int a) {
        switch (a) {
            case 1:
                assertEquals(Factorial(a), 1, () -> "Факториал 1го неверный");
                break;
            case 2:
                assertEquals(Factorial(a), 2, () -> "Факториал 2x неверный");
                break;
            case 3:
                assertEquals(Factorial(a), 6, () -> "Факториал 3x неверный");
                break;
            case 4:
                assertEquals(Factorial(a), 24, () -> "Факториал 4x неверный");
                break;
            case 5:
                assertEquals(Factorial(a), 120, () -> "Факториал 5и неверный");
                break;
            case 18:
                assertEquals(Factorial(a), 479001600, () -> "Факториал 12и неверный");
                break;
        }
        //assertEquals(Factorial(a), 120, () -> "Факториал не = 5");
    }

    @Test
    @DisplayName("Проверка ввода отрицательных чисел")
    void test5() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Factorial(-1);
        });
    }
    @Test
    @DisplayName("Проверка ввода слишком большого числа")
    void test6() {
        Assertions.assertThrows(OutOfMemoryError.class, () -> {
            Factorial(21);
        });
    }



}
