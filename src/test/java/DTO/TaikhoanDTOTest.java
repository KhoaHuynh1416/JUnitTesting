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
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *
 * @author PC
 */
public class TaikhoanDTOTest {
    
    public TaikhoanDTOTest() {
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
     * Test of getRole method, of class TaikhoanDTO.
     */
    @Test
    public void testGetRole() {
        TaikhoanDTO instance = new TaikhoanDTO();
        String expResult = "";
        String result = instance.getRole();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaTK method, of class TaikhoanDTO.
     */
    @Test
    public void testGetMaTK() {
        TaikhoanDTO instance = new TaikhoanDTO();
        String expResult = "";
        String result = instance.getMaTK();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPassword method, of class TaikhoanDTO.
     */
    @Test
    public void testGetPassword() {
        TaikhoanDTO instance = new TaikhoanDTO();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRole method, of class TaikhoanDTO.
     */
    @Test
    public void testSetRole() {
        String role = "user";
        TaikhoanDTO instance = new TaikhoanDTO();
        instance.setRole(role);
        assertEquals(role, instance.getRole());
    }
    
    @Test
    public void testSetRoleInvalid(){
        String role = "abbcc";
        TaikhoanDTO instance = new TaikhoanDTO();
        Exception ex = assertThrows(Exception.class,
                ()->instance.setRole(role));
    }

    /**
     * Test of setMaTK method, of class TaikhoanDTO.
     */
    @Test
    public void testSetMaTK() {
        String maTK = "TK001";
        TaikhoanDTO instance = new TaikhoanDTO();
        instance.setMaTK(maTK);
        assertEquals(maTK, instance.getMaTK());
    }

    @Test
    public void testSetMaTKWithSymbols(){
        String MaTK = "\"TK001";
        TaikhoanDTO instance = new TaikhoanDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->instance.setMaTK(MaTK));    
    }
    
    @Test
    public void testSetMaTKWithSpaces(){
        String MaTK = " TK001";
        TaikhoanDTO instance = new TaikhoanDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->instance.setMaTK(MaTK));    
    }    
    /**
     * Test of setPassword method, of class TaikhoanDTO.
     */
    @Test
    public void testSetPassword() {
        String password = "12345678";
        TaikhoanDTO instance = new TaikhoanDTO();
        instance.setPassword(password);
        assertEquals(password, instance.getPassword());
    }
    
    @Test
    public void testSetPasswordTooShort(){
        String password = "123";
        TaikhoanDTO instance = new TaikhoanDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->instance.setPassword(password)); 
    }
 
    @Test
    public void testSetPasswordWithSymbols(){
        String password = "\"12*\"'";
        TaikhoanDTO instance = new TaikhoanDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->instance.setPassword(password));    
    }    
    
}
