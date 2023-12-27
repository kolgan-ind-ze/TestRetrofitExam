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
    public void testFindMax_1() {
        double[] array = {20343.0, 567, 20343, 343.0, 5454};
        assertEquals(20343.0, CheckArray.findMax(array), 0.0001);
    }

    @Test
    public void testFindMax_2() {
        double[] array = {567, 20343, 343.0, 5454};
        assertEquals(20343, CheckArray.findMax(array), 0.0001);
    }

    @Test
    public void testFindMax_3() {
        double[] array = {20343.0, 567, 343.0, 5454};
        assertEquals(20343.0, CheckArray.findMax(array), 0.0001);
    }

    @Test
    public void testFindMax_4() {
        double[] array = {20343.0, 567, 20343, 5454};
        assertEquals(20343, CheckArray.findMax(array), 0.0001);
    }

    @Test
    public void testFindMax_5() {
        double[] array = {20343.0, 567, 20343, 343.0};
        assertEquals(20343, CheckArray.findMax(array), 0.0001);
    }
}