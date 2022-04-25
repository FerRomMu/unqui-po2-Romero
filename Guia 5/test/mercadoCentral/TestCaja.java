package mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaja {

	Stock stock;
	OrdenDeCompra ordenJose, ordenMiguel;
	Producto esponja, pc, taza;
	ProductoDeCooperativa adorno;
	Servicio uber;
	Impuesto alumbrado, iva;
	Agencia municipio, afip;
	Caja caja;
	
	@BeforeEach
	void setUp() throws Exception {
		esponja = new Producto(5d);
		pc = new Producto(120000d);
		taza = new Producto(320d);
		adorno = new ProductoDeCooperativa(350d);
		
		uber = new Servicio(500d,5);
		
		alumbrado = new Impuesto(municipio, 1200d);
		iva = new Impuesto(afip, 23500d);
		
		stock = new Stock();
		caja = new Caja(stock);
		
		stock.modificarStockDe(esponja, 2);
		stock.modificarStockDe(pc, 1);
		stock.modificarStockDe(adorno, 5);
		stock.modificarStockDe(taza, 1);
		
		caja.nuevaOrden().nuevaOrden();
	}

	@Test
	void test() {
		ordenJose = caja.getOrdenN(0);
		ordenMiguel = caja.getOrdenN(1);
		caja.registrarProducto(pc, ordenJose);
		caja.registrarProducto(pc, ordenJose);
		caja.registrarImpuesto(alumbrado, ordenJose);
		caja.registrarServicio(uber, ordenJose);
		assertEquals(caja.montoAPagarDe(ordenJose), 123700);
		caja.registrarProducto(esponja, ordenMiguel);
		caja.registrarProducto(taza, ordenMiguel);
		caja.registrarProducto(adorno, ordenMiguel);
		caja.registrarImpuesto(iva, ordenMiguel);
		assertEquals(caja.montoAPagarDe(ordenMiguel), 24140);
		assertTrue(stock.hayStockDe(adorno));
		assertFalse(stock.hayStockDe(taza));
	}

}