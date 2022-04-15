package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;
import java.time.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {

	Persona p, maga;
	LocalDate date = LocalDate.of(1993, 5, 26);
	
	@BeforeEach
	public void setUp() {
		p = new Persona("Fercho", date);
		date = LocalDate.of(2000, 11, 26);
		maga = new Persona ("Magali", date);
	}
	
	@Test
	public void testConstructor() {
		assertEquals(p.edad(), 28);
		assertEquals(p.getNombre(),"Fercho");
	}
	
	@Test
	public void testMenorQue() {
		assertEquals(false, p.menorQue(maga));
		assertEquals(true, maga.menorQue(p));
		assertEquals(false, p.menorQue(p));
	}
}