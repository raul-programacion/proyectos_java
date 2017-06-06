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
public class Operacion {
    
     
  protected double n1;
  protected double n2;
  protected double res;
  protected char operacion;

    
    public Operacion(double n1, double n2, char operacion) {
        
        this.n1 = n1;
        this.n2 = n2;
        this.operacion = operacion;
    }
    
        
    public void mostrarResultado(){
        
        System.out.println(n1+" "+operacion+" "+n2+" = "+res);
        
    }
    
}
