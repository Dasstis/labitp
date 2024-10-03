package org.example;

public class Main {
    public static void main(String[] args) {
      //

        String[][] array = {
                {"103343", "103", "112", "115"},
                {"218", "224", "234", "284"},
                {"38", "29", "3743", "3978"},
//                {"38", "25", "3743", "3978"},
                {"48", "44", "101", "4199"},
        };

        try {
            if (check(array)) System.out.println("Сумма всех элементов: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    static int sum = 0;
    static int s = 0;

    public static boolean check(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) throw new MyArraySizeException("Массив не 4x4. Одумайся!");

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) throw new MyArraySizeException("Массив не 4x4. Одумайся!");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    if (!(array[i][j].matches("(?ui:[0-9]+)")))
                        s = Integer.valueOf(array[i][j]);
                    if (array[i][j].length() > 10000) throw new MyArrayDataException(i, j, array[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int value = Integer.valueOf(array[i][j]);
                    sum += value; // Добавляем значение к общей сумме
    if (isPrime(value)) {
        throw new MySimleException(i, j, array[i][j]);
    }
                } catch (MySimleException e) {
                    e.printStackTrace();
                }
            }
        }

        return true;
    }

    // Метод для проверки, является ли число простым
    public static boolean isPrime(int number) {
        if (number <= 1) return false; // Простыми считаются числа больше 1
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false; // Если число делится на i, оно не простое
        }
        return true; // Число простое
    }
}









