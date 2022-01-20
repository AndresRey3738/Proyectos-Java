
package Modelo;


public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    public Triangulo(double base, double altura){
        super("Triangulo");
        this.base=base;
        this.altura=altura;
        this.areaFigura=Math.round((this.area())*100.0)/100.0;
    }

    @Override
    public double area() {
        return (this.base*this.altura)/2;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
}
