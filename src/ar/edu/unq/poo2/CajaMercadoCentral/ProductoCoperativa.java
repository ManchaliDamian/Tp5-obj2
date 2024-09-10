package ar.edu.unq.poo2.CajaMercadoCentral;

public class ProductoCoperativa extends Producto{

	public ProductoCoperativa(String n, Double d) {
		super(n, d);
		this.descuento();
	}
	public void descuento() {
		this.setPrecio(this.getPrecio() * 0.9);
	
}

}
