package pokerWithCardClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class CardTest {

	Card c1,c2;
	
	@BeforeEach
	void setUp() throws Exception {
		c1 = new Card("JP");
		c2 = mock(Card.class);
	}

	@Test
	void esMayor() {
		when(c2.valueToInt()).thenReturn(8);
		assertTrue(c1.esMayorA(c2));
	}

	@Test
	void esMenor() {
		when(c2.valueToInt()).thenReturn(14);
		assertFalse(c1.esMayorA(c2));
	}
	
	@Test
	void esIgual() {
		when(c2.valueToInt()).thenReturn(11);
		assertFalse(c1.esMayorA(c2));
	}
}
