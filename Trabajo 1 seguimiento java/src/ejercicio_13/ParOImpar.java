package ejercicio_13;

public class ParOImpar {

    public int numero;

    public void asignarNumero(int next){
        this.numero = next;
    }

    public String calculo(){
        if ((numero%2) == 0){
            return numero + " es par";
        }else{
            return numero + " es inpar";
        }
    }
}
