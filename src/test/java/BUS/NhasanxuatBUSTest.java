/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DTO.NhaSanXuatDTO;
import java.util.ArrayList;
import java.util.Vector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tat Gia Vi
 */
public class NhasanxuatBUSTest {
    NhasanxuatBUS func;
    public NhasanxuatBUSTest() {
    func= new NhasanxuatBUS();
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
     * Test of getDanhSachNhaSX method, of class NhasanxuatBUS.
     */
    @Test
    public void testGetDanhSachNhaSX() {
        ArrayList<NhaSanXuatDTO> result = func.getDanhSachNhaSX();
        assertNotNull(result);
    }

    /**
     * Test of getDanhSachNhaSanXuat method, of class NhasanxuatBUS.
     */

    /**
     * Test of add method, of class NhasanxuatBUS.
     */
   
    

    /**
     * Test of getMaNhaSanXuatByIndex method, of class NhasanxuatBUS.
     */
    @Test
    public void testGetMaNhaSanXuatByIndex() {
        
        int index = 0;
        NhasanxuatBUS instance = new NhasanxuatBUS();
        String expResult = "nsx01";
        String result = instance.getMaNhaSanXuatByIndex(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of getNhaSanXuatByMaNSX method, of class NhasanxuatBUS.
     */
    @Test
    public void testGetNhaSanXuatByMaNSX() {
        String maNhaSanXuat = "nsx01";
        String expResult = "nsx01";
        NhaSanXuatDTO result = func.getNhaSanXuatByMaNSX(maNhaSanXuat);
        assertEquals(expResult, result.getMaNSX());
    }

    /**
     * Test of getNhaSanXuatByMaNhaSanXuat method, of class NhasanxuatBUS.
     */

    /**
     * Test of getNhaSXBySDT method, of class NhasanxuatBUS.
     */
    @Test
    public void testGetNhaSXBySDT() {
        String SDT = "9876543210";
        String expResult = "9876543210";
        NhaSanXuatDTO result = func.getNhaSXBySDT(SDT);
        assertEquals(expResult, result.getSDT());
    }

    /**
     * Test of getNhaSanXuatBySDT method, of class NhasanxuatBUS.
     */

    /**
     * Test of getDanhSachNSXByTen method, of class NhasanxuatBUS.
     */
    @Test
    public void testGetDanhSachNSXByTen() {
        String tenNhaSanXuat = "Samsung";
        ArrayList<NhaSanXuatDTO> result = func.getDanhSachNSXByTen(tenNhaSanXuat);
        assertNotNull(result);
    }

    /**
     * Test of getDanhSachNhaSanXuatByTen method, of class NhasanxuatBUS.
     */
    
}
