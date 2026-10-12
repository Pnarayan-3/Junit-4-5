//package org.example.services;
//
//import org.junit.*;
//
//import java.util.Date;
//
//public class CalculatorServiceTest {
//
//    int counter=0;
//    //before all test cases.
//    @BeforeClass
//    public static void init(){
//        System.out.println("before all test cases:");
//        System.out.println("started test:"+new Date());
//
//        //connection open
//        //file open
//    }
//
//    //executes the method before each test case
//    @Before
//    public void beforeEach(){
//        System.out.println("before each test case");
//        counter=0;
//    }
//
//    //executes the method after each test case
//    @After
//    public void afterEach(){
//        System.out.println("before each test case");
//    }
//
//    //way to test the testcase for particular time.@Test(timeout=2000)
//    //test method of addTwoNumbers
//    @Test
//    public void addTwoNumbersTest(){
//        for(int i=1;i<=20;i++){
//            counter+=i;
//        }
//
//        //Thread.sleep(3000);
//        System.out.println("test for addTwoNumbersTest");
//        int result=CalculatorService.addTwoNumbers(12,45);
//        int expected=57;
//        System.out.println("counter value after first test "+counter);
//        Assert.assertEquals(expected,result);
//
//        //actual result
//
//
//        //expected result
//
//    }
//    @Test
//    public void sumAnyNumberTest(){
//        for(int i=1;i<=100;i++){
//            counter+=i;
//        }
//
//        System.out.println("test for addTwoNumbersTest");
//        int result=CalculatorService.sumAnyNumbers(12,34,45,67);
//        int expected=158;
//        System.out.println("counter value after second test "+counter);
//        Assert.assertEquals(expected,result);
//    }
//
//    //runs after all the test cases.
//    @AfterClass
//    public static void cleanup(){
//        System.out.println("After all test cases");
//        System.out.println("End test cases :"+new Date());
//    }
//
//
//}
