/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica30;

import java.util.ArrayList;

/**
 *
 * @author adminprofe
 */
public class Persona {
    
    private String dni;
    private String nombre;
    
    private ArrayList<Libro> prestamo;

    
    public Persona()
    {
        this.prestamo = new ArrayList<Libro>();
        
    }
    
    public Persona(String dni,String nombre,String isbn,String titulo)
    {
        Libro auxLibro=new Libro(isbn,titulo);
        this.dni=dni;
        this.nombre=nombre;
        this.prestamo = new ArrayList<Libro>();
        prestamo.add(auxLibro);
    }
    
    public String getPersonaDni ()
    {
        return dni;
    }
    
    public String getPersonaNombre ()
    {
        return nombre;
    }
    
    public void setPersonaDni(String dni)
    {
        this.dni=dni;
    }
    
    public void setLibroTitulo(String nombre)
    {
        this.nombre=nombre;
    }
    
}
