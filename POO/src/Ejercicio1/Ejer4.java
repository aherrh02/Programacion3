package Ejercicio1;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("********Inicio********");
		System.out.println("Ingrese el primer numero entero");
		
		int num1 = scan.nextInt();
		
		System.out.println("Ingrese el segundo numero entero");
		
		int num2 = scan.nextInt();
		
		int resultado = num1 + num2;

		System.out.print("La sumatoria de los números ingresados es: " + resultado);

	}

}
