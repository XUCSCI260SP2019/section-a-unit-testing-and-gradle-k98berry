package edu.xavier.csci;
import org.junit.Test;
import static org.junit.Assert.*;

public class Caltest {
    @Test public void testCanAdd()
    {
        Calculator classUnderTest = new Calculator();
        assertEquals(3, classUnderTest.add(1,2));
    }
}
