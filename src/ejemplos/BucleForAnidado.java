package ejemplos;

public class BucleForAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

			}
		}

		/*
		 * 
		 * for (inicialización1; condición1; actualización1) { // Bucle externo for
		 * (inicialización2; condición2; actualización2) { // Bucle interno // Código
		 * que se ejecuta en cada combinación de los dos bucles } }
		 * 
		 * El bucle externo controla las “vueltas grandes” (por ejemplo, filas).
		 * 
		 * El bucle interno controla las “vueltas pequeñas” (por ejemplo, columnas).
		 * 
		 * Por cada iteración del bucle externo, el bucle interno se ejecuta
		 * completamente.
		 * 
		 * 
		 * 
		 */

		for (int fila = 1; fila <= 3; fila++) {

			// Bucle interno: controla las columnas
			for (int columna = 1; columna <= 3; columna++) {
				System.out.print("(" + fila + "," + columna + ") ");
			}

			// Salto de línea después de imprimir una fila completa
			System.out.println();
		}
	}
	
		/*
		 * PASO 1: Ejecución del bucle externo
		 * Se realizan los 3 primeros pasos del bucle for:
		 * -SUBPASO 1
		 * la iniciliazción crea una variable local y le da un valor inicial
		 * en este caso creamos una variable de tipo int que se inicia en 1	
		 * int fila = 1
		 * 
		 * -SUBPASO 2
		 * la condición nos marca hasta cuando se va a ejecutar el código
		 * en este caso le hemos indicado que sea hasta que i sea 5
		 * fila<=3
		 * 
		 * -SUBPASO 3
		 * Después se lanza lo que haya en el cuerpo del bucle
		 * en este caso, el segundo for
		 *for (int columna = 1; columna <= 3; columna++) {
				System.out.print("(" + fila + "," + columna + ") ");
			}
		 * 
		 * ¡¡ATENCIÓN!!
		 * No se ejecuta todavía la actualización del bucle externo
		 * 
		 * PASO 2: Ejecutamos el bucle interno
		 * 
		 *  -SUBPASO 1
		 * la iniciliazción crea una variable local y le da un valor inicial
		 * en este caso creamos una variable de tipo int que se inicia en 1	
		 * int columna = 1
		 * 
		 * -SUBPASO 2
		 * la condición nos marca hasta cuando se va a ejecutar el código
		 * en este caso le hemos indicado que sea hasta que i sea 5
		 * columna<=3
		 * 
		 * -SUBPASO 3
		 * Después se lanza lo que haya en el cuerpo del bucle
		 * en este caso:
		 *System.out.print("(" + fila + "," + columna + ") ");
		 * 
		 * PASO 3: Actualizamos el bucle interno
		 * en cada vuelta columna vale uno más (++)
		 * cuando columna sea 4 la condición columna<=3 no se cumplirá y saldremos del bucle interno
		 * 
		 * PASO 4: Se avctualiza el bucle externo y empezamos la segunda vuelta
		 * Ahora fila valdrá dos y repetimos todos los pasos
		 * 
		 * PASO 5: Evaluación final del bucle externo
		 * cuando fila sea 4 la condición fila<=3 no se cumplirá y saldremos del bucle anidado
		 * 
		 * ¡¡AYUDA!!: Visualización conceptual:
			for externo → fila 1
			    for interno → columna 1, 2, 3
			for externo → fila 2
			    for interno → columna 1, 2, 3
			for externo → fila 3
			    for interno → columna 1, 2, 3
		 * */

}
