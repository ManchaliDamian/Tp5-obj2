package ar.edu.unq.poo2.CajaMercadoCentral;

public class ProductoCooperativa extends Producto{

	public ProductoCooperativa(String n, Double d) {
		super(n, d);
		this.descuento();
	}
	public void descuento() {
		this.setPrecio(this.getPrecio() * 0.9);
	
}

}
