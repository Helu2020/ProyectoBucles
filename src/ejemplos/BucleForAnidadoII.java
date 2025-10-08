package ejemplos;

public class BucleForAnidadoII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean condicion =true;
		for (int i = 0; i <= 10; i++) {
			condicion = true;
			for (int j = 0; j <= 10; j++) {
				while(condicion) {
					System.out.println("Tabla de "+i);
					condicion=false;
				}
				System.out.println(i*j);
			}
		}
	}

}
