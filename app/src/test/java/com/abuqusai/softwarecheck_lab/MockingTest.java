package com.abuqusai.softwarecheck_lab;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

// - Write test class that include Mocking (Two methods)
@RunWith(MockitoJUnitRunner.class)
public class MockingTest {
    Counters counters ;
    ArrayList<String> arrayList;
    @Before
    public void init(){
        counters = new Counters();
        arrayList = new ArrayList();
    }


    @Test()
    public void test(){
        arrayList.add("Hossam");
        arrayList.add("Hossam");
        arrayList.add("Hossam");

        assertEquals(3,counters.getSize(arrayList));
    }

    @Test
    public void playTest() {
        Person person = new Person("name", 15, "23435678V");

        Person person1 = Mockito.spy(person);

        Mockito.doReturn(true).when(person1).runInGround("ground");

        Assert.assertEquals(true, person1.isPlay());
    }
}
