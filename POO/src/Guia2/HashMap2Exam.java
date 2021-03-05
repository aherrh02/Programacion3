package Guia2;

import java.util.HashMap;

public class HashMap2Exam {

	public static void main(String[] args) {
		
		HashMap<Integer, String> Hash = new HashMap<Integer, String>();
		
		Hash.put(1, "Ferrari");
		Hash.put(2, "Lamborghini");
		Hash.put(3, "Rolls Royce");
		Hash.put(4, "Aston Martin");
		Hash.put(5, "Audi");
		Hash.put(6, "BMW");
		Hash.put(7, "Koenigsegg");
		Hash.put(8, "Pagani");
		Hash.put(9, "Tesla");
		Hash.put(10, "Corvette");
		Hash.put(11, "Nissan");
		Hash.put(12, "Bugatti");
		Hash.put(13, "McLaren");
		Hash.put(14, "Mercedes Benz");
		Hash.put(15, "Lykan");
		Hash.put(16, "Bentley");
		Hash.put(17, "Porsche");
		Hash.put(18, "Maserati");
		Hash.put(19, "Subaru");
		Hash.put(20, "Alfa Romeo");
		
		System.out.println("Los carros almacenados son: \n" + Hash);
		
		HashMap<Integer, String> Hash2 = new HashMap<Integer, String>();
		
		Hash2.put(1, "Gucci");
		Hash2.put(2, "Chanel");
		Hash2.put(3, "Louis Vuitton");
		Hash2.put(4, "Giorgio Armani");
		Hash2.put(5, "Prada");
		Hash2.put(6, "Versace");
		Hash2.put(7, "Fendi");
		Hash2.put(8, "Valentino");
		Hash2.put(9, "Marc Jacobs");
		Hash2.put(10, "Christian Dior");
		Hash2.put(11, "Dolce & Gabbana");
		Hash2.put(12, "Givenchy");
		Hash2.put(13, "Hermes");
		Hash2.put(14, "Salvatore Ferragamo");
		Hash2.put(15, "Ermenegildo Zegna");
		Hash2.put(16, "Guess");
		Hash2.put(17, "Moschino");
		Hash2.put(18, "Burberry");
		Hash2.put(19, "Carolina Herrera");
		Hash2.put(20, "Yves Saint Laurent");
		
		System.out.println("Los marcas almacenadas son: \n" + Hash2);

	}

}
