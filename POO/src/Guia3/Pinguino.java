package Guia3;

public class Pinguino extends Mascota{

	private String genero;
	
	public Pinguino(String nombre, String tipo_alimentacion, int edad, String genero) {
		super(nombre, tipo_alimentacion, edad);
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String raza) {
		this.genero = raza;
	}
	
	public void mostrar() {
		System.out.println(getNombre() + "-" + getTipo_alimentacion() + "-" + getEdad() + "-" + getGenero());
	}
	
	
}
