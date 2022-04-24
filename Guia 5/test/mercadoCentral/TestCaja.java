package mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaja {

	Stock stock;
	OrdenDeCompra ordenJose, ordenMiguel;
	Producto esponja, pc, taza;
	ProductoDeCooperativa adorno;
	Caja caja;
	
	@BeforeEach
	void setUp() throws Exception {
		esponja = new Producto(5d);
		pc = new Producto(120000d);
		taza = new Producto(320d);
		adorno = new ProductoDeCooperativa(350d);
		
		ordenJose = new OrdenDeCompra();
		ordenMiguel = new OrdenDeCompra();
		
		stock = new Stock();
		caja = new Caja(stock);
		
		stock.modificarStockDe(esponja, 2);
		stock.modificarStockDe(pc, 1);
		stock.modificarStockDe(adorno, 5);
		stock.modificarStockDe(taza, 1);
	}

	@Test
	void test() {
		caja.registrarProducto(pc, ordenJose);
		caja.registrarProducto(pc, ordenJose);
		assertEquals(caja.montoAPagarDe(ordenJose), 120000);
		caja.registrarProducto(esponja, ordenMiguel);
		caja.registrarProducto(taza, ordenMiguel);
		caja.registrarProducto(adorno, ordenMiguel);
		assertEquals(caja.montoAPagarDe(ordenMiguel), 640);
		assertTrue(stock.hayStockDe(adorno));
		assertFalse(stock.hayStockDe(taza));
	}

}