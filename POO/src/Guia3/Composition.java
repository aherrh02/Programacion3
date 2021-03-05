package Guia3;

public class Composition {

	public static void main(String[] args) {
		
		Direccion d1 = new Direccion("Calle A", 3);
		Direccion d2 = new Direccion("Calle B", 7);
		
		Persona p = new Persona("Pepe", 22, d1);
		
		Empresa e = new Empresa();
		
		e.setCif("1A");
		e.setDireccion(d2);
		
		System.out.println(p.getDireccion().getCalle());
		System.out.println(e.getDireccion().getCalle());

	}

}
