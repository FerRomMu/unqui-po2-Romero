package mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestServicio {

	Servicio masaje, uber;
	
	@BeforeEach
	void setUp() throws Exception {
		masaje = new Servicio(1000d);
		uber = new Servicio(500d,5);
	}

	@Test
	void test() {
		assertEquals(masaje.getPrecio(), 0d,0d);
		masaje.consumirN(2);
		assertEquals(masaje.getPrecio(), 2000d, 0d);
		assertEquals(uber.getPrecio(), 2500d, 0d);
	}

}
