package banco;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CreditoTest {

	Credito credito, creditoPago;
	ICliente clienteDummie;
	
	@BeforeEach
	void setUp() throws Exception {
		clienteDummie = mock(ICliente.class);
		credito = new Credito(30000d,2, clienteDummie);
		creditoPago = new Credito (5000d, 0, clienteDummie);
	}

	@Test
	void testPagado() {
		
		assertTrue(creditoPago.estaPagada());
		assertFalse(credito.estaPagada());
		
		credito.registrarPagoDeCuota();
		assertFalse(credito.estaPagada());
		
		credito.registrarPagoDeCuota();
		assertTrue(credito.estaPagada());
		
	}
	
	@Test
	void valorCuota() {
		
		assertEquals(credito.getCuota(), 30000d);
		assertEquals(creditoPago.getCuota(), 5000d);
		
	}

}
