/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class testArray {
    
    public testArray() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testAssertArrayEquals() {
        int[] Temp01 = {1,2,3,4,5};
        int[] Temp02 = {1,2,3,4,5};
        
        assertArrayEquals(Temp01, Temp02);
    }
    
    @Test
    public void testAssertArrayNotEquals() {
        int[] Temp01 = {1,2,3,4,5};
        int[] Temp02 = {1,2,3,4,5,6};
        
        assertArrayEquals(Temp01, Temp02);
    }
}
