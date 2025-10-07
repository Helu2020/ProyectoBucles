package ejercicios;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
    	/*
    	 * 
    	 * */
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Introduce números (0 para terminar):");
        numero = teclado.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println(numero + " es par.");
            } else {
                System.out.println(numero + " es impar.");
            }
            numero = teclado.nextInt();
        }

        System.out.println("Programa finalizado.");
        teclado.close();
    }
}

