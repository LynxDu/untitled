package org.keyf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void summ() {
        Calc calculator = new Calc();
        int a = 15; int b = 20;
        int expectedResult = 35;
        int result = calculator.summ(a, b);
        Assertions.assertEquals(expectedResult,result,"Не правильное решение должно быть "+ expectedResult);
    }

    @Test
    void sub() {
        Calc calculator = new Calc();
        int a = 50; int b = 20;
        int expectedResult = 30;
        int result = calculator.sub(a, b);
        Assertions.assertEquals(expectedResult,result,"Не правильное решение должно быть "+ expectedResult);
    }

    @Test
    void divide() {
        Calc calculator = new Calc();
        int a = 50; int b = 5;
        double expectedResult = 10;
        double result = calculator.divide(a, b);
        Assertions.assertEquals(expectedResult,result,"Не правильное решение должно быть "+ expectedResult);
    }

    @Test
    void mul() {
        Calc calculator = new Calc();
        int a = 5; int b = 8;
        int expectedResult = 40;
        int result = calculator.mul(a, b);
        Assertions.assertEquals(expectedResult,result,"Не правильное решение должно быть "+ expectedResult);
    }
}