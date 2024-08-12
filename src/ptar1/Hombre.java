/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ptar1;

/**
 *
 * @author cdiaz
 */
public class Hombre extends Humano {
    public String cromosomas = "xy";
    private String cartillaMilitar;
//getters
    public String getCromosomas() {
        return cromosomas;
    }

    public String getCartillaMilitar() {
        return cartillaMilitar;
    }
//setters     
    public void setCromosomas(String cromosomas) {
        this.cromosomas = cromosomas;    
    }

    public void setCartillaMilitar(String cartillaMilitar) {
        this.cartillaMilitar = cartillaMilitar;
    }
//constructor
    public Hombre(String nombre, int edad) {
        super(nombre, edad);
    }
    
    
    public void Hombre(String cartillaMilitar){
    
    };
}
