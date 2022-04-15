package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestRectangulo {

	Rectangulo r1,r2,r3;
	Cuadrado c;
	Point p;
	
	@BeforeEach
	public void setUp() {
		p = new Point();
		r1 = new Rectangulo(p,2,3);
		r2 = new Rectangulo(p,5,3);
		p.relocar(2, -1);
		r3 = new Rectangulo(p,1,3);
		c = new Cuadrado(p,2);
	}
	
	@Test
	public void testAreaYPerimetro() {
		assertEquals(r1.perimetro(), 10);
		assertEquals(r2.perimetro(), 16);
		assertEquals(r3.perimetro(), 8);
		assertEquals(r1.area(), 6);
		assertEquals(r2.area(), 15);
		assertEquals(r3.area(), 3);
		assertEquals(c.area(), 4);
		assertEquals(c.perimetro(), 8);
	}
	
	@Test
	public void testHoV() {
		assertEquals(true, r1.esVertical());
		assertEquals(false, r2.esVertical());
		assertEquals(true, r3.esVertical());
		assertEquals(false, r1.esHorizontal());
		assertEquals(true,r2.esHorizontal());
		assertEquals(false, r3.esHorizontal());
		assertEquals(false, c.esHorizontal());
		assertEquals(false, c.esVertical());
	}
}
