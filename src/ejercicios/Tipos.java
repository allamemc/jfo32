package ejercicios;
import java.util.Scanner;
public class Tipos {
    public static void main(String[] args) {
        byte tipo1 = 127;
        short tipo2 = 32767; //40000; el tipo short tiene como máximo un valor de 32767
        int tipo3 = 45;
        long tipo4 = 3;
        System.out.println("tipos: " + tipo1 +tipo3 +tipo2 +tipo4);
        int numero = 2;
        System.out.println(numero++);
        System.out.println(numero);

        System.out.println(++numero);
        System.out.println(numero);
        //al poner numero++ se incrementa para los siguientes prints en cambio ++numero incrementa la variable y en ese mismo print ya la puedes ver incrementada

        Scanner parimpar = new Scanner(System.in);
        System.out.print("Introduzca el numero(par impar): ");
        try {
            int num = parimpar.nextInt();
            if(num % 2 == 0){
                System.out.println("Es par");
            }else{
                System.out.println("Es impar");
            }
        }
        catch(Exception e){
            System.out.println("Introduzca un numero");
        }

        Scanner primo = new Scanner(System.in);
        System.out.print("Introduzca el numero(primos): ");
        try {
            int nump = primo.nextInt();
            if (esPrimo(nump)){
                System.out.println("Es primo");
            }else{
                System.out.println("No es primo");
            }
        }
        catch(Exception e){
            System.out.println("Introduzca un numero");
        }

        System.out.println("Los primeros 10 numeros primos:");
        int contador=0;
        for (int nume=1;;nume++) {
            if (esPrimo(nume)){
                contador++;
                System.out.println(nume+" es primo");
            }
            if(contador==10){
                break;
            }
        }

    }
    public static boolean esPrimo(int numero) { //nueva funcion que devuelve un booleano
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (numero % x == 0)
                return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    }
}