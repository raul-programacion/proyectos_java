/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica31;

import java.util.ArrayList;

/**
 *
 * @author adminprofe
 */
public class Practica31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i;
        
        ArrayList<LibroNodo> biblioteca;
        
        biblioteca = new ArrayList<LibroNodo>();
        
        LibroNodo book = new LibroNodo();
        Ejemplar auxEjemplar = new Ejemplar();
        
        book.setLibroNodoCodigo("111777555");
        book.setLibroNodoTitulo("Mio Cid");
        
        auxEjemplar.setEjemplarIsbn("x111");
        auxEjemplar.setEjemplarCodigo("z111");
        
        book.setLibroNodoList(auxEjemplar);
        
        auxEjemplar.setEjemplarIsbn("x111");
        auxEjemplar.setEjemplarCodigo("z222");
        
        book.setLibroNodoList(auxEjemplar);
        
        biblioteca.add(book);
        
        for(i = 0;i<biblioteca.size();i++)
         {
            System.out.println(biblioteca.get(i).getLibroNodoCodigo());
            System.out.println(biblioteca.get(i).getLibroNodoTitulo());
            //System.out.println(biblioteca.get(i).getLibroNodoList());
         }
        
        
        
        
        
        
       
       
        
        
    }
    
}
