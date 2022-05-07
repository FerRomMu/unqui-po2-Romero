package banco;

import java.time.LocalDate;

/**
 * Objeto encargado de guardar la información principal de un cliente.
 * @author fercho
 *
 */
public class Cliente implements ICliente{

	String nombre, apellido, domicilio;
	LocalDate fecNac;
	double sueldo;
	
	/**
	 * Constructor de Cliente.
	 * @param n recibe el nombre
	 * @param a recibe el apellido
	 * @param dir recibe el domicilio
	 * @param f recibe la fecha de nacimiento
	 * @param s recibe el sueldo neto actual
	 */
	public Cliente(String n, String a, String dir, LocalDate f, double s) {
		this.nombre = n;
		this.apellido = a;
		this.setDireccion(dir);
		this.fecNac = f;
		this.setSueldo(s);
	}
	
	/**
	 * Devuelve el nombre completo del cliente con el siguiente
	 * formato: "Apellido, Nombre".
	 * @return un String que es el nombre completo del cliente.
	 */
	public String getName() {
		return  this.apellido + ", " + this.nombre;
	}
	
	/**
	 * Cambia el domicilio actual del cliente.
	 * @param dir la nueva direccion del domicilio del cliente.
	 */
	public void setDireccion(String dir) {
		this.domicilio = dir;
	}
	
	/**
	 * Devuelve el domicilio actual del cliente.
	 * @return un String con la direccion del domicilio.
	 */
	public String getDireccion() {
		return this.domicilio;
	}
	
	/**
	 * Devuelve la edad actual del cliente.
	 * Se calcula a partir del día de la fecha actual.
	 * @return un int con la edad del cliente.
	 */
	public int getEdad() {
		LocalDate nac = this.fecNac;
		LocalDate hoy = LocalDate.now();
		int e = hoy.getYear() - nac.getYear();
		if (!this.cumpliAños()) {
			e -= 1;
		}
		return e;
	}

	private boolean cumpliAños() {
		LocalDate hoy = LocalDate.now();
		return hoy.getDayOfYear() >= this.getCumpleaños();
	}

	private int getCumpleaños() {
		return this.fecNac.getDayOfYear();
	}

	/**
	 * Cambia el valor del sueldo neto actual
	 * del cliente.
	 * @param s el nuevo valor de sueldo neto.
	 */
	public void setSueldo(double s) {
		this.sueldo = s;
	}

	/**
	 * Devuelve el sueldo neto actual del cliente.
	 * @return un double que es el sueldo neto del cliente.
	 */
	public double getSueldoNeto() {
		return this.sueldo;
	}
	
	/**
	 * Devuelve el sueldo neto anualizado.
	 * @return un double que es el sueldo neto anualizado del cliente.
	 */
	public double getSueldoAnual() {
		return this.getSueldoNeto() * 12;
	}

}
