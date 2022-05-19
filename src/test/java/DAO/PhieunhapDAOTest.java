/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.PhieunhapDTO;
import java.sql.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *
 * @author PC
 */
public class PhieunhapDAOTest {
    
    PhieunhapDAO pnDAO;
    
    public PhieunhapDAOTest() throws Exception{
        pnDAO = new PhieunhapDAO();
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
     * Test of docDSPN method, of class PhieunhapDAO.
     */
    @Test
    public void testDocDSPN() throws Exception {
        assertNotNull(pnDAO.docDSPN());
    }

    /**
     * Test of them method, of class PhieunhapDAO.
     */
    @Test
    public void testThemValid() throws Exception {
        PhieunhapDTO pn = new PhieunhapDTO();
        pn.setMaPN("PN001");
        pn.setMaNV("NV001");
        pn.setMaNCC("NCC01");
        pn.setTongTien(5);
        pn.setNgayNhap(Date.valueOf("2021-1-1"));
        pnDAO.them(pn);
    }
    
    @Test
    public void testThemNull() throws Exception{
        PhieunhapDTO pn = null;
        Exception ex = assertThrows(Exception.class,
                ()->pnDAO.them(pn));
    }

    @Test
    public void testThemEmpty() throws Exception{
        PhieunhapDTO pn = new PhieunhapDTO();
        Exception ex = assertThrows(Exception.class,
                ()->pnDAO.them(pn));
    }    
    
    /**
     * Test of xoa method, of class PhieunhapDAO.
     */
    @Test
    public void testXoaValid() throws Exception {
        String mapn = "PN010";
        pnDAO.xoa(mapn);
    }

    @Test
    public void testXoaNull() throws Exception{
        String mapn = null;
        Exception ex = assertThrows(Exception.class,
                ()->pnDAO.xoa(mapn));
    }
    
    @Test
    public void testXoaEmpty() throws Exception{
        String mapn = "";
        Exception ex = assertThrows(Exception.class,
                ()->pnDAO.xoa(mapn));
    }    
    /**
     * Test of sua method, of class PhieunhapDAO.
     */
    @Test
    public void testSuaValid() throws Exception {
        PhieunhapDTO pn = new PhieunhapDTO();
        pn.setMaPN("PN002");
        pn.setMaNV("NV002");
        pn.setMaNCC("NCC02");
        pn.setTongTien(10);
        pn.setNgayNhap(Date.valueOf("2021-2-2"));
        pnDAO.sua(pn);
    }
    
    @Test
    public void testSuaEmpty() throws Exception{
        PhieunhapDTO pn = new PhieunhapDTO();
        Exception ex = assertThrows(Exception.class,
                ()->pnDAO.sua(pn));
    }
 
    @Test
    public void testSuaNull() throws Exception{
        PhieunhapDTO pn = null;
        Exception ex = assertThrows(Exception.class,
                ()->pnDAO.sua(pn));
    }    
}
