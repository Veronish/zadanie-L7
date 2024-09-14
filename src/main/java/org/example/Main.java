package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(Factorial(4));
    }

    public static int Factorial(int factorial) {
        int j = factorial;
        factorial = 1;
        for (int i = 1; i <= j; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

}
