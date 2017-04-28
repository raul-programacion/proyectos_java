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
        LibroNodo auxbook = new LibroNodo();
        Ejemplar auxEjemplar = new Ejemplar();
        
        book.setLibroNodoCodigo("111777555");
        book.setLibroNodoTitulo("Mio Cid");
        
        auxEjemplar.setEjemplarIsbn("x111");
        auxEjemplar.setEjemplarCodigo("z111");
        
        book.setLibroNodoList(auxEjemplar);
        
        auxEjemplar.setEjemplarIsbn("x111");
        auxEjemplar.setEjemplarCodigo("z777");
        
        book.setLibroNodoList(auxEjemplar);
        
        biblioteca.add(book);
        
        LibroNodo book2 = new LibroNodo();
        Ejemplar auxEjemplar2 = new Ejemplar();
        
        book2.setLibroNodoCodigo("222999444");
        book2.setLibroNodoTitulo("Quijote");
        
        auxEjemplar2.setEjemplarIsbn("x222");
        auxEjemplar2.setEjemplarCodigo("z222");
        
        book2.setLibroNodoList(auxEjemplar2);
        
        auxEjemplar2.setEjemplarIsbn("x222");
        auxEjemplar2.setEjemplarCodigo("z333");
        
        book2.setLibroNodoList(auxEjemplar2);
        
        biblioteca.add(book2);
        
        
        
        
        
        
        for(i = 0;i<biblioteca.size();i++)
         {
            System.out.println("========================================"); 
            System.out.println("Libro"); 
            System.out.println("------------------------"); 
            System.out.println(biblioteca.get(i).getLibroNodoCodigo());
            System.out.println(biblioteca.get(i).getLibroNodoTitulo());
            //System.out.println(biblioteca.get(i));
            System.out.println("------------------------");
            System.out.println("Ejemplares en biblioteca"); 
            System.out.println("------------------------"); 
            auxbook=biblioteca.get(i);
            auxbook.getLibroNodoList();
            
            //System.out.println(biblioteca.get(i).getLibroNodoList());
            System.out.println("========================================");
         }
        
        
        
        
        
        
       
       
        
        
    }
    
}
