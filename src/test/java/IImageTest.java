package test.java;

import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.junit.jupiter.api.Assertions.*;

class IImageTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before IImageTest.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("After IImageTest.class");}
    @Test
    void draw() {

    }
}