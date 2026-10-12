package org.example.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AssertExample {
    //Assertion - validating actual result with expected result.
    //there is a Assertion class present.(org.junit.jupiter.api.Assertions)

    @Test
    public void test1(){
        System.out.println("Testing some assertion methods");
        int actual=12;
        int expected=12;

        int[] actual1={1,2,3,4};
        int[] expected1={1,2,3,4}; // if order is same then only it will pass compare element by element.

        //Overloaded(if we change the data type nothing happens)
        Assertions.assertEquals(expected,actual,"Test failed");
        Assertions.assertArrayEquals(expected1,actual1,"test failed");

        //String name=new String("rahul");
        //String expectedName=new String("rahul");

        //used to assert/compare objects.
        //Assertions.assertSame(expectedName,name);

        //if want to check equal
        //Assertions.assertEquals(expectedName,name);
        //Assertions.assertNull(name);

        boolean value=true;
        Assertions.assertTrue(value);

        List<Integer> list1= Arrays.asList(1,2,3,4,5);
        List<Integer> list2=Arrays.asList(1,2,3,4,5);

        Assertions.assertIterableEquals(list2,list1);

        Assertions.assertThrows(RuntimeException.class,()->{
            throw new RuntimeException("This is testing exception");
        });

    }
}
