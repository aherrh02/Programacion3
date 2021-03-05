package Guia2;

public class ExecCarro {

	public static void main(String[] args) {
		
		Carro car = new Carro();
		
		car.setMarca("Nissan");
		car.setModelo("Sentra");
		car.setPlaca("P231458");
		car.setYear(2020);
		
		System.out.println("El carro es un " + car.getMarca() + car.getModelo() + " año " + car.getYear() + " placa " + car.getPlaca());

	}

}
