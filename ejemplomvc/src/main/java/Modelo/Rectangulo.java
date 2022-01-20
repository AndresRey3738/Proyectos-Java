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
public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    public Rectangulo(double base, double altura){
        super("Rectangulo");
        this.base=base;
        this.altura=altura;
        this.areaFigura= Math.round((this.area())*100.0)/100.0;
    }
    @Override
    public double area(){
        return this.base*this.altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
}
