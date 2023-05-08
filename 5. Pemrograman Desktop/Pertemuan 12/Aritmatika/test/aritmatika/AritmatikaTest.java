package aritmatika;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import aritmatika.Aritmatika;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alya Aiman Salsabila Arif
 */
public class AritmatikaTest {
    
    public AritmatikaTest() {
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
     * Test of main method, of class Aritmatika.
     */
    @Test
    public void testKali() {
        System.out.println("kali");
        double a = 2.0;
        double b = 3.0;
        Aritmatika instance = new Aritmatika();
        double expResult = 6.0;
        double result = instance.kali(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testBagi() {
        System.out.println("bagi");
        double a = 6.0;
        double b = 3.0;
        Aritmatika instance = new Aritmatika();
        double expResult = 2.0;
        double result = instance.bagi(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testTambah() {
        System.out.println("tambah");
        double a = 2.0;
        double b = 3.0;
        Aritmatika instance = new Aritmatika();
        double expResult = 5.0;
        double result = instance.tambah(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testKurang() {
        System.out.println("kurang");
        double a = 3.0;
        double b = 2.0;
        Aritmatika instance = new Aritmatika();
        double expResult = 1.0;
        double result = instance.kurang(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of main method, of class Aritmatika.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Aritmatika.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }
}
