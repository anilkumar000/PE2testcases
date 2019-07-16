package com.stackroute.PE2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AggregateFinderTest {
    private static AggregateFinder aggregateFinder;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        aggregateFinder = new AggregateFinder();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        aggregateFinder = null;

    }

    @Test
    public void testWhetherTheUserIsGivingRightInput() {
        //act


        boolean actualValue = aggregateFinder.getStudentInput(1, 30);

        //assert
        assertTrue(actualValue);
    }

    @Test
    public void testStudentAverage() {
        //act
        int[] studentsgrades = {10, 20, 30, 40, 50};
        int actualAverage = aggregateFinder.getAverage(studentsgrades);
        //assert
        assertEquals(30, actualAverage);
    }

    @Test
    public void testForMinimumGrades() {
        //act
        int[] studentsgrades = {10, 20, 30, 40, 50};
        int actualMinimumGrades = studentGrading.getMinimum(studentsgrades);

        //assert
        assertEquals(10, actualMinimumGrades);
    }

    @Test
    public void TestMaximumGrades() {
        //act
        int[] studentsgrades = {10, 20, 30, 40};
        int actualMaximum = aggregateFinder.getMaximum(studentsgrades);

        //assert
        assertEquals(40, actualMaximum);
    }
}