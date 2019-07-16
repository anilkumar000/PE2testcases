package com.stackroute.PE2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialCalculatorTest {

    private static FactorialCalculator factorialCalculator;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running the class
        // This method is used to initialize the required variables
        factorialCalculator = new FactorialCalculator();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases and end of class
        // This method is used to clear the initialized variables
        factorialCalculator = null;

    }


    @Test
    public void givenIntShouldReturnIntFactorial(){
        //act
        int factorial=factorialCalculator.factorialGenerator(5);

        //
        assertEquals(120,factorial);
    }

    @Test
    public void givenLongShouldReturnLongFactorial(){

        //act
        long factorial=factorialCalculator.getLongFactorial(20);
        //assert

        assertEquals(2432902008176640000,factorial);
    }


    @Test(expected = NullPointerException.class)
    public void GivenNullShouldReturnNullPointException(){

       factorialCalculator.intFactorial(null);
    }
}