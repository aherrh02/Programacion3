package Guia2;

import java.util.ArrayList;

public class ArrayListExam2 {

	public static void main(String[] args) {
		
		ArrayList<String> months = new ArrayList<String>();
		
		months.add("Enero");
		months.add("Febrero");
		months.add("Marzo");
		months.add("Abril");
		months.add("Mayo");
		months.add("Junio");
		months.add("Julio");
		months.add("Agosto");
		months.add("Septiembre");
		months.add("Octubre");
		months.add("Noviembre");
		months.add("Diciembre");
		
		System.out.println("Los meses del año son: " + months);
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Nissan");
		cars.add("Ford");
		cars.add("Chevrolet");
		cars.add("Kia");
		cars.add("Suzuki");
		
		System.out.println("Algunas marcas de carros son: " + cars);
		
		ArrayList<String> ropa = new ArrayList<String>();
		
		ropa.add("Polo");
		ropa.add("Nautica");
		ropa.add("Ralph Lauren");
		ropa.add("Tommy Hilfiguer");
		
		System.out.println("Algunas marcas de ropa son: " + ropa);

		ArrayList<String> hobbies = new ArrayList<String>();
		
		hobbies.add("Leer");
		hobbies.add("Video juegos");
		hobbies.add("Deportes");
		hobbies.add("Escuchar musica");
		
		System.out.println("Algunos pasatiempos son: " + hobbies);

	}

}
