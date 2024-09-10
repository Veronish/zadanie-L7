
public class Main {
    public static void main(String[] args) {

        String[][] array1 = {
                {"7", "8", "9", "10"},
                {"6", "1", "2", "11"},
                {"5", "4", "3", "12"},
                {"16", "15", "14", "13"}
        };
        String[][] array2 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13"}
        };
        String[][] array3 = {
                {"16", "15", "14", "13"},
                {"12", "11", "10", "9"},
                {"8", "#", "6", "5"},
                {"4", "3", "2", "1"}
        };
        try {
            System.out.println("Sum array 1: " + classArraySum(array1) + ".\n");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Sum array 2: " + classArraySum(array2) + ".\n");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Sum array 3: " + classArraySum(array3) + ".\n");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }


    }


    public static int classArraySum(String[][] array) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;
        if (array.length != 4) throw new MyArraySizeException();
        for (int i = 0; i < 4; i++) {
            if (array[i].length != 4) throw new MyArraySizeException();
            for (int j = 0; j < 4; j++) {
                try {
                    sum = sum + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }

}

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

class MyArrayDataException extends MyException {

    MyArrayDataException(int row, int col) {
        super(String.format("\nНеверные данные находятся в ячейке [%d, %d]\n", row, col));
    }
}

class MyArraySizeException extends MyException {

    MyArraySizeException() {
        super("\nРазмерность массива должна быть [4 x 4]\n");
    }
}
