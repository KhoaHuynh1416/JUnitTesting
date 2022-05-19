/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.LoaiSanPhamDTO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author MTT
 */
public class LoaiSanPhamDAOTest {
    
    LoaiSanPhamDAO loaispDAO;
    
    public LoaiSanPhamDAOTest() {
        loaispDAO = new LoaiSanPhamDAO();
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
     * Test of docDSSP method, of class SanPhamDAO.
     */
    @Test
    public void testGetDataFromDatabase() throws Exception {
        assertNotNull(loaispDAO.getDataFromDatabase());
    }

    /**
     * Test of add method, of class LoaiSanPhamDAO.
     */
    @Test
    public void testAddNull() throws Exception {
        LoaiSanPhamDTO loaisp = null;
        Exception ex = assertThrows(Exception.class, 
                ()->loaispDAO.add(loaisp));        
    }
    
    @Test
    public void testAddEmpty() throws Exception {
        LoaiSanPhamDTO loaisp = new LoaiSanPhamDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->loaispDAO.add(loaisp));        
    }   
    
    @Test
    public void testAddValid() throws Exception {
        LoaiSanPhamDTO loaisp = new LoaiSanPhamDTO();
        
        loaisp.setMaLoai("loai01");
        loaisp.setTenLoai("IOS");
        
        loaispDAO.add(loaisp); 
    }    

    /**
     * Test of sua method, of class SanPhamDAO.
     */
    @Test
    public void testUpdateNull() throws Exception {
        LoaiSanPhamDTO loaisp = null;
        Exception ex = assertThrows(Exception.class, 
                ()->loaispDAO.update(loaisp));
    }

    @Test
    public void testUpdateEmpty() throws Exception {
        LoaiSanPhamDTO loaisp = new LoaiSanPhamDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->loaispDAO.update(loaisp));
    }    
    
    @Test
    public void testUpdateValid() throws Exception {
        LoaiSanPhamDTO loaisp = new LoaiSanPhamDTO();
        
        loaisp.setMaLoai("loai01");
        loaisp.setTenLoai("Android"); 
        
        loaispDAO.update(loaisp);
    }    

    /**
     * Test of deleteById method, of class LoaiSanPhamDAO.
     */
    @Test
    public void testDeleteByIdValid() throws Exception {
        String maLoai = "loai01";
        loaispDAO.deleteById(maLoai);
    }
    
    @Test
    public void testDeleteByIdNull() throws Exception {
        String maLoai = null;
        Exception ex = assertThrows(Exception.class, 
                ()->loaispDAO.deleteById(maLoai));
    }   
    
    @Test
    public void testDeleteByIdEmpty() throws Exception {
        String maLoai = "";
        Exception ex = assertThrows(Exception.class, 
                ()->loaispDAO.deleteById(maLoai));
    }  
       
    /**
     * Test of searchById method, of class LoaiSanPhamDAO.
     */
    @Test
    public void testSearchByIdValid() throws Exception {
        String maLoai = "loai01";
        LoaiSanPhamDTO result = loaispDAO.searchById(maLoai);
        assertEquals(maLoai, result.getMaLoai());
    }
    
    @Test
    public void testSearchByIdNull() throws Exception {
        String maLoai = null;
        Exception ex = assertThrows(Exception.class, 
                ()->loaispDAO.searchById(maLoai));
    }   
    
    @Test
    public void testSearchByIdEmpty() throws Exception {
        String maLoai = "";
        Exception ex = assertThrows(Exception.class, 
                ()->loaispDAO.searchById(maLoai));
    }     
}
