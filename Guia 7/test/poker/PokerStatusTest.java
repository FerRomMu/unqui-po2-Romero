package poker;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {

	PokerStatus ps;
	String c1,c2,c3,c4,c5,
		c6,c7,c8,c9,c10,
		c11,c12,c13,c14,c15; //Cartas
	
	@BeforeEach
	void setUp() throws Exception {
		//Setup
		c1 = "2P";
		c2 = "2D";
		c3 = "5D";
		c4 = "2T";
		c5 = "2C";

		c6 = "1D";
		c7 = "3D";
		c8 = "QD";
		c9 = "5D";
		c10 = "8D";
		
		c11 = "KP";
		c12 = "KD";
		c13 = "KC";
		c14 = "JT";
		c15 = "1C";
		
		ps = new PokerStatus();
	}

	@Test
	void test() {
		//Excersice y verify
		assertEquals(ps.verificar(c1,c2,c3,c4,c5),"Poker");
		assertEquals(ps.verificar(c6,c7,c8,c9,c10),"Color");
		assertEquals(ps.verificar(c11,c12,c13,c14,c15), "Trio");
		assertEquals(ps.verificar(c1, c6, c3, c13, c14), "Nada");
	}

}
