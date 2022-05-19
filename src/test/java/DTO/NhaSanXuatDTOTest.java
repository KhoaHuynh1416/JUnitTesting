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
 * @author Tat Gia Vi
 */
public class NhaSanXuatDTOTest {
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
     */
            
    @Test
    public void testNhaSanXuatDTO(){
        String maNSX="NSX01";
        String tenNSX="Samsung";
        String diaChi="TPHCM";
        String SDT="0123456789";
        String[] exp={maNSX,tenNSX,diaChi,SDT};
        NhaSanXuatDTO instance = new NhaSanXuatDTO(maNSX, tenNSX, diaChi, SDT);
        String[] res={"","","",""};
        res[0]=instance.getMaNSX();
        res[1]=instance.getTenNSX();
        res[2]=instance.getDiaChi();
        res[3]=instance.getSDT();
        assertArrayEquals(exp,res);
    }
    
    @Test
    public void testGetMaNSX() {
        System.out.println("getMaNSX");
        NhaSanXuatDTO instance = new NhaSanXuatDTO();
        String expResult = "";
        String result = instance.getMaNSX();
        assertEquals(expResult,result);
    }

    /**
     * Test of setMaNSX method, of class NhaSanXuatDTO.
     */
    @Test
    public void testSetMaNSX() {
        System.out.println("setMaNSX");
        String maNSX = "NSX01";
        String expected = "NSX01";
        NhaSanXuatDTO instance = new NhaSanXuatDTO();
        instance.setMaNSX(maNSX);
        assertEquals(expected,instance.getMaNSX());
    }
    @Test
    public void testSetMaNSXSymbol() {
        System.out.println("setMaNSX");
        String maNSX = "#@!%!!##NSX01";
        NhaSanXuatDTO instance = new NhaSanXuatDTO();
       Exception ex= assertThrows(Exception.class,
                ()->instance.setMaNSX(maNSX),"nothing here" );
    }
    /**
     * Test of getTenNSX method, of class NhaSanXuatDTO.
     */
    @Test
    public void testGetTenNSX() {
        System.out.println("getTenNSX");
        NhaSanXuatDTO instance = new NhaSanXuatDTO();
        String expResult = "";
        String result = instance.getTenNSX();
        assertEquals(expResult,result);
    }

    /**
     * Test of setTenNSX method, of class NhaSanXuatDTO.
     */
    @Test
    public void testSetTenNSX() {
        System.out.println("setTenNSX");
        String tenNSX = "Thanh Mai";
        String expected="Thanh Mai";
        NhaSanXuatDTO instance = new NhaSanXuatDTO();
        instance.setTenNSX(tenNSX);
        assertEquals(expected,instance.getTenNSX());
    }
    @Test
    public void testSetTenNSXSymbol() {
        System.out.println("setTenNSX");
        String tenNSX = "#@!#!@#!@1Than123h Mai";
        NhaSanXuatDTO instance = new NhaSanXuatDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setTenNSX(tenNSX),"nothing here" );
    }
    /**
     * Test of getDiaChi method, of class NhaSanXuatDTO.
     */
    @Test
    public void testGetDiaChi() {
        System.out.println("getDiaChi");
        NhaSanXuatDTO instance = new NhaSanXuatDTO();
        String expResult = "";
        String result = instance.getDiaChi();
        assertEquals(expResult,result);
    }

    /**
     * Test of setDiaChi method, of class NhaSanXuatDTO.
     */
    @Test
    public void testSetDiaChi() {
        System.out.println("setDiaChi");
        String diaChi = "DongNai";
        String expected="DongNai";
        NhaSanXuatDTO instance = new NhaSanXuatDTO();
        instance.setDiaChi(diaChi);
        assertEquals(expected,instance.getDiaChi());
    }
    @Test
    public void testSetDiaChiSymbol() {
        System.out.println("setDiaChi");
        String diaChi = "#@!%%!!@Don123gNai";
        NhaSanXuatDTO instance = new NhaSanXuatDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setDiaChi(diaChi),"nothing here" );
    }
    /**
     * Test of getSDT method, of class NhaSanXuatDTO.
     */
    @Test
    public void testGetSDT() {
        System.out.println("getSDT");
        NhaSanXuatDTO instance = new NhaSanXuatDTO();
        String expResult = "";
        String result = instance.getSDT();
        assertEquals(expResult,result);
    }

    /**
     * Test of setSDT method, of class NhaSanXuatDTO.
     */
    @Test
    public void testSetSDT() {
        System.out.println("setSDT");
        String SDT = "19008136";
        String expected = "19008136";
        NhaSanXuatDTO instance = new NhaSanXuatDTO();
        instance.setSDT(SDT);
        assertEquals(expected,instance.getSDT());
    }
    @Test
    public void testSetSDTSymbol() {
        System.out.println("setSDT");
        String SDT = "#@!#!@#1900abc8136";
        NhaSanXuatDTO instance = new NhaSanXuatDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setSDT(SDT),"nothing here" );
    }
}
