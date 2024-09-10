package ar.edu.unq.poo2.CajaMercadoCentral;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	private List<Producto> productosAVender = new ArrayList<Producto>();
	private Stock stockDisponible;
	// en ambos casos me deberían de dar ya creados, la lista de productos y el stock
	
	public Caja(List<Producto> productosAVender, Stock stockDisponible) {
		this.setProductosAVender(productosAVender);
		this.setStockDisponible(stockDisponible);
	}
	public Double precioTotalVenta() {
		Double precioTotal = 0.0;
		for (Producto producto : productosAVender) {
			precioTotal += producto.getPrecio();
			stockDisponible.descontarProducto(producto);
		}
		return precioTotal;
	}
	
	public List<Producto> getProductosAVender() {
		return productosAVender;
	}
	public void setProductosAVender(List<Producto> productosAVender) {
		this.productosAVender = productosAVender;
	}
	public Stock getStockDisponible() {
		return stockDisponible;
	}
	public void setStockDisponible(Stock stockDisponible) {
		this.stockDisponible = stockDisponible;
	}



}
