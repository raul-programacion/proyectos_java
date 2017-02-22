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
public class Libro {
    
    private String isbn;
    private String titulo;
    
    
    public Libro()
    {
        
    }
    
    public Libro(String isbn,String titulo)
    {
        this.isbn=isbn;
        this.titulo=titulo;
    }
    
    public String getLibroIsbn ()
    {
        return isbn;
    }
    
    public String getLibroTitulo ()
    {
        return titulo;
    }
    
    public void setLibroIsbn(String isbn)
    {
        this.isbn=isbn;
    }
    
    public void setLibroTitulo(String titulo)
    {
        this.titulo=titulo;
    }
    
    
    
    
}
