package com.example.testretrofitexam;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testFindMax203430True() {
        double check = 20343.0;
        Boolean expected = true;
        Boolean actual = CheckArray.findMax(check);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMax567False() {
        double check = 567;
        Boolean expected = false;
        Boolean actual = CheckArray.findMax(check);
        assertNotEquals(expected, actual);
    }

    @Test
    public void testFindMax20343True() {
        double check = 20343;
        Boolean expected = true;
        Boolean actual = CheckArray.findMax(check);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMax3430False() {
        double check = 343.0;
        Boolean expected = false;
        Boolean actual = CheckArray.findMax(check);
        assertNotEquals(expected, actual);
    }

    @Test
    public void testFindMax5454False() {
        double check = 5454;
        Boolean expected = false;
        Boolean actual = CheckArray.findMax(check);
        assertNotEquals(expected, actual);
    }
}