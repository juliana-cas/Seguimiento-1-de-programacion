package ejercicio_22;

import java.util.Scanner;

public class Main22 {

    public static void main(String[] args) {
        Ejercicio22 ejercicio22 = new Ejercicio22();
        Scanner lector = new Scanner(System.in);

        System.out.println("Escriba su operador");
        ejercicio22.setOperador(lector.next());

        System.out.println("Escriba los minutos totales consumidos");
        ejercicio22.setMinutosConsumidos(lector.nextInt());

        ejercicio22.operadorPrecios();

        System.out.println("El precio de su plan es de:" + ejercicio22.precioTotal());
    }
}
