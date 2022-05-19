/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.TaikhoanDTO;
import java.util.List;
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
public class TaikhoanDAOTest {
    
    TaikhoanDAO tkDAO;
    
    public TaikhoanDAOTest() {
        tkDAO = new TaikhoanDAO();
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
     * Test of getAllTaikhoans method, of class TaikhoanDAO.
     */
    @Test
    public void testGetAllTaikhoans() {
        List<TaikhoanDTO> result = tkDAO.getAllTaikhoans();
        assertNotNull(result);
    }

    /**
     * Test of getTaiKhoanByMaTK method, of class TaikhoanDAO.
     */
    @Test
    public void testGetTaiKhoanByMaTKValid() {
        String maTK = "TK001";
        TaikhoanDTO result = tkDAO.getTaiKhoanByMaTK(maTK);
        assertEquals(maTK, result.getMaTK());
    }

    @Test
    public void testGetTaiKhoanByMaTKNull() {
        String maTK = null;
        Exception ex = assertThrows(Exception.class, 
                ()->tkDAO.getTaiKhoanByMaTK(maTK));
    }

    @Test
    public void testGetTaiKhoanByMaTKEmpty() {
        String maTK = "";
        Exception ex = assertThrows(Exception.class, 
                ()->tkDAO.getTaiKhoanByMaTK(maTK));
    }    
    
    /**
     * Test of addTaikhoan method, of class TaikhoanDAO.
     */
    @Test
    public void testAddTaikhoanValid() {
        TaikhoanDTO taikhoan = new TaikhoanDTO("TK123","123456","user");
        tkDAO.addTaikhoan(taikhoan);
    }

    @Test
    public void testAddTaikhoanEmpty() {
        TaikhoanDTO taikhoan = new TaikhoanDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->tkDAO.addTaikhoan(taikhoan));
    }

    @Test
    public void testAddTaikhoanNull() {
        TaikhoanDTO taikhoan = null;
        Exception ex = assertThrows(Exception.class, 
                ()->tkDAO.addTaikhoan(taikhoan));
    }    
    /**
     * Test of deleteTaikhoan method, of class TaikhoanDAO.
     */
    @Test
    public void testDeleteTaikhoanValid() {
        String maTK = "TK010";
        tkDAO.deleteTaikhoan(maTK);
    }

    @Test
    public void testDeleteTaikhoanNull() {
        String maTK = null;
        Exception ex = assertThrows(Exception.class, 
                ()->tkDAO.deleteTaikhoan(maTK));
    }

    @Test
    public void testDeleteTaikhoanEmpty() {
        String maTK = "";
        Exception ex = assertThrows(Exception.class, 
                ()->tkDAO.deleteTaikhoan(maTK));
    }    
    /**
     * Test of updateTaikhoan method, of class TaikhoanDAO.
     */
    @Test
    public void testUpdateTaikhoanValid() {
        TaikhoanDTO taikhoan = new TaikhoanDTO("TK005","444444","user");
        tkDAO.updateTaikhoan(taikhoan);
    }
 
    @Test
    public void testUpdateTaikhoanNull() {
        TaikhoanDTO taikhoan = null;
        Exception ex = assertThrows(Exception.class, 
                ()->tkDAO.updateTaikhoan(taikhoan));
    }

    @Test
    public void testUpdateTaikhoanEmpty() {
        TaikhoanDTO taikhoan = new TaikhoanDTO();
        Exception ex = assertThrows(Exception.class, 
                ()->tkDAO.updateTaikhoan(taikhoan));
    }    
}
