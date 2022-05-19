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
import DTO.HoadonDTO;
import java.util.List;
import org.junit.Assert;

/**
 *
 * @author MTT
 */
public class HoadonBUSTest {
    
    HoadonBUS hdBUS;
    public HoadonBUSTest() {
        hdBUS = new HoadonBUS();
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
    
    public void testGetHoadonByMaHoadon() throws Exception{
        String maHD = "HD01";
        HoadonDTO result = hdBUS.getHoadonByMaHoadon(maHD);
        Assert.assertEquals(maHD, result.getMaHD());
    }
    
    public void testGetHoadonByMaKH() throws Exception{
        String maKH = "KH01";
        List<HoadonDTO> result = hdBUS.getHoadonByMaKH(maKH);
        Assert.assertNotNull(result);
    }
    
    public void testGetHoadonByDate() throws Exception{
        String tuNgay = "25/04/2021";
        String denNgay = "30/04/2021";
        List<HoadonDTO> result = hdBUS.getHoadonByDate(tuNgay, denNgay);
        Assert.assertNotNull(result);
    }
    
}
