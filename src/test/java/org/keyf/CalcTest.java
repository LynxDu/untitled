package org.keyf;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Before Each");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After All");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("After Each");
    }



    @ParameterizedTest(name = "Тест #{index} - {0} + {1} = {2}")
    @DisplayName("Проверка суммы")
    @Timeout(10)
    @Tag("calc")
    @CsvSource({"1,2,3","5,15,20","-5,10,5"})
    void summ(int a, int b, int expectedResult) {
        Calc calculator = new Calc();
        int result = calculator.summ(a, b);
        Assertions.assertEquals(expectedResult,result,"Не правильное решение должно быть "+ expectedResult);
    }



    @ParameterizedTest
    @DisplayName("Проверка разницы")
    @Timeout(10)
    @Tag("calc")
    @CsvSource({"3,2,1","5,15,-10","-5,10,-15"})
    void sub(int a, int b, int expectedResult) {
        Calc calculator = new Calc();
        int result = calculator.sub(a, b);
        Assertions.assertEquals(expectedResult,result,"Не правильное решение должно быть "+ expectedResult);
    }

    @ParameterizedTest
    @DisplayName("Проверка деления")
    @Timeout(10)
    @Tag("calc")
    @CsvSource({"12,3,4","50,13,3.85","-20,0,-4"})
    void divide(int a, int b, double expectedResult) {
        Calc calculator = new Calc();
        double result = calculator.divide(a, b);
        Assertions.assertEquals(expectedResult,result,"Не правильное решение должно быть "+ expectedResult);
    }

    @ParameterizedTest
    @DisplayName("Проверка перемножения")
    @Timeout(10)
    @Tag("calc")
    @CsvSource({"1,2,2","5,15,75","-5,10,-50"})
    void mul(int a, int b, int expectedResult) {
        Calc calculator = new Calc();
        int result = calculator.mul(a, b);
        Assertions.assertEquals(expectedResult,result,"Не правильное решение должно быть "+ expectedResult);
    }
}