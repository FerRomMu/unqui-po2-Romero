package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

class CounterTest {

	Counter counter;
	
	@BeforeEach
	public void setUp(){
		counter = new Counter();
		counter.addNumer(1);
		counter.addNumer(3);
		counter.addNumer(5);
		counter.addNumer(7);
		counter.addNumer(9);
		counter.addNumer(1);
		counter.addNumer(1);
		counter.addNumer(4444);
		counter.addNumer(1020);
		counter.addNumer(1);
	}
	
	@Test
	void testImpares() {
		int cantidad = counter.cantImpares();
		assertEquals(cantidad, 8);
	}
	
	@Test
	void testPares() {
		int cantidad = counter.cantPares();
		assertEquals(cantidad, 2);
	}
	
	@Test
	void testcantMultiplos() {
		int cantidad = counter.cantMultiplos(1020);
		assertEquals(cantidad, 1);
	}

	@Test
	void testNumeroConMasPares() {
		Integer num = counter.numeroConMasPares();
		assertEquals(num, 4444);
	}
	
	@Test
	void testMultiplos() {
		int m = counter.multiplos(500,250);
		assertEquals(m, 1000);
		m = counter.multiplos(3,9);
		assertEquals(m, 999);
		m = counter.multiplos(8,9);
		assertEquals(m, 936);
		m = counter.multiplos(999,998);
		assertEquals(m, -1);
	}
}
