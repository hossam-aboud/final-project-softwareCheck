package com.abuqusai.softwarecheck_lab;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

// - Write test class that use parametrized notation (Two methods)
@RunWith(Parameterized.class)
public class ParameterizeTest {
    Counters counters ;
    Arithemetic arithemetic ;
    int numberOne , numberTwo , expectedResult;
    public ParameterizeTest(int numberOne , int numberTwo , int expectedResult){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.expectedResult = expectedResult;
    }

    @Before
    public void init(){
        counters = new Counters();
        arithemetic = new  Arithemetic();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> init2() {
        return Arrays.asList(new Object[][] { { 0, 0 ,1} ,{ 2, 2 ,5} });
    }

    @Test
    public void sumfunction(){
        assertEquals(expectedResult, counters.sumation(numberOne,numberTwo));
    }

    @Test
    public void reminderDivision(){
        assertEquals(expectedResult, arithemetic.remainderOfTheDivision(44,10));
    }




}