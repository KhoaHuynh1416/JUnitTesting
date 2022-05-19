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
public class LoaiSanPhamDTOTest{
    
    public LoaiSanPhamDTOTest() {
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
     * Test of getMaLoai method, of class LoaiSanPhamDTO.
     */
    @Test
    public void testGetMaLoai() {
        LoaiSanPhamDTO instance = new LoaiSanPhamDTO();
        String expResult = "";
        String result = instance.getMaLoai();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaLoai method, of class LoaiSanPhamDTO.
     */
    @Test
    public void testSetMaLoai() {
        String maLoai = "loai01";
        LoaiSanPhamDTO instance = new LoaiSanPhamDTO();
        instance.setMaLoai(maLoai);
        String expResult = "loai01";
        assertEquals(expResult, instance.getMaLoai());
    }
    @Test
    public void testSetMaLoaiSymbol() {
        System.out.println("setMaLoai");
        String maLoai = "#@!#@#@KH01";
        
        LoaiSanPhamDTO instance = new LoaiSanPhamDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setMaLoai(maLoai),"nothing here" );
    }

    /**
     * Test of getMaNSX method, of class LoaiSanPhamDTO.
     */
    @Test
    public void testGetTenLoai() {
        LoaiSanPhamDTO instance = new LoaiSanPhamDTO();
        String expResult = "";
        String result = instance.getTenLoai();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaNSX method, of class LoaiSanPhamDTO.
     */
    @Test
    public void testSetTenLoai() {
        String tenLoai = "IOS";
        LoaiSanPhamDTO instance = new LoaiSanPhamDTO();
        instance.setTenLoai(tenLoai);
        String expResult = "IOS";
        assertEquals(expResult, instance.getTenLoai());
    }
    @Test
    public void testSetTenLoaiSymbol() {
        System.out.println("setTenLoai");
        String tenLoai = "#@#01234!IOS";
        
        LoaiSanPhamDTO instance = new LoaiSanPhamDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setTenLoai(tenLoai),"nothing here" );
    }
}
