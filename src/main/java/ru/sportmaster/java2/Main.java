package ru.sportmaster.java2;

import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try (Scanner userInputScanner = new Scanner(System.in)) {
            int a = scanInt("делитель", userInputScanner);
            int b = scanInt("делимое", userInputScanner);
            Calculator calculator = new Calculator();
            System.out.println(calculator.division(a, b));
        }

    }

    public static int scanInt(String parameter, Scanner userInputScanner) {
        System.out.println("Введите " + parameter);
        try {
            return userInputScanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число");
            throw new RuntimeException(e);
        }

    }
}
