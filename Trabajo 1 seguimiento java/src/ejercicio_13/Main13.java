package ejercicio_13;

import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        ParOImpar parOInpar = new ParOImpar();
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese un numero para saber si es par o inpar ");
        parOInpar.asignarNumero(lector.nextInt());

        System.out.println(parOInpar.calculo());
    }
}

