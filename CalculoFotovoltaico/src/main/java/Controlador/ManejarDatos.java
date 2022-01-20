/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.util.ArrayList;

public class ManejarDatos {

    public ArrayList<Datos> listadoObjetos;
    private ArrayList<Datos> listadoObjetosAux;
    private Datos dato;
    

    public ManejarDatos() {
        this.listadoObjetos = new ArrayList<Datos>();
        this.listadoObjetosAux = new ArrayList<Datos>();
    }

    public void CrearBombilla(double CantidadBombilla, String TipoBombilla, double PotenciaBombilla, double TiempoBombilla) {
        dato = new Bombilla(CantidadBombilla, TipoBombilla, PotenciaBombilla, TiempoBombilla);
        this.AgregarObj(dato);
    }

    public void CrearEquipoSon(double CantidadEquipoSon, double EquipoSonV, double EquipoSonW, double TiempoEquipoSon) {
        dato = new EquipoSon(CantidadEquipoSon, EquipoSonV, EquipoSonW, TiempoEquipoSon);
        this.AgregarObj(dato);
    }

    public void CrearRadio(double CantidadRadio, double RadioV, double RadioW, double TiempoRadio) {
        dato = new Radio(CantidadRadio, RadioV, RadioW, TiempoRadio);
        this.AgregarObj(dato);
    }

    public void CrearNevera(double CantidadNevera, double PotenciaNeveraWh) {
        dato = new Nevera(CantidadNevera, PotenciaNeveraWh);
        this.AgregarObj(dato);
    }

    // public void CalculoBateria (){
    //}
    public void AgregarObj(Datos dato) {
        this.listadoObjetos.add(dato);
    }

    public double ConsumoTotal() {
        double suma = 0;
        for (Datos dato : listadoObjetos) {
            suma += dato.ConsumoObj();
        }
        return Math.round((suma) * 100.0) / 100.0;
    }

    public double ConsumoPromedio() {
        double suma = 0;
        for (Datos dato : listadoObjetos) {
            suma += dato.ConsumoObj();
        }
        return Math.round((suma / listadoObjetos.size()) * 100.0) / 100.0;
    }

    public String listadoDeObjetos() {
        return "{" + "listadoObjetos=" + listadoObjetos + '}';
    }

    public ArrayList<String> listadoDeObjetosArray() {
        ArrayList<String> datos = new ArrayList<String>();
        for (Datos dato : this.listadoObjetos) {
            datos.add(dato.getNombre() + ";" + dato.getConsumo());
        }

        return datos;
    }

    public String listadoDeObjetos(String nombre) {
        this.listadoObjetosAux.clear();
        for (Datos dato : this.listadoObjetos) {
            if (dato.getNombre().compareTo(nombre) == 0) {
                this.listadoObjetosAux.add(dato);
            }
        }
        if (this.listadoObjetosAux.size() == 0) {
            return "Sin objetos";
        } else {
            return "{" + "listadoObjetos=" + listadoObjetosAux + '}';
        }
    }

    public ArrayList<String> listadoDeObjetosArray(String nombre) {
        ArrayList<String> datos = new ArrayList<String>();
        for (Datos dato : this.listadoObjetos) {
            if (dato.getNombre().compareTo(nombre) == 0) {
                datos.add(dato.getNombre() + ";" + dato.ConsumoObj());
            }
        }
        return datos;
    }
}
