package ru.sportmaster.java2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void shouldTrowExceptionOnDivisionByZero() {
        // given
        int a = 3;
        int b = 0;

        //when
        ArithmeticException exception = assertThrows(ArithmeticException.class, () ->
                calculator.division(a, b)
        );

        //then
        assertEquals("Делитель не может быть равен нулю!", exception.getMessage());
    }

    @Test
    void shouldPerformIntegerDivision(){
        //given
        int a = 6;
        int b = 3;

        //when
        float result = calculator.division(a,b);

        //then
        assertEquals(2, result);

    }

    @Test
    void shouldPerformFloatDivision(){
        //given
        int a = 3;
        int b = 6;

        //when
        float result = calculator.division(a,b);

        //then
        assertEquals(0.5, result);

    }
}
