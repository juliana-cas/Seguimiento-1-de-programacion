package ejercicio_6;

public class Main6 {

    public static void main(String[] args) {
        AreaRectangulo areaRectangulo = new AreaRectangulo();

        areaRectangulo.altura = 12;
        areaRectangulo.base = 20;

        System.out.println(areaRectangulo.validarDatos());

        System.out.println("El area del rectangulo es de: " + areaRectangulo.calcularArea() + "cm");



    }

}

