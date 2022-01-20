package controlador;

import Modelo.*;
import java.util.ArrayList;

public class ManipularFiguras {

    private ArrayList<FiguraGeometrica> listadoFiguras;
    private ArrayList<FiguraGeometrica> listadoFigurasAux;
    private FiguraGeometrica figura;

    public ManipularFiguras() {
        this.listadoFiguras = new ArrayList<FiguraGeometrica>();
        this.listadoFigurasAux = new ArrayList<FiguraGeometrica>();
    }

    public void crearRectangulo(double base, double altura) {
        figura = new Rectangulo(10, 5);
        this.agregarFigura(figura);
    }

    public void crearCirculo(double radio) {
        FiguraGeometrica figura = new Circulo(radio);
        this.agregarFigura(figura);
    }

    public void crearTriangulo(double base, double altura) {
        figura = new Triangulo(3, 6);
        this.agregarFigura(figura);
    }

    public void agregarFigura(FiguraGeometrica figura) {
        this.listadoFiguras.add(figura);
    }

    public double areaPromedio() {
        double suma = 0;
        for (FiguraGeometrica figura : listadoFiguras) {
            suma += figura.area();
        }
        return Math.round((suma / listadoFiguras.size()) * 100.0) / 100.0;
    }

    public String listadoDeFiguras() {
        return "{" + "listadoFiguras=" + listadoFiguras + '}';
    }

    public ArrayList<String> listadoDeFigurasArray() {
        ArrayList<String> datos = new ArrayList<String>();
        for (FiguraGeometrica figura : this.listadoFiguras) {
            datos.add(figura.getNombre() + ";" + figura.getAreaFigura());
        }

        return datos;
    }

    public String listadoDeFiguras(String nombre) {
        this.listadoFigurasAux.clear();
        for (FiguraGeometrica figura : this.listadoFiguras) {
            if (figura.getNombre().compareTo(nombre) == 0) {
                this.listadoFigurasAux.add(figura);
            }
        }
        if (this.listadoFigurasAux.size() == 0) {
            return "Sin figuras";
        } else {
            return "{" + "listadoFiguras=" + listadoFigurasAux + '}';
        }
    }

    public ArrayList<String> listadoDeFigurasArray(String nombre) {
        ArrayList<String> datos = new ArrayList<String>();
        for (FiguraGeometrica figura : this.listadoFiguras) {
            if (figura.getNombre().compareTo(nombre) == 0) {
                datos.add(figura.getNombre() + ";" + figura.area());
            }
        }
        return datos;
    }
}
