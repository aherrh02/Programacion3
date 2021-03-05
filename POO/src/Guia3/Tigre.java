package Guia3;

public class Tigre extends Mascota {

	private String raza;
	
	public Tigre(String nombre, String tipo_alimentacion, int edad, String raza) {
		super(nombre, tipo_alimentacion, edad);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public void mostrar() {
		System.out.println(getNombre() + "-" + getTipo_alimentacion() + "-" + getEdad() + "-" + getRaza());
	}
	
	
}
