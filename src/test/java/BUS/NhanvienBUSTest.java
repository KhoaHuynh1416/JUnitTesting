/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.NhanvienDAO;
import DTO.NhanvienDTO;
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
public class NhanvienBUSTest {
    NhanvienBUS func;
    public NhanvienBUSTest() {
        func=new NhanvienBUS();
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
     * Test of showAll method, of class NhanvienBUS.
     */
    @Test
    public void testShowAll() {
        ArrayList<NhanvienDTO> result = func.showAll();
        assertNotNull(result);
    }

    /**
     * Test of addnv method, of class NhanvienBUS.
     */
    
    @Test
    public void testFindnv() {
        String attri = "MaNhanVien";
        String manv = "NV001";
        String expResult = "NV001";
        ArrayList<NhanvienDTO> ls = func.findnv(attri, manv);
        NhanvienDTO result= ls.get(0);
        assertEquals(expResult, result.getmanv());
    }
    
    @Test
    public void testFindluong() {
        String luong = ">7000000";
        ArrayList<NhanvienDTO> result = func.findluong(">7000000");
        assertNotNull(result);
    }
    
}
