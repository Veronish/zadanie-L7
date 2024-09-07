import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(sumCheck(9, 11));
        plusOrNot(4);
        System.out.println(plusOrNotReturn(0));
        prntStrXTimes(1, "Съешь еще этих мягких французких булок и выпей чаю ");
        System.out.println(isYearLeap(104));
        task10();
        task11();
        task12();
        task13();
        System.out.println(Arrays.toString(task14(5, 6)));

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 3;

        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        int value = 666;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = -5;
        int b = 3;

        if (a >= b) {
            System.out.println("a>=b");
        } else System.out.println("a<b");
    }

    public static boolean sumCheck(int a, int b) {
        return a + b >= 10 & a + b <= 20;
    }

    public static void plusOrNot(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else System.out.println("Число отрицательное");
    }

    public static boolean plusOrNotReturn(int a) {
        return a < 0;
    }

    public static void prntStrXTimes(int x, String s) {
        for (int i = 0; i < x; i++) System.out.println(s);
    }

    public static boolean isYearLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }


    public static void task10() {
        int[] task10 = new int[]{0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0};

        System.out.println(Arrays.toString(task10));
        for (int i = 0; i < task10.length; i++) {
            if (task10[i] == 0) {
                task10[i] = 1;
            } else task10[i] = 0;
        }
        System.out.println(Arrays.toString(task10));
    }

    public static void task11() {
        int[] task11 = new int[100];
        System.out.println(Arrays.toString(task11));
        for (int i = 0; i < task11.length; i++) {
            task11[i] = i + 1;
        }
        System.out.println(Arrays.toString(task11));
    }

    public static void task12() {
        int[] task12 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(task12));
        for (int i = 0; i < task12.length; i++) {
            if (task12[i] < 6) task12[i] = task12[i] * 2;
        }
        System.out.println(Arrays.toString(task12));
    }

    public static void task13() {
        int[][] task13 = new int[5][5];
        for (int i = 0; i < task13.length; i++) {
            for (int j = 0; j < task13.length; j++) {
                if (i == j || i + j == task13.length - 1) task13[i][j] = 1;

            }
        }
        System.out.println(Arrays.deepToString(task13));
    }


    public static int[] task14(int initialValue, int len) {

        int[] arg = new int[len];
        for (int i = 0; i < len; i++) arg[i] = initialValue;
        //Arrays.fill(arg, initialValue); - можно цикл фор заменить
        return arg;
    }

}