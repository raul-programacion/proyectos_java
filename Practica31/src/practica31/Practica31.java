/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica31;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adminprofe
 */
public class Practica31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i,j;
        int max=2;
        
        Scanner sc = new Scanner(System.in);
        String codigo,codigoEjemplar;
        String titulo,isbn;

        
        ArrayList<LibroNodo> biblioteca;
        
        biblioteca = new ArrayList<LibroNodo>();
        
        
       
        LibroNodo auxbook = new LibroNodo();
        //Ejemplar auxEjemplar = new Ejemplar();
        
       /* book.setLibroNodoCodigo("111777555");
        book.setLibroNodoTitulo("Mio Cid");
        
        auxEjemplar.setEjemplarIsbn("x111");
        auxEjemplar.setEjemplarCodigo("z111");
        
        book.setLibroNodoList(auxEjemplar);
        
        auxEjemplar.setEjemplarIsbn("x111");
        auxEjemplar.setEjemplarCodigo("z777");
        
        book.setLibroNodoList(auxEjemplar);
        
        biblioteca.add(book);
        
        //LibroNodo book2 = new LibroNodo();
        //Ejemplar auxEjemplar2 = new Ejemplar();
        
        book.setLibroNodoCodigo("222999444");
        book.setLibroNodoTitulo("Quijote");
        
        auxEjemplar.setEjemplarIsbn("x222");
        auxEjemplar.setEjemplarCodigo("z222");
        
        book.setLibroNodoList(auxEjemplar);
        
        auxEjemplar.setEjemplarIsbn("x222");
        auxEjemplar.setEjemplarCodigo("z333");
        
        book.setLibroNodoList(auxEjemplar);
        
        biblioteca.add(book);*/
         
       
      for(j = 0; j<max ;j++)
       {
           System.out.println("Dame codigo Libro");
           codigo = sc.nextLine();
           System.out.println("Dame titulo Libro");
           titulo = sc.nextLine();
           
           LibroNodo book = new LibroNodo(codigo,titulo);
           Ejemplar auxEjemplar = new Ejemplar();
           
           System.out.println("Dame codigo Ejemplar1");
           codigoEjemplar = sc.nextLine();
           System.out.println("Dame isbn Ejemplar1");
           isbn = sc.nextLine();
           
           auxEjemplar.setEjemplarIsbn(isbn);
           auxEjemplar.setEjemplarCodigo(codigoEjemplar);
           
           book.setLibroNodoList(auxEjemplar);
           
           System.out.println("Dame codigo Ejemplar2");
           codigoEjemplar = sc.nextLine();
           System.out.println("Dame isbn Ejemplar2");
           isbn = sc.nextLine();
           
           auxEjemplar.setEjemplarIsbn(isbn);
           auxEjemplar.setEjemplarCodigo(codigoEjemplar);
           
           book.setLibroNodoList(auxEjemplar);
           
           
           
          
          
          
          
          
            biblioteca.add(book);
           
            
           
       //biblioteca.add(new LibroNodo("111777555","Mio Cid"));
       
       //biblioteca.add(new LibroNodo("222999444","El Quijote"));
       
       }
        
        
     
        
        
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
