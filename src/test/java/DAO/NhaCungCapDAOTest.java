/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.NhaCungCapDTO;
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
public class NhaCungCapDAOTest {
    NhaCungCapDAO func;
    public NhaCungCapDAOTest() {
        func= new NhaCungCapDAO();
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
     * Test of getDanhSachNhaCungCap method, of class NhaCungCapDAO.
     */
    @Test
    public void testGetDanhSachNhaCungCap() throws Exception {
        ArrayList<NhaCungCapDTO> result = func.getDanhSachNhaCungCap();
        assertNotNull(result);
    }

    /**
     * Test of add method, of class NhaCungCapDAO.
     */
    @Test
    public void testAddvalid() throws Exception{
        NhaCungCapDTO nhaCungCap = new NhaCungCapDTO();
        nhaCungCap.setMaNCC("NCC01");
        nhaCungCap.setTenNCC("TGDD");
        nhaCungCap.setDiaChi("TPHCM");
        nhaCungCap.setSDT("0123456789");
        func.add(nhaCungCap);
    }
    
    @Test
    public void testAddNull()  throws Exception{
        NhaCungCapDTO ncc= null;
        Exception ex = assertThrows(Exception.class, 
                ()->func.add(ncc));
    }
    
    @Test
    public void testAddEmpty() throws Exception{
        NhaCungCapDTO ncc= new NhaCungCapDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->func.add(ncc));
    }
    
    @Test
    public void testDeleteByIdValid() throws Exception {
        String maNCC = "NCC01";
        func.deleteById(maNCC);
    }
    
    @Test
    public void testDeleteByIdNull()  throws Exception {
        String maNCC = null;
        Exception ex = assertThrows(Exception.class, 
                ()->func.deleteById(maNCC));
    }
    
    @Test
    public void testDeleteByIdEmpty()  throws Exception {
        String maNCC = "";
        Exception ex = assertThrows(Exception.class, 
                ()->func.deleteById(maNCC));
    }
    /**
     * Test of update method, of class NhaCungCapDAO.
     */
    @Test
    public void testUpdateValid() throws Exception{
        NhaCungCapDTO nhaCungCap = new NhaCungCapDTO();
        nhaCungCap.setMaNCC("NCC01");
        nhaCungCap.setTenNCC("DMX");
        nhaCungCap.setDiaChi("HaNoi");
        nhaCungCap.setSDT("9876543210");
        func.update(nhaCungCap);
    }
    
    @Test
    public void testUpdateNull()  throws Exception{
        NhaCungCapDTO ncc= null;
        Exception ex = assertThrows(Exception.class, 
                ()->func.update(ncc));
    }
    
    @Test
    public void testUpdateEmpty()  throws Exception{
        NhaCungCapDTO ncc= new NhaCungCapDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->func.update(ncc));
    }
    /**
     * Test of getNhaCungCapById method, of class NhaCungCapDAO.
     */
    @Test
    public void testGetNhaCungCapByIdValid() throws Exception {
        String maNCC = "ncc001";
        String expResult = "ncc001";
        NhaCungCapDTO result = func.getNhaCungCapById(maNCC);
        assertEquals(expResult, result.getMaNCC());
    }
    
    @Test
    public void testGetNhaCungCapByIdNull() throws Exception {
        String maNCC=null;
        Exception ex = assertThrows(Exception.class, 
                ()->func.getNhaCungCapById(maNCC));
    }
    @Test
    public void testGetNhaCungCapByIdEmpty() throws Exception {
        String maNCC="";
        Exception ex = assertThrows(Exception.class, 
                ()->func.getNhaCungCapById(maNCC));
    }
}
