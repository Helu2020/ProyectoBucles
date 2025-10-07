package ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
    	/*
    	 * Escribir un programa que vaya pidiendo números hasta que el usuario introduzca un cero.
 		Debe mostrar solo los números introducidos en posiciones impares (1ª, 3ª, 5ª, …).
    	 * */
        Scanner teclado = new Scanner(System.in);
        int numero;
        int posicion = 1;

        System.out.println("Introduce números (0 para salir):");
        numero = teclado.nextInt();

        while (numero != 0) {
            if (posicion % 2 != 0) {
                System.out.println("Número en posición impar (" + posicion + "): " + numero);
            }
            posicion++;
            numero = teclado.nextInt();
        }

        System.out.println("Programa finalizado.");
        teclado.close();
    }
}

