/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Nevera extends Datos {
    private double CantidadNevera;
    private double PotenciaNeveraWh;
    //private double TiempoNevera;

    public Nevera(double CantidadNevera, double PotenciaNeveraWh) {
        super("Nevera");
        this.CantidadNevera = CantidadNevera;
        this.PotenciaNeveraWh = PotenciaNeveraWh;
        //this.TiempoNevera = TiempoNevera;
        this.Consumo= Math.round((this.ConsumoObj()) * 100.0) / 100.0;
    }
    
    public double ConsumoObj(){
        return PotenciaNeveraWh*24;
    }

    @Override
    public String toString() {
        return "Nevera{" + "CantidadNevera=" + CantidadNevera + ", PotenciaNeveraWh=" + PotenciaNeveraWh + '}';
    }
    
    
}
