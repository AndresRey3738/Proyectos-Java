/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class EquipoSon extends Datos {
    private double CantidadEquipoSon;
    private double EquipoSonV;
    private double EquipoSonW;
    private double TiempoEquipoSon;

    public EquipoSon(double CantidadEquipoSon, double EquipoSonV, double EquipoSonW, double TiempoEquipoSon) {
        super("EquipoSon");
        this.CantidadEquipoSon = CantidadEquipoSon;
        this.EquipoSonV = EquipoSonV;
        this.EquipoSonW = EquipoSonW;
        this.TiempoEquipoSon = TiempoEquipoSon;
        this.Consumo= Math.round((this.ConsumoObj()) * 100.0) / 100.0;
    }
    
    public double ConsumoObj(){
        return TiempoEquipoSon * EquipoSonW;
    }

    @Override
    public String toString() {
        return "EquipoSon{" + "CantidadEquipoSon=" + CantidadEquipoSon + ", EquipoSonV=" + EquipoSonV + ", EquipoSonW=" + EquipoSonW + ", TiempoEquipoSon=" + TiempoEquipoSon + '}';
    }
    
    
}
