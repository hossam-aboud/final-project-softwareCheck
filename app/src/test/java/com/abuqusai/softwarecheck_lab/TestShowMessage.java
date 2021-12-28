package com.abuqusai.softwarecheck_lab;

import org.junit.Test;
import static org.junit.Assert.assertEquals;



// - Write test case that expect an exception (Two exception)
public class TestShowMessage {
    String message = "Emma Watson";

    ShowMessage obj = new ShowMessage(message);

    @Test(expected = ArithmeticException.class)
    public void testshow() {
        System.out.println("We are inside of the show() method");
        obj.show();
    }

    @Test (expected = Exception.class)
    public  void  testshow2 () {
        obj.show();

    }

    @Test
    public void testfinalMessage() {
        System.out.println("We are inside of the finalMessage() method");
        String msg = "Hello!" + "Emma Watson";
        assertEquals(msg,obj.finalMessage());
    }
}