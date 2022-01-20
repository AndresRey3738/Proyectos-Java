package Vista;

import controlador.ManipularFiguras;


public class InicioConsola {

    public static void main(String[] args) {
        ManipularFiguras manipularFiguras = new ManipularFiguras();
        manipularFiguras.crearCirculo(4);
        manipularFiguras.crearRectangulo(10, 5);
        manipularFiguras.crearTriangulo(3, 6);

        System.out.println("Listado de Figuras");
        System.out.println("\t" + manipularFiguras.listadoDeFiguras());
        System.out.println("Promedio de las areas de las figuras-->" + manipularFiguras.areaPromedio());
        System.out.println("Buscar Circulos");
        System.out.println("\t Se encontraron los siguientes resultados");
        System.out.println("\t" + manipularFiguras.listadoDeFiguras("Circulo"));

        System.out.println("Listado de figuras en ArrayList<String>");

        for (String s : manipularFiguras.listadoDeFigurasArray()) {
            System.out.println("\t" + s.toString());
        }
    }

}
