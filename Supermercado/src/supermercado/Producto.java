package supermercado;

public class Producto {

	String nombre;
	double precio;
	boolean esCuidado = false;
	
	public Producto(String nombre, double precio, boolean cuidado) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setCuidado(cuidado);
	}

	void setCuidado(boolean cuidado) {
		this.esCuidado = cuidado;
	}

	void setPrecio(double precio) {
		this.precio = precio;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Producto(String n, double p) {
		this.setPrecio(p);
		this.setNombre(n);
	}

	public String getNombre() {
		return this.nombre;
	}

	public Double getPrecio() {
		return this.precio;
	}

	public boolean esPrecioCuidado() {
		return this.esCuidado;
	}

	public void aumentarPrecio(double d) {
		this.setPrecio(this.getPrecio() + d);
	}

}
