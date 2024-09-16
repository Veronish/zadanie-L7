package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(Factorial(2));
    }

    public static long Factorial(long factorial) {

        if (factorial < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным");
        }
        if (factorial > 20) {
            throw new OutOfMemoryError("Невозможно вычисличть факториал больше 20");
        }

        long j = factorial;
        factorial = 1;
        for (int i = 1; i <= j; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

}
