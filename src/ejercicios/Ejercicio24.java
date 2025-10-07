package ejercicios;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
    	/*
    	 * Realizar un algoritmo que pida dos números (dividendo y divisor).
 		Si el divisor es distinto de 0, mostrará el resultado.
 		En caso contrario mostrará “En una división, el divisor no puede ser 0”.
    	 * */
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el dividendo: ");
        double dividendo = teclado.nextDouble();
        System.out.print("Introduce el divisor: ");
        double divisor = teclado.nextDouble();

        if (divisor != 0) {
            double resultado = dividendo / divisor;
            System.out.println("Resultado de la división: " + resultado);
        } else {
            System.out.println("En una división, el divisor no puede ser 0.");
        }
        teclado.close();
    }
}

