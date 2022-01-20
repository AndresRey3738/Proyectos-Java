/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ManejarDatos;

/**
 *
 * @author ancar
 */
public class VistaConsola {

    public static void main(String[] args) {

        ManejarDatos manejarDatos = new ManejarDatos();
        manejarDatos.CrearBombilla(1, "Incandesente", 60, 10);

        System.out.println("Listado de Figuras");
        System.out.println("\t" + manejarDatos.listadoDeObjetos());
    }
}
