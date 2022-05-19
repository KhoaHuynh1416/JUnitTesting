/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.SanPhamDTO;
import junit.framework.TestCase;
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
public class SanPhamDAOTest extends TestCase{
    
    SanPhamDAO sanphamDAO;
    
    public SanPhamDAOTest() throws Exception{
        sanphamDAO = new SanPhamDAO();
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp(){
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of docDSSP method, of class SanPhamDAO.
     */
    @Test
    public void testDocDSSP() throws Exception {
        assertNotNull(sanphamDAO.docDSSP());
    }

    /**
     * Test of them method, of class SanPhamDAO.
     */
    @Test
    public void testThemSPNull() throws Exception {
        SanPhamDTO sp = null;
        Exception ex = assertThrows(Exception.class, 
                ()->sanphamDAO.them(sp));        
    }
    
    @Test
    public void testThemSPEmpty() throws Exception {
        SanPhamDTO sp = new SanPhamDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->sanphamDAO.them(sp));        
    }   
    
    @Test
    public void testThemSPValid() throws Exception {
        SanPhamDTO sp = new SanPhamDTO();
        
        sp.setMaSP("SP021");
        sp.setMaNSX("NSX01");
        sp.setSoLuong(5);
        sp.setDonGia(5);
        sp.setMaLoai("loai01");
        sp.setTenSP("Nokia");
        
        sanphamDAO.them(sp); 
    }    

    /**
     * Test of xoa method, of class SanPhamDAO.
     */
    @Test
    public void testXoaSPNull() throws Exception {
        String masp = null;
        Exception ex = assertThrows(Exception.class, 
                ()->sanphamDAO.xoa(masp));
    }
 
    @Test
    public void testXoaSPEmpty() throws Exception {
        String masp = "";
        Exception ex = assertThrows(Exception.class, 
                ()->sanphamDAO.xoa(masp));
    }  
    
    @Test
    public void testXoaSPValid() throws Exception {
        String masp = "SP021";
        sanphamDAO.xoa(masp);
    }    
    /**
     * Test of sua method, of class SanPhamDAO.
     */
    @Test
    public void testSuaSPNull() throws Exception {
        SanPhamDTO sp = null;
        Exception ex = assertThrows(Exception.class, 
                ()->sanphamDAO.sua(sp));
    }

    @Test
    public void testSuaSPEmpty() throws Exception {
        SanPhamDTO sp = new SanPhamDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->sanphamDAO.sua(sp));
    }    
    
    @Test
    public void testSuaSPValid() throws Exception {
        SanPhamDTO sp = new SanPhamDTO();
        
        sp.setMaSP("sp001");
        sp.setMaNSX("NSX01");
        sp.setSoLuong(5);
        sp.setDonGia(5);
        sp.setMaLoai("loai01");
        sp.setTenSP("Nokia");        
        
        sanphamDAO.sua(sp);
    }    
    /**
     * Test of getSanphamByMaSP method, of class SanPhamDAO.
     */
    @Test
    public void testGetSanphamByMaSPValid() throws Exception {
        String maSP = "sp001";
        SanPhamDTO result = sanphamDAO.getSanphamByMaSP(maSP);
        assertEquals(maSP, result.getMaSP());
    }
    
    @Test
    public void testGetSanphamByMaSPNull() throws Exception {
        String maSP = null;
        Exception ex = assertThrows(Exception.class, 
                ()->sanphamDAO.getSanphamByMaSP(maSP));
    }   
    
    @Test
    public void testGetSanphamByMaSPEmpty() throws Exception {
        String maSP = "";
        Exception ex = assertThrows(Exception.class, 
                ()->sanphamDAO.getSanphamByMaSP(maSP));
    }    
    /**
     * Test of getMaSanpham method, of class SanPhamDAO.
     */
    
    @Test
    public void testGetMaSanpham() throws Exception {
        assertNotNull(sanphamDAO.getMaSanpham());
    }    
}
