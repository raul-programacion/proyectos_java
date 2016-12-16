/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica21;


import java.util.Scanner;
import practica21.Circunferencia;
/**
 *
 * @author adminprofe
 */
public class Practica21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double radio;
        
        Circunferencia circun = new Circunferencia();
        Circunferencia circun2 = new Circunferencia(5);
        
        Scanner teclado = new Scanner(System.in);
        
         System.out.print("Introduzca radio: ");
         radio = teclado.nextDouble();
         
         circun.setRadio(radio);//Cambiar valor del radio
         
         
         
         
         //Imprimir cálculos
         System.out.println("Longitud circunferencia: "+circun.LongitudCircunferencia());
         System.out.println("Area circulo:"+circun.AreaCirculo());
        
        
        
        
        
    }
    
}
