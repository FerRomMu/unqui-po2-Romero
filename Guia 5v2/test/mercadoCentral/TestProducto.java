package mercadoCentral;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestProducto {

	Producto esponja, pc, taza, billetera, celular;
	Stock stock;
	
	@BeforeEach
	void setUp() throws Exception {
		stock = new Stock();
		esponja = new Producto(5d, stock);
		pc = new Producto(120000d, stock);
		taza = new Producto(320d, stock);
		billetera = new Producto(525d, stock);
		celular = new Producto(90000d, stock);
	}

	@Test
	void test() {
		assertEquals(esponja.getPrecio(),5d,0d);
		assertEquals(pc.getPrecio(),120000d,0d);
		assertEquals(taza.getPrecio(),320d,0d);
		assertEquals(billetera.getPrecio(),525d,0d);
		assertEquals(celular.getPrecio(),90000d,0d);
	}

}
