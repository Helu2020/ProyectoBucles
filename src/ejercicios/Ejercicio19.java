package ejercicios;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
    	/*
    	 * Escribir un programa que vaya pidiendo números hasta que el usuario introduzca un cero.
		Cuando termine tiene que mostrar la suma de todos los números introducidos y 
		cuántos números se han introducido en total (el 0 no cuenta).
    	 * */
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;

        System.out.println("Introduce números (0 para terminar):");
        numero = sc.nextInt();

        while (numero != 0) {
            suma += numero;
            contador++;
            numero = sc.nextInt();
        }

        System.out.println("Suma total: " + suma);
        System.out.println("Cantidad de números introducidos: " + contador);
        sc.close();
    }
}

