package Guia1;

public class ExecFac {

	public static void main(String[] args) {
		Factura pedido1 = new Factura();
		
		pedido1.setDescPieza("Taladro Black & Decker de medio caballo de potencia para banco");
		pedido1.setCantArticulo(1);
		pedido1.setNumDePieza("45");
		pedido1.setPriceArticulo(39.99);

		System.out.println("La descripcion de la pieza es: " + pedido1.getDescPieza());
		System.out.println("La cantidad solicitada es: " + pedido1.getCantArticulo());
		System.out.println("El numero de pieza es: " + pedido1.getNumDePieza());
		System.out.println("El precio es: " + pedido1.getPriceArticulo());
	}

}
