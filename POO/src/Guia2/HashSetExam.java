package Guia2;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExam {

	public static void main(String[] args) {

		HashSet<String> hset = new HashSet<String>();
		
		hset.add("Adidas");
		hset.add("Reef");
		hset.add("Vans");
		hset.add("Orange");
		hset.add("Zegna");
		
		hset.add("Adidas");
		hset.add("Reef");
		
		hset.add(null);
		hset.add(null);
		

		System.out.println(hset);
		
		HashSet<String> cars = new HashSet<String>();
		
		cars.add("Nissan");
		cars.add("Ford");
		cars.add("Chevrolet");
		cars.add("Kia");
		cars.add("Suzuki");
		
		HashSet<String> ropa = new HashSet<String>();
		
		ropa.add("Polo");
		ropa.add("Nautica");
		ropa.add("Ralph Lauren");
		ropa.add("Tommy Hilfiguer");
		
		HashSet<String> hobbies = new HashSet<String>();
		
		hobbies.add("Leer");
		hobbies.add("Video juegos");
		hobbies.add("Deportes");
		hobbies.add("Escuchar musica");
		
		System.out.println(cars);
		System.out.println(ropa);
		System.out.println(hobbies);
		
	}

}
