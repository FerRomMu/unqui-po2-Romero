package banco;

import java.util.ArrayList;

/**
 * Se encarga de registrar clientes nuevos.
 * @author fercho
 *
 */
public class Administracion {

	ArrayList<ICliente> clientes;
	
	/**
	 * Constructor. Inicializa el array de clientes.
	 */
	public Administracion () {
		clientes = new ArrayList<ICliente>();
	}
	
	/**
	 * Agrega un cliente nuevo.
	 * Precondición: El cliente no debe estar agregado
	 * previamente.
	 * @param c un cliente nuevo.
	 * @return la administracion.
	 */
	public Administracion addCliente(ICliente c) {
		this.clientes.add(c);
		return this;
	}

	/**
	 * Devuelve un cliente.
	 * @param i el indice del cliente.
	 * @return El cliente con el indice dado.
	 */
	public ICliente getCliente(int i) {
		return clientes.get(i);
	}
	
}
