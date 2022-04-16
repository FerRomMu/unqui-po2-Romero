package supermercado;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrabajadorTest {

	Trabajador t1;
	IngresoPercibido i1,i2;
	IngresoPorHorasExtras i3;
	
	@BeforeEach
	public void setUp() {
		t1 = new Trabajador();
		i1 = new IngresoPercibido("Enero", "Algo", 60000d);
		i2 = new IngresoPercibido("Febrero", "Algo", 80000d);
		i3 = new IngresoPorHorasExtras("Febrero", "Algo", 20000d,8);
		t1.recibirIngreso(i1).recibirIngreso(i2).recibirIngreso(i3);
	}
	
	@Test
	public void testImpuestos() {
		assertEquals(160000d,t1.getTotalPercibido());
		assertEquals(140000d,t1.getMontoImponible());
		assertEquals(2800d,t1.getImpuestosAPagar());
	}

}
