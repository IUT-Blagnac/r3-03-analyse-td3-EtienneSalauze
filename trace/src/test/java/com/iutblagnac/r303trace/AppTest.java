package com.iutblagnac.r303trace;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * Unit test for simple App.
 */
public class AppTest 
/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Test de la méthode hello()
     */
    @Test
    public void testHello() {
        String test = "Hello World!";
        assertEquals("ERREUR", test, App.hello());
    }

    /*
     * Test méthode hello(param)
     */
    @Test
    public void testHelloParam() {
        String test = "COUCOU";
        assertEquals("ERREUR", test, App.hello("COUCOU"));
    }
}
