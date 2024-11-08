/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad5;

import static actividad5.calculadorTest.calPrueba;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

/**
 *
 * @author Valeria
 */

public class parameterTest {
   
    private double num1;
    private double num2;
    private double esperado;
    
    public parameterTest(double num1, double num2, double esperado ) {
        this.num1 = num1;
        this.num2 = num2;
        this.esperado = esperado;
    }
    
    @BeforeClass
    public static void setUpClass() {
        calPrueba = new calculador();
        System.out.print("Bienvenido a las pruebas unitarias: PARAMETER TEST");
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
        System.out.print("Prueba finalizada de PARAMETER TEST, campos en 0");
    }
    
    @Parameterized.Parameters
    public static Iterable<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][] {
            {8, 7, 15},
            {2, 0, 20},
            {10, -1, -9}
        });
    } 
    
    @Test
    public void testSuma() {
        calculador calculador = new calculador();
        assertEquals(esperado, calculador.suma(num1, num2), 0.001);
    }
}
