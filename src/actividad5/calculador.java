/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad5;

/**
 *
 * @author Valeria
 */
public class calculador {
    
    public double suma(double num1, double num2){
        return num1 + num2;
    }
    
    public double resta(double num1, double num2){
        return num1 - num2;
    }
    
    public int multiplicacion(int num1, int num2){
        return num1 * num2;
    }
    
    public int division(int num1, int num2){
        if(num2!=0){
            return num1 / num2;
        }else{
            throw new ArithmeticException("No se puede dividir por 0");
        }
    }
    
}
