package ar.edu.unq.poo2.CajaMercadoCentralTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.CajaMercadoCentral.Caja;
import ar.edu.unq.poo2.CajaMercadoCentral.Producto;
import ar.edu.unq.poo2.CajaMercadoCentral.ProductoCooperativa;
import ar.edu.unq.poo2.CajaMercadoCentral.Stock;

class CajaTest {
	List<Producto> productos = new ArrayList<Producto>();
	Stock stock = new Stock();
	Producto p1 = new Producto("Arroz", 10.0);
	Producto p2 = new Producto("Fideo", 8.0);
	ProductoCooperativa p3 = new ProductoCooperativa("Fideo-cooperativa", 8.0);
	Caja caja = new Caja(productos, stock);
	
	@BeforeEach
	void setUp() throws Exception {
		stock.agregarProducto(p1);
		stock.agregarProducto(p2);
		stock.agregarProducto(p3);
		this.productos.add(p1);
		this.productos.add(p2);
		this.productos.add(p3);
	}

	@Test
	void precioTotalDeVentas() {
		assertEquals(caja.precioTotalVenta(), 25.2);
	}
	@Test
	void cantidadDeStockDespDeVender() {
		assertEquals(caja.precioTotalVenta(), 25.2);
		assertEquals(stock.totalProductos(), 0);
	}

}
