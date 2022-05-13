package pokerWithCardClass;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class PokerStatusTest {

	PokerStatus ps; //SUT
	Card c1,c2,c3,c4,c5,
		c6,c7,c8,c9,c10,
		c11,c12,c13,c14,c15; //Docs
	
	@BeforeEach
	void setUp() throws Exception {
		//Setup

		c1 = mock(Card.class);
		c2 = mock(Card.class);
		c3 = mock(Card.class);
		c4 = mock(Card.class);
		c5 = mock(Card.class);
		
		ps = new PokerStatus();
	}

	@Test
	void testPoker() {
		//Excersice 
		when(c1.getPalo()).thenReturn("D");
		when(c2.getPalo()).thenReturn("D");
		when(c3.getPalo()).thenReturn("P");
		when(c4.getPalo()).thenReturn("C");
		when(c5.getPalo()).thenReturn("T");
		when(c1.getValor()).thenReturn("1");
		when(c2.getValor()).thenReturn("1");
		when(c3.getValor()).thenReturn("1");
		when(c4.getValor()).thenReturn("1");
		when(c5.getValor()).thenReturn("2");
		//verify
		assertEquals(ps.verificar(c1, c2, c3, c4, c5), "Poker");
	}
	
	@Test
	void testTrio() {
		//Excersice 
		when(c1.getPalo()).thenReturn("D");
		when(c2.getPalo()).thenReturn("D");
		when(c3.getPalo()).thenReturn("P");
		when(c4.getPalo()).thenReturn("C");
		when(c5.getPalo()).thenReturn("T");
		when(c1.getValor()).thenReturn("1");
		when(c2.getValor()).thenReturn("1");
		when(c3.getValor()).thenReturn("1");
		when(c4.getValor()).thenReturn("K");
		when(c5.getValor()).thenReturn("2");
		//verify
		assertEquals(ps.verificar(c1, c2, c3, c4, c5), "Trio");
	}
	
	@Test
	void testColor() {
		//Excersice 
		when(c1.getPalo()).thenReturn("D");
		when(c2.getPalo()).thenReturn("D");
		when(c3.getPalo()).thenReturn("D");
		when(c4.getPalo()).thenReturn("D");
		when(c5.getPalo()).thenReturn("D");
		when(c1.getValor()).thenReturn("1");
		when(c2.getValor()).thenReturn("5");
		when(c3.getValor()).thenReturn("1");
		when(c4.getValor()).thenReturn("4");
		when(c5.getValor()).thenReturn("K");
		//verify
		assertEquals(ps.verificar(c1, c2, c3, c4, c5), "Color");
	}
	
	@Test
	void testNada() {
		//Excersice 
		when(c1.getPalo()).thenReturn("D");
		when(c2.getPalo()).thenReturn("D");
		when(c3.getPalo()).thenReturn("P");
		when(c4.getPalo()).thenReturn("C");
		when(c5.getPalo()).thenReturn("T");
		when(c1.getValor()).thenReturn("2");
		when(c2.getValor()).thenReturn("Q");
		when(c3.getValor()).thenReturn("K");
		when(c4.getValor()).thenReturn("2");
		when(c5.getValor()).thenReturn("6");
		//verify
		assertEquals(ps.verificar(c1, c2, c3, c4, c5), "Nada");
	}
}
