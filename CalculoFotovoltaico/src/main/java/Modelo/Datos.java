/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ancar
 */
public abstract class Datos {

    private String nombre;

    protected double Consumo;
    
    

    public Datos(String nombre) {
        this.nombre = nombre;
        this.Consumo = 0;
        
    }
    public abstract double ConsumoObj();
    

    @Override
    public String toString() {
        return "Datos{" + "nombre=" + nombre + ", Consumo=" + Consumo + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getConsumo() {
        return Consumo;
    }

    public void setConsumo(double Consumo) {
        this.Consumo = Consumo;
    }
    
    

}
