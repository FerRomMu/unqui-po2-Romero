package mercadoCentral;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestOrdenDeCompra {

	OrdenDeCompra ordenJose, ordenMiguel;
	Producto esponja, pc, taza, billetera, celular;
	ProductoDeCooperativa remera, adorno;
	Stock stock;
	Servicio uber;
	Impuesto alumbrado, iva;
	Agencia municipio, afip;
	
	@BeforeEach
	void setUp() throws Exception {
		stock = new Stock();
		
		municipio = new AgenciaParaTest();
		afip = new AgenciaParaTest();
		
		esponja = new Producto(5d, stock);
		pc = new Producto(120000d, stock);
		taza = new Producto(320d, stock);
		billetera = new Producto(525d, stock);
		celular = new Producto(90000d, stock);
		remera = new ProductoDeCooperativa(1200d, stock);
		adorno = new ProductoDeCooperativa(350d, stock);
		
		uber = new Servicio(500d,5);
		
		alumbrado = new Impuesto(municipio, 1200d);
		iva = new Impuesto(afip, 23500d);
		
		ordenJose = new OrdenDeCompra();
		ordenMiguel = new OrdenDeCompra();
		
		stock.modificarStockDe(esponja, 1);
		stock.modificarStockDe(remera, 5);
		stock.modificarStockDe(pc, 2);
		stock.modificarStockDe(adorno, 5);
		stock.modificarStockDe(celular, 5);
		stock.modificarStockDe(billetera, 5);
		stock.modificarStockDe(taza, 1);
		
		ordenJose.registrarUtilidad(esponja).registrarUtilidad(remera).registrarUtilidad(adorno).registrarUtilidad(taza).registrarUtilidad(uber).registrarUtilidad(alumbrado);
		ordenMiguel.registrarUtilidad(pc).registrarUtilidad(celular).registrarUtilidad(pc).registrarUtilidad(billetera).registrarUtilidad(iva);
	}

	@Test
	void test() {
		assertEquals(ordenJose.montoAPagar(),5420d,0.2d);
		assertEquals(ordenMiguel.montoAPagar(),354025d,0.2d);
	}

}
