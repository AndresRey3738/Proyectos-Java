package Modelo;

public abstract class FiguraGeometrica {

    private String nombre;
    protected double areaFigura;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
        this.areaFigura = 0;
    }

    public abstract double area();

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "nombre=" + nombre + ", areaFigura=" + areaFigura + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public double getAreaFigura() {
        return areaFigura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAreaFigura(double areaFigura) {
        this.areaFigura = areaFigura;
    }

}
