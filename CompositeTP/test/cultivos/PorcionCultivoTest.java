package cultivos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cultivos.PorcionCultivo.Cultivo;

class PorcionCultivoTest {

	PorcionCultivo trigo, soja;
	
	@BeforeEach
	void setUp() throws Exception {
		//SetUp
		trigo = new PorcionCultivo(Cultivo.TRIGO);
		soja = new PorcionCultivo(Cultivo.SOJA);
	}

	@Test
	void test() {
		assertEquals(trigo.getGananciaAnual(), 300d);
		assertEquals(soja.getGananciaAnual(), 500d);
	}

}
