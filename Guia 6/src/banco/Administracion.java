package banco;

import java.util.ArrayList;

public class Administracion {

	ArrayList<ICliente> clientes;
	
	public Administracion () {
		clientes = new ArrayList<ICliente>();
	}
	
	public Administracion addCliente(ICliente c) {
		this.clientes.add(c);
		return this;
	}

	public Integer totalDeClientes() {
		
		return this.clientes.size();
	}

}
