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
public class LibroNodo {
    
    private String cod_lib;
    private String titulo;
    
    private ArrayList<Ejemplar> copia;
    
    
    public LibroNodo()
    {
        this.copia = new ArrayList<Ejemplar>();
    }
    
    public LibroNodo(String cod_lib,String titulo)
    {
        this.cod_lib=cod_lib;
        this.titulo=titulo;
        this.copia = new ArrayList<Ejemplar>();
    }
    
    
    
    public String getLibroNodoCodigo ()
    {
        return cod_lib;
    }
    
    public String getLibroNodoTitulo ()
    {
        return titulo;
    }
    
    public void setLibroNodoCodigo(String cod_lib)
    {
        this.cod_lib=cod_lib;
    }
    
    public void setLibroNodoTitulo(String titulo)
    {
        this.titulo=titulo;
    }
    
     public void setLibroNodoList(Ejemplar auxEjemplar)
    {
       copia.add(auxEjemplar);
    }
    
    public void getLibroNodoList()
    {
        
         for(int i = 0;i<copia.size();i++)
         {
            System.out.println(copia.get(i).getEjmeplarIsbn());
            System.out.println(copia.get(i).getEjemplarCodigo());
         }
       
         
         //http://puntocomnoesunlenguaje.blogspot.com.es/2012/12/arraylist-en-java.html
       /*for(Persona tmpLibro:Libro){
            System.out.println("Nombre del libro: " + tmpLibro.getLibroIsbn());
        }*/
    }
    
    
}
