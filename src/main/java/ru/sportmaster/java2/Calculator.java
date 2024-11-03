package ru.sportmaster.java2;

public class Calculator {
    public float division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Делитель не может быть равен нулю!");
        }
        return (float) a / b;
    }
}
