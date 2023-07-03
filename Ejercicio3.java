package ejercicioSwitchCase;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio3 {

	/*
	 * EJERCICIO 3
	 * 
	 * Con varias estructuras switch … case ver si un número es divisible por 2,3 o por 5
	 */
	
	public static void main(String[] args) {

		try {
			
			System.out.println("Introduce un número para saber si es divisible entre 2, 3 o 5:\n");
			
			// Creo una variable Scanner
			Scanner sc = new Scanner(System.in);
			
			// Guardo el valor introducido por el usuario
			int num = sc.nextInt();
			
			// Compruebo si el numero introducido por el usuario modulo 2
			switch(num % 2) {
				// Da como resultado 0
				case 0:
					System.out.println(num + " es divisible entre 2.");
					break;
				// En caso contrario
				default:
					System.out.println(num + " no es divisible entre 2.");
					break;
			
			}
			
			// Compruebo si el numero introducido por el usuario modulo 3
			switch(num % 3) {
			
				// Da como resultado 0
				case 0:
					System.out.println(num + " es divisible entre 3.");
					break;
				// En caso contrario
				default:
					System.out.println(num + " no es divisible entre 3.");
					break; 
			
			}
			
			// Compruebo si el numero introducido por el usuario modulo 5
			switch(num % 5) {
			
				// Da como resultado 0
				case 0:
					System.out.println(num + " es divisible entre 5.");
					break;
				// En caso contrario
				default:
					System.out.println(num + " no es divisible entre 5.");
					break; 
		
		}
			// Controlo la excepcion que pudiese ocurrir si el usuario no introduce un valor numerico
		} catch(InputMismatchException ime) {
			System.out.println("El valor introducido no es valido.");
		}
		

	}

}
