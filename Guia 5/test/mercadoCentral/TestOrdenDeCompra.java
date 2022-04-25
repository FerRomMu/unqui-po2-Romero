package mercadoCentral;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestOrdenDeCompra {

	OrdenDeCompra ordenJose, ordenMiguel;
	Producto esponja, pc, taza, billetera, celular;
	ProductoDeCooperativa remera, adorno;
	Servicio uber;
	Impuesto alumbrado, iva;
	Agencia municipio, afip;
	
	@BeforeEach
	void setUp() throws Exception {
		esponja = new Producto(5d);
		pc = new Producto(120000d);
		taza = new Producto(320d);
		billetera = new Producto(525d);
		celular = new Producto(90000d);
		remera = new ProductoDeCooperativa(1200d);
		adorno = new ProductoDeCooperativa(350d);
		
		uber = new Servicio(500d,5);
		
		alumbrado = new Impuesto(municipio, 1200d);
		iva = new Impuesto(afip, 23500d);
		
		ordenJose = new OrdenDeCompra();
		ordenMiguel = new OrdenDeCompra();
		
		ordenJose.agregarUtilidad(esponja).agregarUtilidad(remera).agregarUtilidad(adorno).agregarUtilidad(taza).agregarUtilidad(uber).agregarUtilidad(alumbrado);
		ordenMiguel.agregarUtilidad(pc).agregarUtilidad(celular).agregarUtilidad(pc).agregarUtilidad(billetera).agregarUtilidad(iva);
	}

	@Test
	void test() {
		assertEquals(ordenJose.getTotalAPagar(),5420d,0.2d);
		assertEquals(ordenMiguel.getTotalAPagar(),354025d,0.2d);
	}

}
