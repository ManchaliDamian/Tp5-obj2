package ar.edu.unq.poo2.CajaMercadoCentralTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.CajaMercadoCentral.Producto;

class ProductoTest {
	private Producto p1 = new Producto("Arroz", 10.0);
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		assertEquals(p1.getPrecio(), 10.0);
	}

}
