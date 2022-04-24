package mercadoCentral;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestProducto {

	Producto esponja, pc, taza, billetera, celular;
	
	@BeforeEach
	void setUp() throws Exception {
		esponja = new Producto(5d);
		pc = new Producto(120000d);
		taza = new Producto(320d);
		billetera = new Producto(525d);
		celular = new Producto(90000d);
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
