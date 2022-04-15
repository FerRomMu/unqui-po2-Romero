package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultioperadorTest {

	Multioperador multi;
	
	@BeforeEach
	public void setUp(){
		multi = new Multioperador();
		multi.addNumer(2);
		multi.addNumer(3);
		multi.addNumer(5);
		multi.addNumer(7);
		multi.addNumer(9);
	}
	
	@Test
	void testSuma() {
		int suma = multi.sumar();
		assertEquals(26, suma);
	}
	
	void testResta() {
		int resta = multi.restar();
		assertEquals(-26, resta);
	}
	
	void multiPlicar() {
		int mult = multi.multiplicar();
		assertEquals(1890, mult);
	}
}