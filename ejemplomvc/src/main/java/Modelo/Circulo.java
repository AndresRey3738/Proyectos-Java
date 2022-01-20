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
public class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo(double radio) {
        super("Circulo");
        this.radio = radio;
        this.areaFigura = Math.round((this.area()) * 100.0) / 100.0;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

}
