package ejercicioSwitchCase;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio1 {

	/*
	 * EJERCICIO 1
	 * 
	 * Con un número del 1 al 7 decir a que día de la semana corresponde
	 */
	
	public static void main(String[] args) {
		
		// Variable de control para controlar el bucle while
		boolean control = true;
		
		// Mientras la variable control sea true el bucle seguira iterando
		while(control) {
			
			// Creo un objeto Scanner para recoger los valores del usuario
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Indica un número del 1 al 7 para saber a que día de la semana corresponde:\n");
			// Inicializo la variable donde guardare la opcion que introducira el usuario 
			int opcUser = 0;
			
			// Dentro de un try catch control si el usuario no introduce un valor numerico
			try {
				// Guardo la opcion introducida por el usuario
				opcUser = sc.nextInt();

			} catch (InputMismatchException ime) {
			
				System.out.println("El valor introducido no es correcto.");
				
			}
			
			// Utilizando una estructura de seleccion controlo los diferentes casos
			switch (opcUser) {
				
				case 1:
					System.out.println("Lunes");
					break;
					
				case 2:
					System.out.println("Martes");
					break;
					
				case 3:
					System.out.println("Miercoles");
					break;
				
				case 4:
					System.out.println("Jueves");
					break;
					
				case 5:
					System.out.println("Viernes");
					break;
					
				case 6:
					System.out.println("Sabado");
					break;
					
				case 7:
					System.out.println("Domingo");
					break;
					
				default:
					System.out.println("El valor introducido no es valido");
					break;
					
			
			
			
			}
			
			// Compruebo si el usuario quiere seguir utilizando el programa
			System.out.println("Deseas continuar? Pulsa[1] para continuar o pulsa [0] para salir del programa");
			// Guardo la opcion escogida por el usuario
			opcUser = sc.nextInt();
			// Si la opcion escogida es igual a 0
			if (opcUser == 0) {
				System.out.println("Gracias por utilizar el programa.");
				// Cambio el valor de la variable control a true para salir del bucle while
				control = false;
			}
			
			
		}

		
		
	}

}
