/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.NhaSanXuatDTO;
import java.util.ArrayList;
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
public class NhaSanXuatDAOTest {
    NhaSanXuatDAO func;
    public NhaSanXuatDAOTest() {
    func= new NhaSanXuatDAO();
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
     * Test of getDanhSachNhaSanXuat method, of class NhaSanXuatDAO.
     */
    @Test
    public void testGetDanhSachNhaSanXuat() throws Exception {
        NhaSanXuatDAO instance = new NhaSanXuatDAO();
        ArrayList<NhaSanXuatDTO> result = instance.getDanhSachNhaSanXuat();
        assertNotNull(result);
    }

    /**
     * Test of add method, of class NhaSanXuatDAO.
     */
    @Test
    public void testAddValid() throws Exception {
        NhaSanXuatDTO nhaSanXuat = new NhaSanXuatDTO();
        nhaSanXuat.setMaNSX("NSX01");
        nhaSanXuat.setTenNSX("Samsung");
        nhaSanXuat.setDiaChi("TPHCM");
        nhaSanXuat.setSDT("0123456789");
        func.add(nhaSanXuat);
    }
    
    @Test
    public void testAddNull() throws Exception{
        NhaSanXuatDTO nsx=null;
        Exception ex = assertThrows(Exception.class, 
                ()->func.add(nsx));
    }
    
    @Test
    public void testAddEmpty() throws Exception{
        NhaSanXuatDTO nsx=new NhaSanXuatDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->func.add(nsx));
    }
    /**
     * Test of deleteById method, of class NhaSanXuatDAO.
     */
    @Test
    public void testDeleteById() throws Exception{
        String maNSX = "NSX01";
        func.deleteById(maNSX);
    }
    
    @Test
    public void testDeleteByIdNull() throws Exception{
        String maNSX=null;
        Exception ex = assertThrows(Exception.class, 
                ()->func.deleteById(maNSX));
    }
    
    @Test
    public void testDeleteByIdEmpty() throws Exception{
        String maNSX="";
        Exception ex = assertThrows(Exception.class, 
                ()->func.deleteById(maNSX));
    }
    /**
     * Test of update method, of class NhaSanXuatDAO.
     */
    @Test
    public void testUpdateValid() throws Exception{
        NhaSanXuatDTO nhaSanXuat = new NhaSanXuatDTO();
        nhaSanXuat.setMaNSX("NSX01");
        nhaSanXuat.setTenNSX("Nokia");
        nhaSanXuat.setDiaChi("HaNoi");
        nhaSanXuat.setSDT("9876543210");
        func.update(nhaSanXuat);
        
    }
    
    @Test
    public void testUpdateNull()  throws Exception{
        NhaSanXuatDTO nsx= null;
        Exception ex = assertThrows(Exception.class, 
                ()->func.update(nsx));
    }
    
    @Test
    public void testUpdateEmpty()  throws Exception{
        NhaSanXuatDTO nsx= new NhaSanXuatDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->func.update(nsx));
    }
    /**
     * Test of getNhaSanXuatById method, of class NhaSanXuatDAO.
     */
    @Test
    public void testGetNhaSanXuatByIdValid() throws Exception {
        String maNSX = "NSX01";
        String expResult = "NSX01";
        NhaSanXuatDTO result = func.getNhaSanXuatById(maNSX);
        assertEquals(expResult, result.getMaNSX());
    }
    
    @Test
    public void testGetNhaSanXuatByIdNull() throws Exception{
        String maNSX=null;
        Exception ex = assertThrows(Exception.class, 
                ()->func.getNhaSanXuatById(maNSX));
    }
    
    @Test
    public void testGetNhaSanXuatByIdEmpty() throws Exception{
        String maNSX="";
        Exception ex = assertThrows(Exception.class, 
                ()->func.getNhaSanXuatById(maNSX));
    }
}
