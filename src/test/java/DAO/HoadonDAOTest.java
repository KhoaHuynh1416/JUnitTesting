/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.HoadonDTO;
import java.util.List;
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
public class HoadonDAOTest extends TestCase {
    
    HoadonDAO hoadonDAO;
    
    public HoadonDAOTest() {
        hoadonDAO = new HoadonDAO();
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
     * Test of getAllHoaon method, of class HoadonDAO.
     */
    @Test
    public void testGetAllHoaDon() throws Exception {
        assertNotNull(hoadonDAO.getAllHoaDon());
    }

    /**
     * Test of insertHoadon method, of class HoadonDAO.
     */
    @Test
    public void testInsertHoadonNull() throws Exception {
        HoadonDTO hd = null;
        Exception ex = assertThrows(Exception.class, 
                ()->hoadonDAO.insertHoadon(hd));        
    }
    
    @Test
    public void testInsertHoadonEmpty() throws Exception {
        HoadonDTO hd = new HoadonDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->hoadonDAO.insertHoadon(hd));        
    }   
    
    @Test
    public void testInsertHoadonValid() throws Exception {
        HoadonDTO hd = new HoadonDTO();
        
        hd.setMaHD("HD01");
        hd.setNgayxuat("24/04/2021");
        hd.setMaKH("KH01");
        hd.setMaNV("NV01");
        hd.setTongtien(50000);
        hd.setTongKM(5000);
        hd.setTientra(45000);
        
        hoadonDAO.insertHoadon(hd); 
    }    

    /**
     * Test of deleteHoadon method, of class HoadonDAO.
     */
    @Test
    public void testDeleteHoadonNull() throws Exception {
        String mahd = null;
        Exception ex = assertThrows(Exception.class, 
                ()->hoadonDAO.deleteHoadon(mahd));
    }
 
    @Test
    public void testDeleteHoadonEmpty() throws Exception {
        String mahd = "";
        Exception ex = assertThrows(Exception.class, 
                ()->hoadonDAO.deleteHoadon(mahd));
    }  
    
    @Test
    public void testDeleteHoadonValid() throws Exception {
        String mahd = "HD01";
        hoadonDAO.deleteHoadon(mahd);
    }    
    
    /**
     * Test of getHoadonByMaHoadon method, of class HoadonDAO.
     */
    @Test
    public void testGetHoadonByMaHoadonValid() throws Exception {
        String maHD = "hd01";
        HoadonDTO result = hoadonDAO.getHoadonByMaHoadon(maHD);
        assertEquals(maHD, result.getMaHD());
    }
    
    @Test
    public void testGetHoadonByMaHoadonNull() throws Exception {
        String maHD = null;
        Exception ex = assertThrows(Exception.class, 
                ()->hoadonDAO.getHoadonByMaHoadon(maHD));
    }   
    
    @Test
    public void testGetHoadonByMaHoadonEmpty() throws Exception {
        String maHD = "";
        Exception ex = assertThrows(Exception.class, 
                ()->hoadonDAO.getHoadonByMaHoadon(maHD));
    }    
       
    /**
     * Test of getHoadonByMaKH method, of class HoadonDAO.
     */
    @Test
    public void testGetHoadonByMaKHValid() throws Exception {
        String maKH = "kh01";
        List<HoadonDTO> result = hoadonDAO.getHoadonByMaKH(maKH);
        assertNotNull(result);
    }
    
    @Test
    public void testGetHoadonByMaKHNull() throws Exception {
        String maKH = null;
        Exception ex = assertThrows(Exception.class, 
                ()->hoadonDAO.getHoadonByMaKH(maKH));
    }   
    
    @Test
    public void testGetHoadonByMaKHEmpty() throws Exception {
        String maKH = "";
        Exception ex = assertThrows(Exception.class, 
                ()->hoadonDAO.getHoadonByMaKH(maKH));
    }        
    /**
     * Test of getHoadonByMaNV method, of class HoadonDAO.
     */
    @Test
    public void testGetHoadonByMaNVValid() throws Exception {
        String maNV = "nv01";
        List<HoadonDTO> result = hoadonDAO.getHoadonByMaNV(maNV);
        assertNotNull(result);
    }
    
    @Test
    public void testGetHoadonByMaNVNull() throws Exception {
        String maNV = null;
        Exception ex = assertThrows(Exception.class, 
                ()->hoadonDAO.getHoadonByMaNV(maNV));
    }   
    
    @Test
    public void testGetHoadonByMaNVEmpty() throws Exception {
        String maNV = "";
        Exception ex = assertThrows(Exception.class, 
                ()->hoadonDAO.getHoadonByMaNV(maNV));
    }        
    /**
     * Test of getHoadonByDate method, of class HoadonDAO.
     */
    @Test
    public void testGetHoadonByDateValid() throws Exception {
        String tuNgay = "24/04/2021";
        String denNgay = "30/04/2021";
        List<HoadonDTO> result = hoadonDAO.getHoadonByDate(tuNgay, denNgay);
        assertNotNull(result);
    }
    
    @Test
    public void testGetHoadonByDateNull() throws Exception {
        String tuNgay = null;
        String denNgay = null;
        Exception ex = assertThrows(Exception.class, 
                ()->hoadonDAO.getHoadonByDate(tuNgay, denNgay));
    }   
    
    @Test
    public void testGetHoadonByDateEmpty() throws Exception {
        String tuNgay = "";
        String denNgay = "";
        Exception ex = assertThrows(Exception.class, 
                ()->hoadonDAO.getHoadonByDate(tuNgay, denNgay));
    }     

}
