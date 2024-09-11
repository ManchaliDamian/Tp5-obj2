package ar.edu.unq.poo2.CajaMercadoCentralTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.CajaMercadoCentral.ProductoCooperativa;

class ProductoCooperativaTest {
	ProductoCooperativa p1 = new ProductoCooperativa("Arroz", 10.0);
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		
		assertEquals(p1.getPrecio(), 9);
	}

}
