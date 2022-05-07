package banco;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class ClienteTest {

	Cliente carlos, miguel, ana;
	
	@BeforeEach
	void setUp() throws Exception {
		carlos = new Cliente("Carlos", "Villaruel", "26 5428",
							LocalDate.of(1993, 5, 26), 80000d);
		miguel = new Cliente("Miguel Lucas", "Romero", "8 2620",
				LocalDate.of(1990, 1, 1), 30000d);
		ana = new Cliente("Ana Maria", "Gimenez", "14 4943",
				LocalDate.of(2001, 12, 31), 125550d);
	}

	@Test
	void testEdades() {
		//Como mockear fechas?
	}
	
	@Test
	void testSueldos() {
		
		assertEquals(carlos.getSueldoAnual(), 960000d, 0d);
		assertEquals(miguel.getSueldoAnual(), 360000, 0d);
		assertEquals(ana.getSueldoAnual(), 1506600, 0d);
		assertEquals(carlos.getSueldoNeto(), 80000d, 0d);
		assertEquals(miguel.getSueldoNeto(), 30000d, 0d);
		assertEquals(ana.getSueldoNeto(), 125550d, 0d);
		
		carlos.setSueldo(30000);
		assertEquals(carlos.getSueldoAnual(), 360000, 0d);
		assertEquals(carlos.getSueldoNeto(), 30000d, 0d);
	}

	void testInfo() {
		assertEquals(carlos.getName(), "Villaruel, Carlos");
		assertEquals(miguel.getName(), "Romero, Miguel Lucas");
		assertEquals(ana.getName(), "Gimenez, Ana Maria");
		
		assertEquals(carlos.getDireccion(), "26 5428");
		assertEquals(miguel.getDireccion(), "8 2620");
		assertEquals(ana.getDireccion(), "14 4943");
		
		carlos.setDireccion("14 4943");
		assertEquals(ana.getDireccion(), "14 4943");
	}
}
