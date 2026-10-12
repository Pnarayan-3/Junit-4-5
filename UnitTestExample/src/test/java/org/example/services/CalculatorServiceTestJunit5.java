package org.example.services;

import org.junit.jupiter.api.*;

public class CalculatorServiceTestJunit5 {

    @BeforeAll
    public static void init(){
        System.out.println("This is single time logic ");
    }

    @AfterAll
    public static void cleanup(){
        System.out.println("After all test case logic");
    }

    @BeforeEach
    public void eachTestCase(){
        System.out.println("before each");
    }

    @AfterEach
    public void afterTestCase(){
        System.out.println("after each");
    }

    @Test
    @DisplayName("this is custom name")
    public void addTwoNumbersTest(){
        System.out.println("First Test Case");
        int result=CalculatorService.addTwoNumbers(12,12);
        int expected=24;
        Assertions.assertEquals(expected,result,"test failed");
    }
    @Test
    @Disabled //this test case will be ignored
    public void addAnyNumbersTest(){
        System.out.println("Second test case");
        int result=CalculatorService.sumAnyNumbers(1,2,3,4);
        int expected=10;
        Assertions.assertEquals(expected,result,"test failed");
    }

    /*

    some more annotations
    @Tag();
    @Nested();
    @TestFoctory();

     */


}
