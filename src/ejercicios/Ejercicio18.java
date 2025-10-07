package ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
    	/*
    	 * Realizar un algoritmo que vaya pidiendo números enteros hasta que el usuario introduzca un cero.
		Hay que ir visualizando cada uno de los números insertados, excepto el 0.
    	 * */
    	
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Introduce números (0 para salir):");
        numero = teclado.nextInt();

        while (numero != 0) {
            System.out.println("Has introducido: " + numero);
            numero = teclado.nextInt();
        }

        System.out.println("Programa terminado.");
        teclado.close();
    }
}

