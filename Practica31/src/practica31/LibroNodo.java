/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica31;

/**
 *
 * @author adminprofe
 */
public class LibroNodo {
    
    private String cod_lib;
    private String titulo;
    
    
    
    
    public LibroNodo()
    {
        
    }
    
    public LibroNodo(String cod_lib,String titulo)
    {
        this.cod_lib=cod_lib;
        this.titulo=titulo;
    }
    
    public String getLibroIsbn ()
    {
        return cod_lib;
    }
    
    public String getLibroTitulo ()
    {
        return titulo;
    }
    
    public void setLibroIsbn(String cod_lib)
    {
        this.cod_lib=cod_lib;
    }
    
    public void setLibroTitulo(String titulo)
    {
        this.titulo=titulo;
    }
    
}
