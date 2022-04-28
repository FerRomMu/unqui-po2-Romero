package seresVivos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MascotaTest {

	Mascota firulais, gaturro;
	
	@BeforeEach
	void setUp() throws Exception {
		firulais = new Mascota("Firulais", "Perro");
		gaturro = new Mascota("Gaturro", "Gato");
	}

	@Test
	void test() {
		assertEquals(firulais.getName(), "Firulais");
		assertEquals(gaturro.getName(), "Gaturro");
		assertEquals(firulais.getRaza(), "Perro");
		assertEquals(gaturro.getRaza(), "Gato");
	}

}
