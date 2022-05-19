/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.KhachhangDTO;
import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author MTT
 */
public class KhachhangDAOTest extends TestCase {
    
    KhachhangDAO khachhangDAO;
    
    public KhachhangDAOTest() {
        khachhangDAO = new KhachhangDAO();
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
     * Test of getDanhSachKhachHang method, of class KhachhangDAO.
     */
    @Test
    public void testGetDanhSachKhachHang() throws Exception {
        assertNotNull(khachhangDAO.getDanhSachKhachHang());
    }

    /**
     * * Test of addKhachHang method, of class KhachHangDAO.
     */
    @Test
    public void testAddKhachHangNull() throws Exception {
        KhachhangDTO kh = null;
        Exception ex = assertThrows(Exception.class, 
                ()->khachhangDAO.addKhachHang(kh));        
    }
    
    @Test
    public void testAddKhachHangEmpty() throws Exception {
        KhachhangDTO kh = new KhachhangDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->khachhangDAO.addKhachHang(kh));        
    }   
    
    @Test
    public void testAddKhachHangValid() throws Exception {
        KhachhangDTO kh = new KhachhangDTO();
        
        kh.setMaKhachHang("KH01");
        kh.setTenKhachHang("Tran Trong Khoi");
        kh.setDiaChi("TP.HCM");
        kh.setEmail("khoine15@gmail.com");
        kh.setSDT("0908151508");
        
        khachhangDAO.addKhachHang(kh); 
    }    

     
    /**
     * Test of deleteKhachHang method, of class KhachhangDAO.
     */
    @Test
    public void testDeleteKhachHangkhNull() throws Exception {
        String maKH = null;
        Exception ex = assertThrows(Exception.class, 
                ()->khachhangDAO.deleteKhachHang(maKH));
    }
 
    @Test
    public void testDeleteKhachHangkhEmpty() throws Exception {
        String maKH = "";
        Exception ex = assertThrows(Exception.class, 
                ()->khachhangDAO.deleteKhachHang(maKH));
    }  
    
    @Test
    public void testDeleteKhachHangkhValid() throws Exception {
        String maKH = "KH01";
        khachhangDAO.deleteKhachHang(maKH);
    }
    
    /**
     * Test of updateKhachHang method, of class KhachhangDAO.
     */
    @Test
    public void testUpdateKhachHangNull() throws Exception {
        KhachhangDTO kh = null;
        Exception ex = assertThrows(Exception.class, 
                ()->khachhangDAO.upadateKhachHang(kh));
    }

    @Test
    public void testUpdateKhachHangEmpty() throws Exception {
        KhachhangDTO kh = new KhachhangDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->khachhangDAO.upadateKhachHang(kh));
    }    
    
    @Test
    public void testupdateKhachHangkhValid() throws Exception {
        KhachhangDTO kh = new KhachhangDTO();
        
        kh.setMaKhachHang("kh01");
        kh.setTenKhachHang("Tran Trong Khoi");
        kh.setDiaChi("TP.HCM");
        kh.setEmail("khoine15@gmail.com");
        kh.setSDT("0908151508");        
        
        khachhangDAO.upadateKhachHang(kh);
    }

        /**
     * Test of getKhachhangByMaKH method, of class KhachhangDAO.
     */
    @Test
    public void testGetKhachhangByMaKHValid() throws Exception {
        String maKH = "kh02";
        KhachhangDTO result = khachhangDAO.getKhachHangByMaKhachHang(maKH);
        assertEquals(maKH, result.getMaKhachHang());
    }
    
    @Test
    public void testGetKhachhangByMaKHNull() throws Exception {
        String maKH = null;
        Exception ex = assertThrows(Exception.class, 
                ()->khachhangDAO.getKhachHangByMaKhachHang(maKH));
    }   
    
    @Test
    public void testGetKhachhangByMaKHEmpty() throws Exception {
        String maKH = "";
        Exception ex = assertThrows(Exception.class, 
                ()->khachhangDAO.getKhachHangByMaKhachHang(maKH));
    }    
}
