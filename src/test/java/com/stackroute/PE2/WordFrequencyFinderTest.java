package com.stackroute.PE2;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class WordFrequencyFinderTest {

    private static WordFrequencyFinder wordFrequencyFinder;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running the class
        // This method is used to initialize the required variables
        wordFrequencyFinder = new WordFrequencyFinder();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases and end of class
        // This method is used to clear the initialized variables
        wordFrequencyFinder= null;

    }

}