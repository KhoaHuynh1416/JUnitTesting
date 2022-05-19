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
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 *
 * @author PC
 */
public class KhachhangDTOTest{
    
    public KhachhangDTOTest() {
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
     * Test of getMaKhachHang method, of class KhachhangDTO.
     */
    @Test
    public void testGetMaKhachHang() {
        KhachhangDTO instance = new KhachhangDTO();
        String expResult = "";
        String result = instance.getMaKhachHang();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaKhachHang method, of class KhachhangDTO.
     */
    @Test
    public void testSetMaKhachHang() {
        String maKhachHang = "KH01";
        KhachhangDTO instance = new KhachhangDTO();
        instance.setMaKhachHang(maKhachHang);
        String expResult = "KH01";
        assertEquals(expResult, instance.getMaKhachHang());
    }
    @Test
    public void testSetMaKhachHangSymbol() {
        System.out.println("setMaKH");
        String maKH = "#@!#@#@KH01";
        
        KhachhangDTO instance = new KhachhangDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setMaKhachHang(maKH),"nothing here" );
    }

    /**
     * Test of getTenKhachHang method, of class KhachhangDTO.
     */
    @Test
    public void testGetTenKhachHang() {
        KhachhangDTO instance = new KhachhangDTO();
        String expResult = "";
        String result = instance.getTenKhachHang();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTenKhachHang method, of class KhachhangDTO.
     */
    @Test
    public void testSetTenKhachHang() {
        String tenKhachHang = "Khoi";
        KhachhangDTO instance = new KhachhangDTO();
        instance.setTenKhachHang(tenKhachHang);
        String expResult = "Khoi";
        assertEquals(expResult, instance.getTenKhachHang());
    }
    @Test
    public void testSetTenKhachHangSymbol() {
        System.out.println("setTenKH");
        String tenKH = "#@#012345!Tran Trong Khoi";
        
        KhachhangDTO instance = new KhachhangDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setTenKhachHang(tenKH),"nothing here" );
    }

    /**
     * Test of getDiaChi method, of class KhachhangDTO.
     */
    @Test
    public void testGetDiaChi() {
        KhachhangDTO instance = new KhachhangDTO();
        String expResult = "";
        String result = instance.getDiaChi();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDiaChi method, of class KhachhangDTO.
     */
    @Test
    public void testSetDiaChi() {
        String diaChi = "TPHCM";
        KhachhangDTO instance = new KhachhangDTO();
        instance.setDiaChi(diaChi);
        String expResult = "TPHCM";
        assertEquals(expResult, instance.getDiaChi());
    }

    /**
     * Test of getEmail method, of class KhachhangDTO.
     */
    @Test
    public void testSetDiaChiSymbol() {
        System.out.println("setDiaChi");
        String diaChi = "#@!TP.HCM";
        
        KhachhangDTO instance = new KhachhangDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setDiaChi(diaChi),"nothing here" );
    }
    
    @Test
    public void testGetEmail() {
        KhachhangDTO instance = new KhachhangDTO();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class KhachhangDTO.
     */
    @Test
    public void testSetEmail() {
        String email = "abc@gmail.com";
        KhachhangDTO instance = new KhachhangDTO();
        instance.setEmail(email);
        String expResult = "abc@gmail.com";
        assertEquals(expResult, instance.getEmail());
    }
    @Test
    public void testSetEmailSymbol() {
        System.out.println("setEmail");
        String email = "#@!toilakhoi15@gmail.com";
        
        KhachhangDTO instance = new KhachhangDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setEmail(email),"nothing here" );
    }

    /**
     * Test of getSDT method, of class KhachhangDTO.
     */
    @Test
    public void testGetSDT() {
        KhachhangDTO instance = new KhachhangDTO();
        String expResult = "";
        String result = instance.getSDT();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class KhachhangDTO.
     */
    @Test
    public void testSetSDT() {
        String sdt = "0908151508";
        KhachhangDTO instance = new KhachhangDTO();
        instance.setSDT(sdt);
        String expResult = "0908151508";
        assertEquals(expResult, instance.getEmail());
    }
    @Test
    public void testSetSDTSymbol() {
        System.out.println("setSDT");
        String SDT = "#@#abc!0908151508";
        
        KhachhangDTO instance = new KhachhangDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setSDT(SDT),"nothing here" );
    }
    
    @Test
    public void testDisplay(){
        System.out.println("display");
        KhachhangDTO instance = new KhachhangDTO();
        instance.display();
        fail("The test case is a prototype.");
    }
}
