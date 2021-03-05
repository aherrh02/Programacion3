package Guia3;

public class Medicos {

	private String nombre;
	private String especialidad;
	private String numIdentificacion;
	private Genero genero;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getNumIdentificacion() {
		return numIdentificacion;
	}
	public void setNumIdentificacion(String numIdentificacion) {
		this.numIdentificacion = numIdentificacion;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public Medicos(String nombre, String especialidad, String numIdentificacion, Genero genero) {
		super();
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.numIdentificacion = numIdentificacion;
		this.genero = genero;
	}
	
		
	
}
