/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad5;

import static actividad5.calculadorTest.calPrueba;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Valeria
 */
public class divisionTest {
   
    
    public divisionTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        calPrueba = new calculador();
        System.out.print("Bienvenido a las pruebas unitarias: DIVISION TEST");
    }
    
    @AfterClass
    public static void tearDownClass() {
         System.out.print("La operación ha finalizado");
    }
    
    @Before
    public void setUp() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    
    @After
    public void tearDown() {
        System.out.print("Prueba finalizada de  DIVISION TEST, campos en 0");
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionCero() {
        calPrueba.division(20, 0);
    }
    
}
