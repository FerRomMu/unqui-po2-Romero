package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PointTest {

	Point pa, pb;
	
	@BeforeEach
	public void setUp() {
		pa = new Point();
		pb = new Point(2,2);
	}
	
	@Test
	public void testConstructores() {
		assertEquals(0,pa.getX());
		assertEquals(0,pa.getY());
		assertEquals(2,pb.getX());
		assertEquals(2,pb.getY());
	}
	
	@Test
	public void testRelocarYSumar() {
		pa.relocar(5, 3);
		assertEquals(5,pa.getX());
		assertEquals(3,pa.getY());
		pb = pa.sumarPuntos(pb);
		assertEquals(7,pb.getX());
		assertEquals(5,pb.getY());		
	}
}
