package mercadoCentral;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestProductoDeCooperativa {

	ProductoDeCooperativa remera, adorno;
	Stock stock;
	
	@BeforeEach
	void setUp() throws Exception {
		stock = new Stock();
		remera = new ProductoDeCooperativa(1200d,stock);
		adorno = new ProductoDeCooperativa(350d,stock);
	}

	@Test
	void test() {
		assertEquals(remera.getPrecio(),1080d,1d);
		assertEquals(adorno.getPrecio(),315d,1d);
	}

}
