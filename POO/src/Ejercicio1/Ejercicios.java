package Ejercicio1;

import java.util.Scanner;

public class Ejercicios {

	static Scanner scan = new Scanner(System.in);
	
	private static void ejercicio1() {
		
		System.out.println("Ingrese el primer numero a multiplicar: ");
		int num1 = scan.nextInt();
		
		System.out.println("Ingrese el segundo numero a multiplicar: ");
		int num2 = scan.nextInt();
		
		System.out.println("Resultado: " + (num1 * num2));
		
	}
	
	private static void ejercicio2() {
		
		System.out.print("Ingrese su nombre: ");
		String name = scan.nextLine();
		
		System.out.println("Bienvenido " + name);
		
	}
	
	private static void ejercicio3() {
		System.out.println("******Numeros pares******");
		
		System.out.print("Introduce el numero: ");
		int num = scan.nextInt();
		
		if((num % 2) == 0) {
			System.out.println("Numero par");
		}else {
			System.out.println("Numero impar");
		}
		
	}
	
	private static void ejercicio4() {
		System.out.println("*****Iniciales de nombres*****");
		
		System.out.print("Ingrese su nombre: ");
		String name = scan.next();
		
		System.out.println("La inicial de tu nombre es: " + name.substring(0, 1).toUpperCase());
		
	}
	
	private static void ejercicio5() {
		System.out.println("*****Numeros mayores*****");
		
		System.out.println("Ingrese el primer numero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println("El primer numero("+num1+") es mayor que el segundo("+num2+")");
		}else if(num2 > num1) {
			System.out.println("El segundo numero("+num2+") es mayor que el primero("+num1+")");
		}else {
			System.out.println("Los numeros son iguales");
		}
		
	}
	
	public static void main(String[] args) {
		
		ejercicio1();
		ejercicio2();
		ejercicio3();
		ejercicio4();
		ejercicio5();

	}

}
