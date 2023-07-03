package ejercicioSwitchCase;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio2 {

	/*
	 * EJERCICIO 2
	 * 
	 * Con una nota calificarlo de suspenso, aprobado, …etc.
	 */
	
	public static void main(String[] args) {

		// Variable para controlar el bucle do while
		boolean control = true;
		
		// Bucle para ejecutar el programa mientras el usuario no decida lo contrario
		do {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce tu nota de calificación");
			// Variable donde guardare la opcion escogida por el usuario
			int opc = 0;
			
			// Dentro de un bloque try catch controlo si el usuario introduce un valor que no sea numerico
			try {
				// Recojo la opcion introducida
				opc = sc.nextInt();
				// Compruebo si esta fuera del rango permitido
				if (opc < 0 || opc > 10) {
					
					System.out.println("La nota introducida no es correcta.");
					// Continuamos a la siguiente iteracion del bucle
					continue;
					
				} else {
					// Dentro de un bloque de seleccion controlo los diferentes casos
					switch(opc) {
					
					case 0:
					case 1:
					case 2:
					case 3:
					case 4:
						System.out.println("Lamentablemente has suspendido.");
						break;
					
					case 5:
					case 10:
						System.out.println("Has aprobado!!!");
						break;
						
				}
				
				System.out.println("Deseas continuar comprobando calificaciones? Pulsa:\n"
						+ "[1] Continuar\n"
						+ "[0] Salir");
				
				opc = sc.nextInt();
				// Si la opcion escogida es igual a 0
				if(opc == 0) {
					// Cambio el valor de la variable control a false y salimos del bucle
					control = false;
					System.out.println("Gracias por utilizar el programa ;-)");
				}
					
				}
			// Controlo la excepcion que pudiera ocurrir si el usuario no introduce un valor numerico
			} catch(InputMismatchException ime) {
				System.out.println("Debes introducir valores numéricos!!!");
			}
			
			
		// Mientras control sea true el bucle seguira iterando
		} while(control);
		
	}

}
