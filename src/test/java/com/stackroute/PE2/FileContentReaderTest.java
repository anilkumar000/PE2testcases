package com.stackroute.PE2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class FileContentReaderTest {

    private static FileContentReader filecontentreader;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running the class
        // This method is used to initialize the required variables
        filecontentreader = new FileContentReader();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases and end of class
        // This method is used to clear the initialized variables
        filecontentreader= null;

    }

    @Test
    public void GivenFileNameAndExtensionShouldReturnByteArray() {
        //act
        String testString = "test string";
        byte[] testByteArray = testString.getBytes();
        // Assert
        assertArrayEquals("GivenFileNameAndExtensionShouldReturnByteArray: check readFile()",
                testByteArray, filecontentreader.readFile("test", "txt"));
    }



    @Test(expected = FileNotFoundException.class)
    public void GivenFileNameAndExtensionShouldReturnFileNotFoundException() {
        filecontentreader.readFile("test1", "txt");
    }
}