/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Radio extends Datos{
    private double CantidadRadio;
    private double RadioV;
    private double RadioW;
    private double TiempoRadio;

    public Radio(double CantidadRadio, double RadioV, double RadioW, double TiempoRadio) {
        super("Radio");
        this.CantidadRadio = CantidadRadio;
        this.RadioV = RadioV;
        this.RadioW = RadioW;
        this.TiempoRadio = TiempoRadio;
        this.Consumo= Math.round((this.ConsumoObj()) * 100.0) / 100.0;
    }
    public double ConsumoObj(){
        return TiempoRadio * RadioW;
    }

    @Override
    public String toString() {
        return "Radio{" + "CantidadRadio=" + CantidadRadio + ", RadioV=" + RadioV + ", RadioW=" + RadioW + ", TiempoRadio=" + TiempoRadio + '}';
    }
    
}
