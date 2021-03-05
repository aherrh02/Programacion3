package Guia3;

public class Elefante extends Mascota {

	private double altura;
	
	public Elefante(String nombre, String tipo_alimentacion, int edad, double altura) {
		super(nombre, tipo_alimentacion, edad);
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void mostrar() {
		System.out.println(getNombre() + "-" + getTipo_alimentacion() + "-" + getEdad() + "-" + getAltura());
	}
	
}
