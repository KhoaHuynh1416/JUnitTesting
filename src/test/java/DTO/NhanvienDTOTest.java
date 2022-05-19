/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author Tat Gia Vi
 */
public class NhanvienDTOTest {
    
    public NhanvienDTOTest() {
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
     * Test of NhanvienDTO method, of class NhanvienDTO.
     */
    @Test
    public void testNhanvienDTO() {
        System.out.println("NhanvienDTO");
        String[] info={"NV001","Nguyen A","TPHCM","nguyen@gmail.com","0123456789","TK001","50000"};
        NhanvienDTO instance = new NhanvienDTO();
        instance.NhanvienDTO(info[0],info[1],info[2],info[3],info[4],info[5],info[6]);
        String[] result={"","","","","","",""};
        result[0]=instance.getmanv();
        result[1]=instance.gettennv();
        result[2]=instance.getaddress();
        result[3]= instance.getemail();
        result[4]=instance.getsdt();
        result[5]=instance.getmatk();
        result[6]=instance.getluong();
        assertArrayEquals(info,result);
    }

    /**
     * Test of getmanv method, of class NhanvienDTO.
     */
    @Test
    public void testGetmanv() {
        System.out.println("getmanv");
        NhanvienDTO instance = new NhanvienDTO();
        String expResult = "";
        String result = instance.getmanv();
        assertEquals(expResult,result);
    }

    /**
     * Test of gettennv method, of class NhanvienDTO.
     */
    @Test
    public void testGettennv() {
        System.out.println("gettennv");
        NhanvienDTO instance = new NhanvienDTO();
        String expResult = "";
        String result = instance.gettennv();
        assertEquals(expResult,result);
    }

    /**
     * Test of getaddress method, of class NhanvienDTO.
     */
    @Test
    public void testGetaddress() {
        System.out.println("getaddress");
        NhanvienDTO instance = new NhanvienDTO();
        String expResult = "";
        String result = instance.getaddress();
        assertEquals(expResult,result);
    }

    /**
     * Test of getemail method, of class NhanvienDTO.
     */
    @Test
    public void testGetemail() {
        System.out.println("getemail");
        NhanvienDTO instance = new NhanvienDTO();
        String expResult = "";
        String result = instance.getemail();
        assertEquals(expResult,result);
    }

    /**
     * Test of getsdt method, of class NhanvienDTO.
     */
    @Test
    public void testGetsdt() {
        System.out.println("getsdt");
        NhanvienDTO instance = new NhanvienDTO();
        String expResult = "";
        String result = instance.getsdt();
        assertEquals(expResult,result);
    }

    /**
     * Test of getmatk method, of class NhanvienDTO.
     */
    @Test
    public void testGetmatk() {
        System.out.println("getmatk");
        NhanvienDTO instance = new NhanvienDTO();
        String expResult = "";
        String result = instance.getmatk();
        assertEquals(expResult,result);
    }

    /**
     * Test of getluong method, of class NhanvienDTO.
     */
    @Test
    public void testGetluong() {
        System.out.println("getluong");
        NhanvienDTO instance = new NhanvienDTO();
        String expResult = "";
        String result = instance.getluong();
        assertEquals(expResult,result);
    }

    /**
     * Test of setmanv method, of class NhanvienDTO.
     */
    @Test
    public void testSetmanv() {
        System.out.println("setmanv");
        String manv = "NV022";
        NhanvienDTO instance = new NhanvienDTO();
        instance.setmanv(manv);
        String expected="NV022";
        assertEquals(expected,instance.getmanv());
    }
    @Test
    public void testSetmanvSymbol() {
        System.out.println("setmanv");
        String manv = "NV@##@%%^!$021";
        NhanvienDTO instance = new NhanvienDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setmanv(manv),"nothing here" );
    }

    /**
     * Test of settennv method, of class NhanvienDTO.
     */
    @Test
    public void testSettennv() {
        System.out.println("settennv");
        String tennv = "Adu darkwa";
        String expected="Adu darkwa";
        NhanvienDTO instance = new NhanvienDTO();
        instance.settennv(tennv);
        assertEquals(expected,instance.gettennv());
    }
    public void testSettennvSymbol() {
        System.out.println("settennv");
        String tennv = "Adu dar12354##@!kwa";
        NhanvienDTO instance = new NhanvienDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.settennv(tennv),"nothing here" );
    }
    /**
     * Test of setaddress method, of class NhanvienDTO.
     */
    @Test
    public void testSetaddress() {
        System.out.println("setaddress");
        String address = "TPHCM";
        String expected = "TPHCM";
        NhanvienDTO instance = new NhanvienDTO();
        instance.setaddress(address);
        assertEquals(expected,instance.getaddress());
    }
    @Test
    public void testSetaddressSymbol() {
        System.out.println("setaddress");
        String address = "#@#@$$@@TPHCM";
        NhanvienDTO instance = new NhanvienDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setaddress(address),"nothing here" );
    }

    /**
     * Test of setemail method, of class NhanvienDTO.
     */
    @Test
    public void testSetemailSymbol() {
        System.out.println("setemail");
        String email = "@#$#@%#@@@giavitat73@gmail.com";
        NhanvienDTO instance = new NhanvienDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setemail(email),"nothing here" );
    }
    /**
     * Test of setsdt method, of class NhanvienDTO.
     */
    @Test
    public void testSetsdt() {
        String sdt = "0767400569";
        NhanvienDTO instance = new NhanvienDTO();
        instance.setsdt(sdt);
        String expected="0767400569";
        assertEquals(expected,instance.getsdt());
    }
    @Test
    public void testSetsdtSymbol(){
        String sdt="#@#@#@#$!saabbs0123456789";
        NhanvienDTO instance = new NhanvienDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setsdt(sdt),"nothing here" );
    }
    /**
     * Test of setmatk method, of class NhanvienDTO.
     */
    @Test
    public void testSetmatk() {
        String matk = "TK001";
        String expected = "TK001";
        NhanvienDTO instance = new NhanvienDTO();
        instance.setmatk(matk);
        assertEquals(expected,instance.getmatk());
    }
    @Test
    public void testSetmatkSymbol() {
        String matk = "%$@$@#%%%@TK001";
        NhanvienDTO instance = new NhanvienDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setmatk(matk),"nothing here" );
    }
    /**
     * Test of setluong method, of class NhanvienDTO.
     */
    @Test
    public void testSetluong() {
        System.out.println("setluong");
        String luong = "5000";
        String expected="5000";
        NhanvienDTO instance = new NhanvienDTO();
        instance.setluong(luong);
        assertEquals(expected,instance.getluong());
    }
    @Test
    public void testSetluongSymbol(){
        String luong = "@#!@#!@$!dsaweq@%55000";
        NhanvienDTO instance = new NhanvienDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setluong(luong),"nothing here" );
    }
    public void testSetluongLarge(){
        String luong = "50000000000000000000000000000000000";
        NhanvienDTO instance = new NhanvienDTO();
        Exception ex= assertThrows(Exception.class,
                ()->instance.setluong(luong),"nothing here" );
    }
}
