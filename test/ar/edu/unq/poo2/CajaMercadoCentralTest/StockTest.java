package ar.edu.unq.poo2.CajaMercadoCentralTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.CajaMercadoCentral.Producto;
import ar.edu.unq.poo2.CajaMercadoCentral.ProductoCoperativa;
import ar.edu.unq.poo2.CajaMercadoCentral.Stock;

class StockTest {
	Stock stock = new Stock();
	Producto p1 = new Producto("Arroz", 10.0);
	Producto p2 = new Producto("Fideo", 8.0);
	ProductoCoperativa p3 = new ProductoCoperativa("Fideo-cooperativa", 8.0);
	
	@BeforeEach
	void setUp() throws Exception {
		stock.agregarProducto(p1);
		stock.agregarProducto(p3);
	}

	@Test
	void cantidadDeProductos() {
		assertEquals(stock.totalProductos(), 2);
	}

	@Test
	void descontarUnProducto() {
		stock.descontarProducto(p1);
		assertEquals(stock.totalProductos(), 1);
	}
	@Test
	void descontarUnProductoQueNoEsteEnStock() {
		stock.descontarProducto(p2);
		assertEquals(stock.totalProductos(), 2);
	}
}
