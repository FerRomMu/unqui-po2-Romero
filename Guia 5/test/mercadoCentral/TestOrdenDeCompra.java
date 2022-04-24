package mercadoCentral;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestOrdenDeCompra {

	OrdenDeCompra ordenJose, ordenMiguel;
	Producto esponja, pc, taza, billetera, celular;
	ProductoDeCooperativa remera, adorno;
	
	@BeforeEach
	void setUp() throws Exception {
		esponja = new Producto(5d);
		pc = new Producto(120000d);
		taza = new Producto(320d);
		billetera = new Producto(525d);
		celular = new Producto(90000d);
		remera = new ProductoDeCooperativa(1200d);
		adorno = new ProductoDeCooperativa(350d);
		
		ordenJose = new OrdenDeCompra();
		ordenMiguel = new OrdenDeCompra();
		
		ordenJose.agregarProducto(esponja).agregarProducto(remera).agregarProducto(adorno).agregarProducto(taza);
		ordenMiguel.agregarProducto(pc).agregarProducto(celular).agregarProducto(pc).agregarProducto(billetera);
	}

	@Test
	void test() {
		assertEquals(ordenJose.getTotalAPagar(),1720d,0.2d);
		assertEquals(ordenMiguel.getTotalAPagar(),330525d,0.2d);
	}

}
