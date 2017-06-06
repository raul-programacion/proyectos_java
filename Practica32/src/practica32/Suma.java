/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica32;

/**
 *
 * @author adminprofe
 */
public class Suma  extends Operacion {
    
      
    double result_suma;
       
    public Suma(double n1, double n2) {
             
        super(n1, n2, '+');
        result_suma = n1 + n2;
        res=result_suma;
    }
    
    
    
}
