package ejercicios;

public class Ejercicio23 {
    public static void main(String[] args) {
    	//Desarrollar un algoritmo que calcule y muestre el cuadrado de los 9 primeros números naturales.
        int i = 1;
        while (i <= 9) {
            int cuadrado = i * i;
            System.out.println("El cuadrado de " + i + " es " + cuadrado);
            i++;
        }
    }
}

