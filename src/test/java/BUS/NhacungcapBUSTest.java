/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DTO.NhaCungCapDTO;
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
public class NhacungcapBUSTest {
    NhacungcapBUS func;
    public NhacungcapBUSTest() {
        func=  new NhacungcapBUS();
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
     * Test of getDanhSachNCC method, of class NhacungcapBUS.
     */
    @Test
    public void testGetDanhSachNCC() {
        ArrayList<NhaCungCapDTO> result = func.getDanhSachNCC();
        assertNotNull(result);
    }

    /**
     * Test of getDanhSachNhaCungCap method, of class NhacungcapBUS.
     */
    

    /**
     * Test of add method, of class NhacungcapBUS.
     */
    

    /**
     * Test of getMaNhaCungCapCuoi method, of class NhacungcapBUS.
     */
    

    /**
     * Test of getMaNhaCungCapByIndex method, of class NhacungcapBUS.
     */
    @Test
    public void testGetMaNhaCungCapByIndex() {
        int index = 0;
        String expResult = "ncc01";
        String result = func.getMaNhaCungCapByIndex(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of getNhaCungCapByMaNCC method, of class NhacungcapBUS.
     */
    @Test
    public void testGetNhaCungCapByMaNCC() {
        String maNhaCungCap = "ncc01";
        String expResult = "ncc01";
        NhaCungCapDTO result = func.getNhaCungCapByMaNCC(maNhaCungCap);
        assertEquals(expResult, result.getMaNCC());
    }

    /**
     * Test of getNhaCungCapByMaNhaCungCap method, of class NhacungcapBUS.
     */
    

    /**
     * Test of getNhaCCBySDT method, of class NhacungcapBUS.
     */
    @Test
    public void testGetNhaCCBySDT() {
        String SDT = "0123456789";
        String expResult = "0123456789";
        NhaCungCapDTO result = func.getNhaCCBySDT(SDT);
        assertEquals(expResult, result.getMaNCC());
    }

    /**
     * Test of getNhaCungCapBySDT method, of class NhacungcapBUS.
     */
    

    /**
     * Test of getDanhSachNCCByTen method, of class NhacungcapBUS.
     */
    @Test
    public void testGetDanhSachNCCByTen() {
        String tenNhaCungCap = "TGDD";
        ArrayList<NhaCungCapDTO> result = func.getDanhSachNCCByTen(tenNhaCungCap);
        assertNotNull(result);
    }

    
    
}
