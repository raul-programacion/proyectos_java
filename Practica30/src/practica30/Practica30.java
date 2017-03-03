/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica30;

/**
 *
 * @author adminprofe
 */
public class Practica30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona socio = new Persona("18999888","Raul","777888999","Quijote");
        
        Libro book = new Libro();
        
       book.setLibroIsbn("111777555");
       book.setLibroTitulo("Mio Cid");
       
       socio.setLibroList(book);
        
        
        System.out.print("Dni: ");
        System.out.println(socio.getPersonaDni());
        System.out.print("Nombre: ");
        System.out.println(socio.getPersonaNombre());
        System.out.println("Libros");
        System.out.println("======================");
        socio.getLibroList();
        
        
    }
    
}
