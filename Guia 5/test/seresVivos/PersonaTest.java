package seresVivos;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {

	Persona jose, miguel;
	
	@BeforeEach
	void setUp() throws Exception {
		
		jose = new Persona("Jose", LocalDate.of(1993, 5, 26));
		miguel = new Persona("Miguel", LocalDate.of(1933, 12, 1));
		
	}

	@Test
	void test() {
		assertEquals(jose.getEdad(), 28);
		assertEquals(miguel.getEdad(), 88);
		assertEquals(jose.getName(),"Jose");
		assertEquals(miguel.getName(),"Miguel");
		assertEquals(jose.getFechaDeNac(), LocalDate.of(1993, 5, 26));
		assertEquals(miguel.getFechaDeNac(), LocalDate.of(1933, 12, 1));
		assertTrue(jose.menorQue(miguel));
	}

}
