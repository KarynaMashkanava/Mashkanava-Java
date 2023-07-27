package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Algoritm.sayHello(scanner);
            scanner.nextLine();
            Algoritm.printName(scanner);
            Algoritm.printArrayElements(scanner);
        } finally {
            scanner.close();
        }
    }
}