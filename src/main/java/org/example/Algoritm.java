package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.example.Constant.DEFAULT_NAME;

public class Algoritm {
    public static void sayHello(Scanner scanner) {
        System.out.println("Введите число:");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 7) {
                System.out.println("Привет");
            }
        } else {
            System.out.println("Введено НЕ число! Перезапустите программу.");
        }
    }

    public static void printName(Scanner scanner) {
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        if (name.equals(DEFAULT_NAME.getValue())) {
            System.out.println("Привет, " + DEFAULT_NAME.getValue());
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public static void printArrayElements(Scanner scanner) {
        System.out.println("Введите размер массива:");
        int size;
        Integer[] array;
        try {
            size = scanner.nextInt();
            array = new Integer[size];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Несовместимый тип.");
        }
        System.out.println("Элементы массива кратные 3: ");
        for (int a : array) {
            if (a % 3 == 0 && a != 0) {
                System.out.println(a);
            }
        }
    }
}
