package ejercicios;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
    	/*
    	 * Pedir 2 números enteros y decir si el primero es múltiplo del segundo.
    	 * */
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("No se puede dividir por cero.");
        } else if (a % b == 0) {
            System.out.println(a + " es múltiplo de " + b);
        } else {
            System.out.println(a + " no es múltiplo de " + b);
        }
        sc.close();
    }
}

