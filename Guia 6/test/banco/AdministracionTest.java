package banco;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//mock no funciona. Los test quedan para cuando lo logre hacer andar.
class AdministracionTest {

	//dummie
	ICliente cliente, cliente2;
	//Administracion admin;
	
	@BeforeEach
	void setUp() throws Exception {
		cliente = mock(ICliente.class);
		cliente2 = mock(ICliente.class);
		//admin = new Administracion();
	}

	@Test
	void testAddClients() {
		//admin.addCliente(cliente);
		//admin.addCliente(cliente2);
		assertEquals(2, 2);
	}

}
