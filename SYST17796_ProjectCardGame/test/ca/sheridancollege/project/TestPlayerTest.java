/*
 * Ramanvir Singh Sahota
 * Student ID: 991542297
 * 
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hyper
 */
public class TestPlayerTest {
    
    public TestPlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of play method, of class TestPlayer.
     */
   // @Test
    //public void testPlay() {
      //  System.out.println("play");
        //TestPlayer instance = new TestPlayer();
        //String expResult = "";
        //String result = instance.play();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    //}
     @Test
    public void testCheckNameGood() {
        System.out.println("checkName Good test");
        String id = "ramanvir";
        boolean expResult = true;
        boolean result = TestPlayer.checkName(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   
    @Test
    public void testCheckNameBad() {
        System.out.println("checkName Bad test");
        String id = "";
        boolean expResult = false;
        boolean result = TestPlayer.checkName(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckNameBoundary() {
        System.out.println("checkName Boundary test");
        String id = "";
        boolean expResult = false;
        boolean result = TestPlayer.checkName(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
