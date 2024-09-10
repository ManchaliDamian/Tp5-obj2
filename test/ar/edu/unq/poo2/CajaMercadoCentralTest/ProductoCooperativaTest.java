package ar.edu.unq.poo2.CajaMercadoCentralTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.CajaMercadoCentral.ProductoCoperativa;

class ProductoCooperativaTest {
	ProductoCoperativa p1 = new ProductoCoperativa("Arroz", 10.0);
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		p1.descuento();
		assertEquals(p1.getPrecio(), 9.0);
	}

}
