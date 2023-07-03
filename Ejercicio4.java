package ejercicioSwitchCase;
/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio4 {

	/*
	 * EJERCICIO 4
	 * 
	 * Con una letra que contiene la variable estado decir el estado civil de la persona
	 */
	
	public static void main(String[] args) {

		// Estado soltero
		String estado = "S";
		
		// Estado casado
		String estado2 = "C";
		
		switch(estado) {
			case "S":
				System.out.println("Estado soltero.");
				break;
			case "C":
				System.out.println("Estado casado");
				break;
		}
		
		switch(estado2) {
			case "S":
				System.out.println("Estado soltero.");
				break;
			case "C":
				System.out.println("Estado casado");
				break; 
		}
		
		
	}

}
