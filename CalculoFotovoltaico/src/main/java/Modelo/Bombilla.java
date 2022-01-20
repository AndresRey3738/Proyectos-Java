/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Bombilla extends Datos{
    private double CantidadBombilla;
    private String TipoBombilla;
    private double PotenciaBombilla;
    private double TiempoBombilla;

    public Bombilla(double CantidadBombilla, String TipoBombilla, double PotenciaBombilla, double TiempoBombilla) {
        super("Bombilla");
        this.CantidadBombilla = CantidadBombilla;
        this.TipoBombilla = TipoBombilla;
        this.PotenciaBombilla = PotenciaBombilla;
        this.TiempoBombilla = TiempoBombilla;
        this.Consumo = Math.round((this.ConsumoObj()) * 100.0) / 100.0;
    }
    public double ConsumoObj(){
        return TiempoBombilla * PotenciaBombilla;
    }

    @Override
    public String toString() {
        return "Bombilla{" + "CantidadBombilla=" + CantidadBombilla + ", TipoBombilla=" + TipoBombilla + ", PotenciaBombilla=" + PotenciaBombilla + ", TiempoBombilla=" + TiempoBombilla + '}';
    }
    
    
}
