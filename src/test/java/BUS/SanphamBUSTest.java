/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DTO.SanPhamDTO;
import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *
 * @author PC
 */
public class SanphamBUSTest extends TestCase{
    
    SanphamBUS spBUS;
    
    public SanphamBUSTest() {
        spBUS = new SanphamBUS();
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
     * Test of timKiemTheoMaTenSP method, of class SanphamBUS.
     */
/*    @Test
    public void testTimKiemTheoMaTenSP() throws Exception {
        String key = "001";
        ArrayList<SanPhamDTO> result = spBUS.timKiemTheoMaTenSP(key);

        for (SanPhamDTO sp : result) {
            if (!sp.getMaSP().contains(key) && !sp.getTenSP().contains(key)) {
                fail("Tìm kiếm sai");
            }
        }
        assertNotNull(result);
    }

    @Test
    public void testTimKiemTheoMaTenSPNull() throws Exception {
        String key = null;
        Exception ex = assertThrows(Exception.class,
                () -> spBUS.timKiemTheoMaTenSP(key));
    }

    @Test
    public void testTimKiemTheoMaTenSPEmpty() throws Exception {
        String key = "";
        Exception ex = assertThrows(Exception.class,
                () -> spBUS.timKiemTheoMaTenSP(key));
    }

    @Test
    public void testTimKiemTheoMaTenSPSymbols() throws Exception {
        String key = "\"\"**();/";
        Exception ex = assertThrows(Exception.class,
                () -> spBUS.timKiemTheoMaTenSP(key));
    }
*/
    /**
     * Test of timkiemTheoHangLoai method, of class SanphamBUS.
     */
/*    @Test
    public void testTimkiemTheoHangLoai() throws Exception {
        String key = "Samsung";
        ArrayList<SanPhamDTO> result = spBUS.timkiemTheoHangLoai(key);
        for (SanPhamDTO sp : result) {
            assertEquals("nsx02", sp.getMaNSX());
        }
    }

    @Test
    public void testTimkiemTheoHangLoaiNull() throws Exception {
        String key = null;
        Exception ex = assertThrows(Exception.class,
                () -> spBUS.timkiemTheoHangLoai(key));
    }

    @Test
    public void testTimkiemTheoHangLoaiEmpty() throws Exception {
        String key = "";
        Exception ex = assertThrows(Exception.class,
                () -> spBUS.timkiemTheoHangLoai(key));
    }    
    /**
     * Test of timKiemTheoGiaSP method, of class SanphamBUS.
     */
    @Test
    public void testTimKiemTheoGiaSP() throws Exception {
        int lower = 1000000;
        int higher = 5000000;
        ArrayList<SanPhamDTO> Temp = new ArrayList<>();
        ArrayList<SanPhamDTO> result = spBUS.timKiemTheoGiaSP(lower, higher, Temp);
        for(SanPhamDTO sp : result){
            if(sp.getDonGia() < lower || sp.getDonGia() > higher)
                fail("Tìm kiếm sai");
        }
    }
    
    @Test
    public void testTimKiemTheoGiaSPInvalid() throws Exception{
        int lower = 5000000;
        int higher = 1000000;
        ArrayList<SanPhamDTO> Temp = new ArrayList<>();
        Exception ex = assertThrows(Exception.class,
                ()->spBUS.timKiemTheoGiaSP(lower, higher, Temp));   
    }

    @Test
    public void testTimKiemTheoGiaSPNegative() throws Exception{
        int lower = -1000;
        int higher = 1000;
        ArrayList<SanPhamDTO> Temp = new ArrayList<>();
       Exception ex = assertThrows(Exception.class,
                ()->spBUS.timKiemTheoGiaSP(lower, higher, Temp)); 
        ex = assertThrows(Exception.class,
                ()->spBUS.timKiemTheoGiaSP(higher, lower, Temp));
    }
    /**
     * Test of timkiemSPTheoMaSP method, of class SanphamBUS.
     */
    @Test
    public void testTimkiemSPTheoMaSP() throws Exception {
        String maSP = "sp001";
        SanPhamDTO result = spBUS.timkiemSPTheoMaSP(maSP);
        assertEquals(maSP, result.getMaSP());
    }    
}
