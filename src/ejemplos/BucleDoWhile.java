package ejemplos;

public class BucleDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 1;
		do {
			System.out.println("el numero vale "+ numero);
			numero ++;
		}while(numero<=5);
		
		/*
		 * 
		 * PASO 1
		 * Resolvemos el cuerpo del bucle
		 * En este caso nos muestra el valor de número
		 * System.out.println("numero vale "+ numero);
		 * 
		 * PASO 2
		 * actualizamos el valor de la variable para que no entremos en un bucle infinito
		 * en este caso sumamos 1 al valor de numero
		 * numero ++
		 * 
		 * PASO 3
		 * Evaluamos la condición, en este caso se seguirá ejecutando mientras número sea menor que 5
		 * numero<=5
		 * 
		 * ¡¡ATENCIÓN!!
		 * A diferencia del bucle while, en el bucle do-while se va a ejecutar el código al menos una vez   
		 *
		 * */
	}

}
