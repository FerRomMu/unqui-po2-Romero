package mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestImpuesto {
	
	Impuesto alumbrado, iva;
	Agencia municipio, afip;

	@BeforeEach
	void setUp() throws Exception {
		alumbrado = new Impuesto(municipio, 1200d);
		iva = new Impuesto(afip, 23500d);
	}

	@Test
	void test() {
		assertEquals(alumbrado.getPrecio(), 1200d, 0d);
		assertEquals(iva.getPrecio(), 23500d, 0d);
	}

}
