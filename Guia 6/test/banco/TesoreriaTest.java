package banco;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesoreriaTest {
	
	Tesoreria t;
	SolicitudDeCreditoHipotecario ch;
	SolicitudDeCreditoPersonal cp;

	@BeforeEach
	void setUp() throws Exception {
		
		t = new Tesoreria();
		ch = mock(SolicitudDeCreditoHipotecario.class);
		cp = mock(SolicitudDeCreditoPersonal.class);
		
		t.addSolicitudCredito(cp);
		t.addSolicitudCredito(ch);
		
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
