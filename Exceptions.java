package Lesson_2;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        exceptions ();
    }

    private static void exceptions () {
        Scanner in = new Scanner(System.in);
        System.out.println ("Нужен массив 2х2. Уточните кол-во строк массива: ");
        String numberRow = in.nextLine();
        try {
            Integer.parseInt(numberRow);
        } catch (NumberFormatException e) {
            System.out.println ("Введено не число ! Конец работы.");
            return;
        }
        int numRow = Integer.parseInt(numberRow);

        System.out.println ("Уточните кол-во столбцов массива: ");
        String numberColumn = in.nextLine();
        try {
            Integer.parseInt(numberColumn);
        } catch (NumberFormatException e) {
            System.out.println ("Введено не число ! Конец работы.");
            return;
        }
        int numColumn = Integer.parseInt(numberColumn);

        // создаём массив нужной размерности
        String [][] arrayOfStrings = new String [numRow][numColumn];

        try {
            MySizeArrayException(arrayOfStrings);
        } catch (Exception e) {
            System.out.println("Передан массив неверной размерности ! Конец работы.");
            return;
        }

        // заполняем массив элементами:
        //Scanner in1 = new Scanner(System.in);
        System.out.println("Передан массив нужного размера 2х2 ! Просьба заполнить массив цифрами.");
        for (int i = 0; i < arrayOfStrings.length; i++) {
            for (int j = 0; j < arrayOfStrings[i].length; j++) {
                System.out.println("Введите цифру элемента " + (i + 1) + "-й строки " + (j + 1) + "-го столбца : ");
                arrayOfStrings[i][j] = in.nextLine();
            }
        }

        // проходим массив поэлементно, преобразовываем String в int, при ошибке return, иначе подсчёт суммы элементов:
        int sum = 0;
        boolean isNumber = true;
        for (int i = 0; i < arrayOfStrings.length; i++) {
            for (int j = 0; j < arrayOfStrings[i].length; j++) {
                isNumber = MyArrayDataException (arrayOfStrings[i][j]);
                if (!isNumber) {
                    System.out.println("Элемент массива в строке " + (i+1) + ", столбце " + (j+1) + " не является числом! Конец работы.");
                    return;
                }
                sum += Integer.parseInt(arrayOfStrings[i][j]);
            }
                if (!isNumber) return;
            }
        if (isNumber) System.out.println("Сумма всех чисел массива = " + sum);
    }

    private static void MySizeArrayException (String [][] arrayOfStrings) throws Exception {
        if (arrayOfStrings.length != 2 || arrayOfStrings[0].length != 2) {
            throw new Exception();
        }
    }

    private static boolean MyArrayDataException (String number) {
        boolean isNum = true;
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            isNum = false;
        }
        return isNum;
    }
}