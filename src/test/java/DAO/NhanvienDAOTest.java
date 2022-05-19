/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.NhanvienDTO;
import java.util.ArrayList;
import java.util.Arrays;
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
public class NhanvienDAOTest {
    
    public NhanvienDAOTest() {
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
     * Test of showAll method, of class NhanvienDAO.
     */
    @Test
    public void testShowAll() {
        System.out.println("showAll");
        ArrayList<NhanvienDTO> result = NhanvienDAO.showAll();
        assertNotNull(result);
    }

    /**
     * Test of addnv method, of class NhanvienDAO.
     */
    @Test
    public void testAddnvValid() throws Exception {
        NhanvienDTO nv = new NhanvienDTO();
        nv.setmanv("nv001");
        nv.settennv("Nguyen An");
        nv.setaddress("TPHCM");
        nv.setemail("a@gmail.com");
        nv.setsdt("0123456789");
        nv.setluong("200000000");
        NhanvienDAO.addnv(nv);
    }
    
    @Test
    public void testAddnvNull() throws Exception {
        NhanvienDTO nv= null;
        Exception ex = assertThrows(Exception.class, 
                ()->NhanvienDAO.addnv(nv));
    }
    
    @Test
    public void testAddnvEmpty() throws Exception{
        NhanvienDTO nv= new NhanvienDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->NhanvienDAO.addnv(nv));
    }
    /**
     * Test of editnv method, of class NhanvienDAO.
     */
    @Test
    public void testEditnvValid() throws Exception{
        NhanvienDTO nv = new NhanvienDTO();
        nv.setmanv("nv001");
        nv.settennv("Nguyen An");
        nv.setaddress("TPHCM");
        nv.setemail("a@gmail.com");
        nv.setsdt("0123456789");
        nv.setluong("200000000");
        NhanvienDAO.editnv(nv);
    }
    @Test
    public void testEditnvNull() throws Exception{
        NhanvienDTO nv = null;
        Exception ex = assertThrows(Exception.class, 
                ()->NhanvienDAO.editnv(nv));
    }
    
    @Test
    public void testEditnvEmpty() throws Exception{
        NhanvienDTO nv= new NhanvienDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->NhanvienDAO.editnv(nv));
    }
    /**
     * Test of delnv method, of class NhanvienDAO.
     */
    @Test
    public void testDelnvValid()  throws Exception{
        String manv="nv001";
        NhanvienDAO.delnv(manv);
    }
    
    @Test
    public void testDelnvNull()   throws Exception{
        String manv =null;
        Exception ex = assertThrows(Exception.class, 
                ()->NhanvienDAO.delnv(manv));
    }
    
    @Test
    public void testDelnvEmpty()  throws Exception{
        String manv="";
        Exception ex = assertThrows(Exception.class, 
                ()->NhanvienDAO.delnv(manv));
    }
    /**
     * Test of findnv method, of class NhanvienDAO.
     */
    @Test
    public void testFindnvValid() throws Exception{
        ArrayList<NhanvienDTO> ls=NhanvienDAO.findnv("MaNhanVien","NV001");
        assertNotNull(ls);
    }

    /**
     * Test of findluong method, of class NhanvienDAO.
     */
    @Test
    public void testFindnvNull() throws Exception{
        String manv=null;
        String attri=null;
        Exception ex = assertThrows(Exception.class, 
                ()->NhanvienDAO.findnv(attri,manv));
    }
    
    @Test
    public void testFindnvEmpty() throws Exception{
        String manv="MaNhanVien";
        String attri="";
        Exception ex = assertThrows(Exception.class, 
                ()->NhanvienDAO.findnv(attri,manv));
    }
    
    @Test
    public void testFindluongValid() throws Exception{
        String num = ">7000000";
        ArrayList<NhanvienDTO> result = NhanvienDAO.findluong(num);
        assertNotNull(result);
    }
    @Test
    public void testFindluongNull() throws Exception{
        String num =null;
        Exception ex = assertThrows(Exception.class, 
                ()->NhanvienDAO.findluong(num));
    }
    @Test
    public void testFindluongEmpty() throws Exception{
        String num ="";
        Exception ex = assertThrows(Exception.class, 
                ()->NhanvienDAO.findluong(num));
    }
}
