/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;
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
public class PhieunhapDTOTest {
    
    public PhieunhapDTOTest() {
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
     * Test of getMaPN method, of class PhieunhapDTO.
     */
    @Test
    public void testGetMaPN() {
        PhieunhapDTO instance = new PhieunhapDTO();
        String expResult = "";
        String result = instance.getMaPN();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaPN method, of class PhieunhapDTO.
     */
    @Test
    public void testSetMaPN() {
        String MaPN = "pn001";
        PhieunhapDTO instance = new PhieunhapDTO();
        instance.setMaPN(MaPN);
        String expResult = "pn001";
        assertEquals(expResult, instance.getMaPN());
    }

    @Test
    public void testSetMaPNWithSymbols() {
        String MaPN = "\"pn001";
        PhieunhapDTO instance = new PhieunhapDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->instance.setMaPN(MaPN));        
    } 
    
    @Test
    public void testSetMaPNWithSpaces() {
        String MaPN = " pn001";
        PhieunhapDTO instance = new PhieunhapDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->instance.setMaPN(MaPN));
    }    
    /**
     * Test of getNgayNhap method, of class PhieunhapDTO.
     */
    @Test
    public void testGetNgayNhap() {
        PhieunhapDTO instance = new PhieunhapDTO();
        Date result = instance.getNgayNhap();
        assertNull(result);
    }

    /**
     * Test of setNgayNhap method, of class PhieunhapDTO.
     */
    @Test
    public void testSetNgayNhap() {
        PhieunhapDTO instance = new PhieunhapDTO();
        instance.setNgayNhap(Date.valueOf("2000-1-1"));
        assertEquals(Date.valueOf("2000-1-1"), instance.getNgayNhap());
    }

    @Test
    public void testSetNgayNhapZero() {
        PhieunhapDTO instance = new PhieunhapDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->instance.setNgayNhap(Date.valueOf("2000-0-0")));        
    }   

    @Test
    public void testSetNgayNhapInvalidMonth() {
        PhieunhapDTO instance = new PhieunhapDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->instance.setNgayNhap(Date.valueOf("2000-13-20")));        
    }    

    @Test
    public void testSetNgayNhapInvalidDate() {
        PhieunhapDTO instance = new PhieunhapDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->instance.setNgayNhap(Date.valueOf("2000-12-33")));    
        ex = assertThrows(Exception.class, 
                ()->instance.setNgayNhap(Date.valueOf("2000-4-31")));
        ex = assertThrows(Exception.class, 
                ()->instance.setNgayNhap(Date.valueOf("2000-6-31")));
        ex = assertThrows(Exception.class, 
                ()->instance.setNgayNhap(Date.valueOf("2000-9-31")));
        ex = assertThrows(Exception.class, 
                ()->instance.setNgayNhap(Date.valueOf("2000-11-31")));
        ex = assertThrows(Exception.class, 
                ()->instance.setNgayNhap(Date.valueOf("2018-2-29")));
        ex = assertThrows(Exception.class, 
                ()->instance.setNgayNhap(Date.valueOf("2000-2-31")));
    } 
    /**
     * Test of getMaNCC method, of class PhieunhapDTO.
     */
    @Test
    public void testGetMaNCC() {
        PhieunhapDTO instance = new PhieunhapDTO();
        String expResult = "";
        String result = instance.getMaNCC();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaNCC method, of class PhieunhapDTO.
     */
    @Test
    public void testSetMaNCC() {
        String MaNCC = "NCC01";
        PhieunhapDTO instance = new PhieunhapDTO();
        instance.setMaNCC(MaNCC);
        String expResult = "NCC01";
        assertEquals(expResult,instance.getMaNCC());
    }

    @Test
    public void testSetMaNCCWithSymbols() {
        String MaNCC = "\"NCC01";
        PhieunhapDTO instance = new PhieunhapDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->instance.setMaNCC(MaNCC));        
    } 
    
    @Test
    public void testSetMaNCCWithSpaces() {
        String MaNCC = " NCC01";
        PhieunhapDTO instance = new PhieunhapDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->instance.setMaNCC(MaNCC));
    }    
    
    /**
     * Test of getMaNV method, of class PhieunhapDTO.
     */
    @Test
    public void testGetMaNV() {
        PhieunhapDTO instance = new PhieunhapDTO();
        String expResult = "";
        String result = instance.getMaNV();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaNV method, of class PhieunhapDTO.
     */
    @Test
    public void testSetMaNV() {
        String MaNV = "NV001";
        PhieunhapDTO instance = new PhieunhapDTO();
        instance.setMaNV(MaNV);
        String expResult = "NV001";
        assertEquals(expResult, instance.getMaNV());
    }

    @Test
    public void testSetMaNVWithSymbols() {
        String MaNV = "\"NV001";
        PhieunhapDTO instance = new PhieunhapDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->instance.setMaNV(MaNV));        
    } 
    
    @Test
    public void testSetMaNVWithSpaces() {
        String MaNV = " NV001";
        PhieunhapDTO instance = new PhieunhapDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->instance.setMaNV(MaNV));
    }    
    /**
     * Test of getTongTien method, of class PhieunhapDTO.
     */
    @Test
    public void testGetTongTien() {
        PhieunhapDTO instance = new PhieunhapDTO();
        float expResult = 0.0F;
        float result = instance.getTongTien();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setTongTien method, of class PhieunhapDTO.
     */
    @Test
    public void testSetTongTien() {
        float TongTien = 5.0F;
        PhieunhapDTO instance = new PhieunhapDTO();
        instance.setTongTien(TongTien);
        float expResult = 5.0F;
        assertEquals(expResult, instance.getTongTien(),0.0);
    }

    @Test
    public void testSetTongTienNegative() {
        float TongTien = -5.0F;
        PhieunhapDTO instance = new PhieunhapDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->instance.setTongTien(TongTien));    
    }    
}
