/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica22;

import java.util.ArrayList;

/**
 *
 * @author adminprofe
 */
public class Practica22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ArrayList<String> nombres = new ArrayList<>();//Viene por defecto el string
        
        nombres.add("Ana");
        nombres.add("Luisa");
        nombres.add("Felipe");
        
        System.out.println(nombres); // [Ana, Luisa, Felipe]
        
        nombres.add(1, "Pablo");
        System.out.println(nombres); // [Ana, Pablo, Luisa, Felipe]
        
        nombres.remove(0);
        System.out.println(nombres); // [Pablo, Luisa, Felipe]
        
        nombres.set(0,"Alfonso");
        System.out.println(nombres); // [Alfonso, Luisa, Felipe]
        
        String s = nombres.get(1);
        String ultimo = nombres.get(nombres.size() - 1);
        System.out.println(s + " " + ultimo);  // Luisa Felipe
        
        
    }
    
}
