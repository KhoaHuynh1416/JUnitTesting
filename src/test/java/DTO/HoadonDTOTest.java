/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author PC
 */
public class HoadonDTOTest{
    
    public HoadonDTOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }


    /**
     * Test of getMaLoai method, of class HoadonDTO.
     */ 
    @Test
    public void testGetMaHD() {
        System.out.println("getMaHD");
        HoadonDTO instance = new HoadonDTO();
        String expResult = "";
        String result = instance.getMaHD();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaLoai method, of class HoadonDTO.
     */
    @Test
    public void testSetMaHD() {
        System.out.println("setMaHD");
        String MaHD = "HD01";
        HoadonDTO instance = new HoadonDTO();
        instance.setMaHD(MaHD);
        String expResult = "HD01";
        assertEquals(expResult, instance.getMaHD());
    }

    /**
     * Test of getNgayxuat method, of class HoadonDTO.
     */
    @Test
    public void testSetMaHDSymbol() {
        System.out.println("setMaHD");
        String maHD = "#@!#@#@#!HD01";
        
        HoadonDTO instance = new HoadonDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setMaHD(maHD),"nothing here" );
    }

    @Test
    public void testGetNgayxuat() {
        HoadonDTO instance = new HoadonDTO();
        String expResult = "";
        String result = instance.getNgayxuat();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNgayxuat method, of class HoadonDTO.
     */
    @Test
    public void testSetNgayxuat() {
        String ngayxuat = "30/04/2021";
        HoadonDTO instance = new HoadonDTO();
        instance.setNgayxuat(ngayxuat);
        String expResult = "30/04/2021";
        assertEquals(expResult, instance.getNgayxuat());
    }
    @Test
    public void testSetNgayxuatSymbol() {
        System.out.println("setMaNgayxuat");
        String ngayXuat = "#@#abc!30/4/2021";
        
        HoadonDTO instance = new HoadonDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setNgayxuat(ngayXuat),"nothing here" );
    }

    /**
     * Test of getMaKH method, of class HoadonDTO.
     */
    @Test
    public void testGetMaKH() {
        HoadonDTO instance = new HoadonDTO();
        String expResult = "";
        String result = instance.getMaKH();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaKH method, of class HoadonDTO.
     */
    @Test
    public void testSetMaKH() {
        String MaKH = "KH001";
        HoadonDTO instance = new HoadonDTO();
        instance.setMaKH(MaKH);
        String expResult = "KH001";
        assertEquals(expResult, instance.getMaKH());
    }
    @Test
    public void testSetMaKHSymbol() {
        System.out.println("setMaKH");
        String maKH = "#@!#@#@#KH01";
        
        HoadonDTO instance = new HoadonDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setMaKH(maKH),"nothing here" );
    }

    /**
     * Test of getMaNV method, of class HoadonDTO.
     */
    @Test
    public void testGetMaNV() {
        HoadonDTO instance = new HoadonDTO();
        String expResult = "";
        String result = instance.getMaNV();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaNV method, of class HoadonDTO.
     */
    @Test
    public void testSetMaNV() {
        String MaNV = "NV001";
        HoadonDTO instance = new HoadonDTO();
        instance.setMaNV(MaNV);
        String expResult = "NV001";
        assertEquals(expResult, instance.getMaNV());
    }
    @Test
    public void testSetMaNVSymbol() {
        System.out.println("setMaNV");
        String maNV = "#@!#@#@#NV01";
        
        HoadonDTO instance = new HoadonDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setMaNV(maNV),"nothing here" );
    }

    /**
     * Test of getTongtien method, of class HoadonDTO.
     */
    @Test
    public void testGetTongtien() {
        HoadonDTO instance = new HoadonDTO();
        double expResult = 0;
        double result = instance.getTongtien();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTongtien method, of class HoadonDTO.
     */
    @Test
    public void testSetTongtien() throws Exception {
        double Tongtien = 4500000;
        HoadonDTO instance = new HoadonDTO();
        instance.setTongtien(Tongtien);
        double expResult = 4500000;
        assertEquals(expResult, instance.getTongtien());
    }
    @Test
    public void testSetTongtienNegative() {
        System.out.println("setTongtien");
        double tongTien = -5000;        
        HoadonDTO instance = new HoadonDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setTongtien(tongTien),"nothing here" );
    }
    

    /**
     * Test of getTongKM method, of class HoadonDTO.
     */
    @Test
    public void testGetTongKM() {
        HoadonDTO instance = new HoadonDTO();
        double expResult = 10.0F;
        double result = instance.getTongKM();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setTongKM method, of class HoadonDTO.
     */
    @Test
    public void testSetTongKM() {
        double TongKM = 10.0F;
        HoadonDTO instance = new HoadonDTO();
        instance.setTongKM(TongKM);
        double expResult = 10.0F;
        assertEquals(expResult, instance.getTongKM());        
    }
    @Test
    public void testSetTongKMNegative() {
        System.out.println("setTongKM");
        double tongKM = -5000;     
        HoadonDTO instance = new HoadonDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setTongKM(tongKM),"nothing here" );
    }   
}
