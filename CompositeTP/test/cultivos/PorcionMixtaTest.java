package cultivos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PorcionMixtaTest {

	PorcionCultivo soja, trigo;
	PorcionMixta t1, t2;
	
	@BeforeEach
	void setUp() throws Exception {
		
		soja = mock(PorcionCultivo.class);
		trigo = mock(PorcionCultivo.class);
		
		t1 = new PorcionMixta(t2, trigo, trigo, soja);
		t2 = new PorcionMixta(soja, soja, trigo, soja);
		
		when(soja.getGananciaAnual()).thenReturn(500d);
		when(trigo.getGananciaAnual()).thenReturn(300d);
	}

	@Test
	void testSinMixtas() {
		assertEquals(t2.getGananciaAnual(), 450d);
	}
	
	void testConMixtas() {
		assertEquals(t1.getGananciaAnual(), 387.5d);
	}

}
