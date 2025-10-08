package ejerciciosPseudocodigoII;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
    	/*
    	 * Calcular e imprimir la suma de los números impares comprendidos entre a y b, 
    	 * que deben leerse por teclado y filtrarse para que a ≤ b
    	 * */
        Scanner sc = new Scanner(System.in);
        int a, b;
        do {
            System.out.print("Introduce a: ");
            a = sc.nextInt();
            System.out.print("Introduce b: ");
            b = sc.nextInt();
            if (a > b) System.out.println("a debe ser menor o igual que b.");
        } while (a > b);

        int suma = 0;
        for (int i = a; i <= b; i++)
            if (i % 2 != 0) suma += i;

        System.out.println("Suma de impares = " + suma);
        sc.close();
    }
}

