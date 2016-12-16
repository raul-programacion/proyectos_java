/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica21;


//import java.math.*;
/**
 *
 * @author adminprofe
 */
public class Circunferencia {
    
    private double radio;
    
    Circunferencia(double radio)
    {
        this.radio=radio;
        
    }

    Circunferencia() {
       
    }
    
    public void setRadio(double radio) //no esta en la inicialización
    {
        this.radio = radio;
    }
    
    
    public double LongitudCircunferencia()
    {
        return radio*2*Math.PI;
    }
    
    public double AreaCirculo()
    {
        return Math.PI*Math.pow(radio,2);
    }
    
}
