/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ptar1;

/**
 *
 * @author cdiaz
 */
public class Mujer extends Humano {
    public String cromosomas;
    private String cartillaMilitarVoluntaria;
    private String curp;
    
    public Mujer(String nombre, int edad) {
        super(nombre, edad);
    }

    public String getCromosomas() {
        return cromosomas;
    }

    public String getCartillaMilitarVoluntaria() {
        return cartillaMilitarVoluntaria;
    }

    public String getCurp() {
        return curp;
    }

    public void setCromosomas(String cromosomas) {
        this.cromosomas = cromosomas;
    }

    public void setCartillaMilitarVoluntaria(String cartillaMilitarVoluntaria) {
        this.cartillaMilitarVoluntaria = cartillaMilitarVoluntaria;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
    
    
    
    public void Mujer(String curp){
    }
    
    //Java no permite el uso del mismo nombre de funcion se agrego edad para eliminar el error con el mismo tipo de parametro String
    public void Mujer (String cartillaMilitarVoluntaria, int edad){
    }
    
    
    
    
    
}
