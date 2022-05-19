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
public class NhaCungCapDTOTest {
    
   
    
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
    @Test
    public void NhaCungCapDTOTest() {
        String[] exp={"NCC01","Samsung","TPHCM","0123456789"};
        String[] res={"","","",""};
        NhaCungCapDTO info = new NhaCungCapDTO(exp[0], exp[1], exp[2], exp[3]);
        res[0]=info.getMaNCC();
        res[1]=info.getTenNCC();
        res[2]=info.getDiaChi();
        res[3]=info.getSDT();
        assertArrayEquals(exp,res);
    }
    /**
     * Test of getMaNCC method, of class NhaCungCapDTO.
     */
    @Test
    public void testGetMaNCC() {
        System.out.println("getMaNCC");
        NhaCungCapDTO instance = new NhaCungCapDTO();
        String expResult = "";
        String result = instance.getMaNCC();
        assertEquals(expResult,result);
    }

    /**
     * Test of setMaNCC method, of class NhaCungCapDTO.
     */
    @Test
    public void testSetMaNCC() {
        System.out.println("setMaNCC");
        String maNCC = "NCC01";
        String expected = "NCC01";
        NhaCungCapDTO instance = new NhaCungCapDTO();
        instance.setMaNCC(maNCC);
        assertEquals(expected,instance.getMaNCC());
    }
    @Test
    public void testSetMaNCCSymbol() {
        System.out.println("setMaNCC");
        String maNCC = "#@!#@#@#NCC01";
        
        NhaCungCapDTO instance = new NhaCungCapDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setMaNCC(maNCC),"nothing here" );
    }
    /**
     * Test of getTenNCC method, of class NhaCungCapDTO.
     */
    @Test
    public void testGetTenNCC() {
        System.out.println("getTenNCC");
        NhaCungCapDTO instance = new NhaCungCapDTO();
        String expResult = "";
        String result = instance.getTenNCC();
        assertEquals(expResult,result);
    }

    /**
     * Test of setTenNCC method, of class NhaCungCapDTO.
     */
    @Test
    public void testSetTenNCC() {
        System.out.println("setTenNCC");
        String tenNCC = "Xiaomi";
        String expected ="Xiaomi";
        NhaCungCapDTO instance = new NhaCungCapDTO();
        instance.setTenNCC(tenNCC);
        assertEquals(expected,instance.getTenNCC());
    }
    @Test
    public void testSetTenNCCSymbol() {
        System.out.println("setTenNCC");
        String tenNCC = "#@$12345!!@Samsung";
        NhaCungCapDTO instance = new NhaCungCapDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setTenNCC(tenNCC),"nothing here" );
    }
    /**
     * Test of getDiaChi method, of class NhaCungCapDTO.
     */
    @Test
    public void testGetDiaChi() {
        System.out.println("getDiaChi");
        NhaCungCapDTO instance = new NhaCungCapDTO();
        String expResult = "";
        String result = instance.getDiaChi();
        assertEquals(expResult,result);
    }

    /**
     * Test of setDiaChi method, of class NhaCungCapDTO.
     */
    @Test
    public void testSetDiaChi() {
        System.out.println("setDiaChi");
        String diaChi = "Hanoi";
        String expected="Hanoi";
        NhaCungCapDTO instance = new NhaCungCapDTO();
        instance.setDiaChi(diaChi);
        assertEquals(expected,instance.getDiaChi());
    }
    @Test
    public void testSetDiaChiSymbol() {
        System.out.println("setDiaChi");
        String diaChi = "#@!123456#@Hanoi";
        NhaCungCapDTO instance = new NhaCungCapDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setDiaChi(diaChi),"nothing here" );
    }
    /**
     * Test of getSDT method, of class NhaCungCapDTO.
     */
    @Test
    public void testGetSDT() {
        System.out.println("getSDT");
        NhaCungCapDTO instance = new NhaCungCapDTO();
        String expResult = "";
        String result = instance.getSDT();
        assertEquals(expResult,result);
    }

    /**
     * Test of setSDT method, of class NhaCungCapDTO.
     */
    @Test
    public void testSetSDT() {
        System.out.println("setSDT");
        String SDT = "0767400569";
        String expected ="0767400569";
        NhaCungCapDTO instance = new NhaCungCapDTO();
        instance.setSDT(SDT);
        assertEquals(expected,instance.getSDT());
    }
    @Test
    public void testSetSDTSymbol() {
        System.out.println("setSDT");
        String SDT = "#@#abc!0767400569";
        
        NhaCungCapDTO instance = new NhaCungCapDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setSDT(SDT),"nothing here" );
    }    
}
