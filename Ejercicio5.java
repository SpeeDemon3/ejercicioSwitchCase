package ejercicioSwitchCase;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio5 {

	/*
	 * EJERCICIO 5
	 * 
	 * Con una letra que contiene un numero romano:
	 * 
	 * I, V, X, L, C, D, M (incluso minúsculas) Decir a que numero corresponde
	 */
	
	public static void main(String[] args) {

		// Array de tipo String con los numeros romanos
		String[] numRomano = { "I", "V", "X", "L", "C", "D", "M"};
		
		Scanner sc = new Scanner(System.in);

		// Variable para controlar el bucle do while
		boolean control = true;
		
		
		try {

			// Inicializo la variable que contendra la posicion que introducira el usuario
			int posicion = 0;
			
			// Con un bucle do while controlo que el usuario introduzca un valor dentro del rango permitido
			do {
				
				System.out.println("Indica posición de la letra del número romano del que deseas conocer su valor numérico:");
				
				// Guardo el valor introducido por el usuario, restadole 1 para que cuadre con las posiciones del array
				posicion = sc.nextInt() - 1;

				// Si posicion en menor a 1 o posicion es mayor a la longitud del array
				if(posicion < 0 || posicion > numRomano.length) {
					
					System.out.println("La posición indicada no es correcta.");
					
				} else {
					// Cambio el valor de la variable control a false para poder salir del bucle
					control = false;
					
				}
			// Mientras control sea true el bucle seguira iterando
			} while(control);
			
			// Utilizando una estructura de seleccion controlo los diferentes casos pasando como parametro el array con la posicion indicada
			// por el usuario
			switch(numRomano[posicion]) {
			
				case "I":
					System.out.println("El valor del número romano I es 1.");
					break;
				
				case "V":
					System.out.println("El valor del número romano V es 5.");
					break;
			
				case "X":
					System.out.println("El valor del número romano X es 10.");
					break;
				
				case "L":
					System.out.println("El valor del número romano L es 50.");
					break;
					
				case "C":
					System.out.println("El valor del número romano C es 100.");
					break;
					
				case "D":
					System.out.println("El valor del número romano D es 500.");
					break;
					
				case "M":
					System.out.println("El valor del número romano M es 1000.");
					break;
			}
			
			
		// Controlo la excepcion que pudiese ocurrir si el usuario no introduce un valor numerico
		} catch(InputMismatchException ime) {
			System.out.println("Debes introducir valores numéricos!!!");
		}
		
		
	}

}
