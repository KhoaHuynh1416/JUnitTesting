/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DTO.PhieunhapDTO;
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
 * @author PC
 */
public class PhieunhapBUSTest {
    
    PhieunhapBUS pnBUS;
    
    public PhieunhapBUSTest() {
        pnBUS = new PhieunhapBUS();
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
     * Test of timKiemTheoMaPN method, of class PhieunhapBUS.
     */
    @Test
    public void testTimKiemTheoMaPNValid() throws Exception {
        String key = "6";
        ArrayList<PhieunhapDTO> result = pnBUS.timKiemTheoMaPN(key);
        for(PhieunhapDTO pn : result){
            if(!pn.getMaPN().contains(key)){
                fail("Tìm kiếm lỗi");
            }
        }
    }  
    
    @Test
    public void testTimKiemTheoMaPNNull() throws Exception{
        String key = null;
        Exception ex = assertThrows(Exception.class,
                ()->pnBUS.timKiemTheoMaPN(key));
    }    
    
    @Test
    public void testTimKiemTheoMaPNEmpty() throws Exception{
        String key = "";
        Exception ex = assertThrows(Exception.class,
                ()->pnBUS.timKiemTheoMaPN(key));
    }    
    
    @Test
    public void testTimKiemTheoMaPNSymbols() throws Exception{
        String key = "\"\"**();";
        Exception ex = assertThrows(Exception.class,
                ()->pnBUS.timKiemTheoMaPN(key));
    }    
}
