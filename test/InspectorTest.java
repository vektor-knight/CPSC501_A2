/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shshunda
 */
public class InspectorTest {
    Inspector testInspector;
    Object obj;
    Class testClass;
    
    public InspectorTest() {
        testInspector = new Inspector();
        obj = new ClassA();
        testClass = obj.getClass();
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
     * Test of inspect method, of class Inspector.
     */
    @Test
    public void testInspect() {
        System.out.println("inspect");
        Object obj = null;
        boolean recursive = false;
        Inspector instance = new InspectorImpl();
        instance.inspect(obj, recursive);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class InspectorImpl extends Inspector {

        public void inspect(Object obj, boolean recursive) {
        }
    }

    /**
     * Test of interfaceNames method, of class Inspector.
     */
    @Test
    public void testInterfaceNames() {
        System.out.println("Testing the method interfaceNames");
        Class[] interfaces = testClass.getInterfaces();
        assertEquals(interfaces.length, 1);
        assertEquals(interfaces[0].getSimpleName(), "InterfaceA");
    }
    
}
