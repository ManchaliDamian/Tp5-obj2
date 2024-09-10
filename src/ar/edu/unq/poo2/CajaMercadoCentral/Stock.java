package ar.edu.unq.poo2.CajaMercadoCentral;

import java.util.ArrayList;
import java.util.List;

public class Stock {
	private List<Producto> productos = new ArrayList<Producto>();
	
	public void agregarProducto(Producto p) {
		this.productos.add(p);
	}
	public void descontarProducto(Producto p) {
		if (this.productos.contains(p)) {
			this.productos.remove(p);
		}
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public int totalProductos() {
		return this.getProductos().size();
	}
	
}
