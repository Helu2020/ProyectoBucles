package ejemplos;

public class BucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 1;
		while(numero<=5) {
			System.out.println("numero vale "+ numero);
			numero ++;
		}
		
		/*
		 * PASO 1
		 * Evaluamos la condición, en este caso se seguirá ejecutando mientras número sea menor que 5
		 * numero<=5
		 * 
		 * PASO 2
		 * Resolvemos el cuerpo del bucle
		 * En este caso nos muestra el valor de número
		 * System.out.println("numero vale "+ numero);
		 * 
		 * PASO 3
		 * actualizamos el valor de la variable para que no entremos en un bucle infinito
		 * en este caso sumamos 1 al valor de numero
		 * numero ++
		 * */

	}

}
