package Guia3;

public class JavaComposition {

	public static void main(String[] args) {

		Genero g1 = new Genero("Masculino");
		Genero g2 = new Genero("Femenino");
		
		Medicos m = new Medicos("Jorge", "Cardiologia", "0055", g1);
		
		Pacientes p = new Pacientes("Julia", 35, g2);
		
		System.out.println(m.getGenero().getGenero());
		System.out.println(p.getGenero().getGenero());

	}

}
