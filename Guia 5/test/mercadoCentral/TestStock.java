package mercadoCentral;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStock {

	Producto esponja, taza;
	Stock stock;
	
	@BeforeEach
	void setUp() throws Exception {
		stock = new Stock();
		esponja = new Producto(5d);
		taza = new Producto(320d);
		
		stock.modificarStockDe(esponja, 2);
	}

	@Test
	void test() {
		assertTrue(stock.hayStockDe(esponja));
		assertFalse(stock.hayStockDe(taza));
		stock.modificarStockDe(esponja, -3);
		assertFalse(stock.hayStockDe(esponja));
		stock.modificarStockDe(taza, 1);
		assertTrue(stock.hayStockDe(taza));
		stock.modificarStockDe(esponja, 0);
		assertFalse(stock.hayStockDe(esponja));
	}

}
