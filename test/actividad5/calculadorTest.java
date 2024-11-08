/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad5;

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
public class calculadorTest {
    public static calculador calPrueba;
    
    public calculadorTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        calPrueba = new calculador();
        System.out.print("Bienvenido a las pruebas unitarias: CALCULADOR");
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
        System.out.print("Prueba finalizada de CALCULADOR, campos en 0");
    }

    @Test
    public void testSuma() {
        assertEquals(6.1 , calPrueba.suma(3.5, 2.6),0.001);
    }
    
    @Test
    public void testResta() {
        assertEquals(2.4, calPrueba.resta(5.8, 3.4),0.001);
    }
}
