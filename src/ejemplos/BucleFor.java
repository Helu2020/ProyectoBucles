package ejemplos;

public class BucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1; i<=5; i++) {
			System.out.println("I vale "+ i);
		}
		
		/*
		 * El bucle for se compone de cuatro elementos:
		 * for(inicialización; condición; actulización){
		 * 		cuerpo
		 * }
		 * 
		 * PASO 1
		 * la iniciliazción crea una variable local y le da un valor inicil
		 * en este caso creamos una variable de tipo int que se inicia en 1	
		 * int i = 1
		 * 
		 * PASO 2
		 * la condición nos marca hasta cuando se va a ejecutar el código
		 * en este caso le hemos indicado que sea hasta que i sea 5
		 * i<=5
		 * 
		 * PASO 3
		 * Después se lanza lo que haya en el cuerpo del bucle
		 * en este caso, que nos muestre el valor de i
		 * System.out.println("I vale "+ i);
		 * 
		 * PASO 4
		 * por último, para evitar un bucle infinito, actualizamos el valor de la variable local
		 * en este caso, actualizamos la variable i en uno, pero podríamos incrementarlas en 7 con i+=7
		 * Después de la actualización volvemos al paso 2
		 * i++
		 * 
		 * */

	}

}
