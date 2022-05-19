/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import DTO.LoaiSanPhamDTO;
import java.util.ArrayList;
import org.junit.Assert;
/**
 *
 * @author MTT
 */
public class LoaiSanPhamBUSTest {
    
    LoaiSanPhamBUS loaispBUS;
    
    public LoaiSanPhamBUSTest() {
        loaispBUS = new LoaiSanPhamBUS();
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    /**
     *  Test of getDanhSachLoaiSanPham, of class LoaiSanPhamBus
     */
            
    public void testGetLoaiSanPhamById() throws Exception{
        String maLoai = "loai01";
        LoaiSanPhamDTO result = loaispBUS.getLoaiSanPhamById(maLoai);
        Assert.assertEquals(maLoai, result.getMaLoai());
    }
    
     /**
     * Test of getDanhSachLoaiSanPhamSearchByName, of class LoaiSanPhamBUS
     */
    public void testGetDanhSachLoaiSanPhamSearchByName() throws Exception{
        String tenLoai = "Iphone";
        ArrayList<LoaiSanPhamDTO> result = loaispBUS.getDanhSachLoaiSanPhamSearchByName(tenLoai);
        Assert.assertNotNull(result);
    }
}
