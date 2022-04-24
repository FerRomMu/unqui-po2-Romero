package mercadoCentral;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestProductoDeCooperativa {

	ProductoDeCooperativa remera, adorno;
	
	@BeforeEach
	void setUp() throws Exception {
		remera = new ProductoDeCooperativa(1200d);
		adorno = new ProductoDeCooperativa(350d);
	}

	@Test
	void test() {
		assertEquals(remera.getPrecio(),1080d,1d);
		assertEquals(adorno.getPrecio(),315d,1d);
	}

}
