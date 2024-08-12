/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ptar1;

/**
 *
 * @author cdiaz
 */
public class Humano implements AccionesHumano, AccionesGeneral {
public String nombre;    
public int edad;

public Humano(String nombre, int edad){
this.nombre=nombre;
this.edad=edad;
}

//getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
//setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
//override methods for Acciones general and Acciones Humano interfaces methods
    @Override
    public void bailar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void despalzarse() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
