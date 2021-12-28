package com.abuqusai.softwarecheck_lab;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import android.util.Log;

import java.util.ArrayList;



// - Write test class that include test lifecycle. (Five methods)
public class ExampleUnitTest {

    static Counters counters;
    static ArrayList<String> names = new ArrayList<String>();

    @BeforeClass
    public static void before_class() {
        counters = new Counters();
        names.add("hossam");
        names.add("eman");
    }


    @Before
    public void before() {
        Log.d("test", "before");

    }

    // 1
    @Test
    public void doTest() {
        assertEquals(true, counters.getSize(names) != -1);
    }
    // 2
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionIsThrown() {
        assertEquals("Result", 70, counters.divid(54, 74));
    }
    // 3
    @Test
    public void testAddition() {
        assertEquals("Result", 50, counters.addition(10, 5));
    }
    // 4
    @Test
    public void testMultiply() {
        assertEquals("Result", 40, counters.multiply(10, 5));
    }
    // 5
    @Test
    public void testIsNumberNotValid() {
        assertEquals("Result", 10, counters.subtract(10, 5));
    }

    @After
    public void after() {
        Log.d("test", "after");
    }

    @AfterClass
    public static void after_class() {
        Log.d("test", "afterClass");

    }
}