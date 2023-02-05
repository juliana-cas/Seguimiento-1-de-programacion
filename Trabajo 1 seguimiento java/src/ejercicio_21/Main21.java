package ejercicio_21;

import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        Ejercicio21 ejercicio21 = new Ejercicio21();
        Scanner lector = new Scanner(System.in);

        System.out.println("Digite el número de modelo del automovil");
        ejercicio21.setModelo(lector.nextInt());

        System.out.println(ejercicio21.avisoUsuario());
}
}